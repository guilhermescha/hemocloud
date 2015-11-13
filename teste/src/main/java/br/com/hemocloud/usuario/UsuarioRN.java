package br.com.hemocloud.usuario;

import java.util.List;

import org.springframework.dao.OptimisticLockingFailureException;

import br.com.hemocloud.util.DAOFactory;

public class UsuarioRN {
	private UsuarioDAO	usuarioDAO; 
	public UsuarioRN() { 
		this.usuarioDAO = DAOFactory.criarUsuarioDAO();
	}
	public Usuario carregar(Integer codigo) { 
		return this.usuarioDAO.carregar(codigo);
	}
	public Usuario buscarPorEmail(String email) { 
		return this.usuarioDAO.buscarPorEmail(email);
	}
	public void salvar(Usuario usuario) throws OptimisticLockingFailureException { 		// Certifica-se de que o usuário gravado tenha permissão padrão de usuário
		if (!usuario.getPermissao().contains("ROLE_USUARIO")) usuario.getPermissao().add("ROLE_USUARIO");
		// Se não existe nenhum usuário na base de dados, o primeiro cadastrado será o administrador
		if (listar().isEmpty()) usuario.getPermissao().add("ROLE_ADMINISTRADOR");
		String codigo = usuario.getCodigo();
		if (codigo == null || codigo.isEmpty()) {
			usuario.getPermissao().add("ROLE_USUARIO");
			this.usuarioDAO.salvar(usuario);
		} else {
			this.usuarioDAO.atualizar(usuario);
		}
	}
	public void excluir(Usuario usuario) { 
		this.usuarioDAO.excluir(usuario);
	}
	public List<Usuario> listar() { 
		return this.usuarioDAO.listar();
	}
}