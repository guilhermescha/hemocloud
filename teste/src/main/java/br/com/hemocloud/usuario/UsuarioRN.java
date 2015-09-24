package br.com.hemocloud.usuario;

import java.util.List;
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
	public void salvar(Usuario usuario) { 
		Integer codigo = usuario.getCodigo();
		if (codigo == null || codigo == 0) {
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