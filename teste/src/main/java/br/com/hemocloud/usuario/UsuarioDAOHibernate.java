package br.com.hemocloud.usuario;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

import br.com.hemocloud.util.DAOException;
import br.com.hemocloud.util.TransactionUtil;

public class UsuarioDAOHibernate implements UsuarioDAO {
	private Session session;
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Usuario usuario) {
		TransactionUtil.transactionStart();
		this.session.save(usuario);
		TransactionUtil.transactionEnd("Tempo de inserção do usuário");

	}

	@Override
	public void atualizar(Usuario usuario) {
		if (usuario.getPermissao() == null || usuario.getPermissao().size() == 0) {
			Usuario usuarioPermissao = this.carregar(usuario.getCodigo());
			usuario.setPermissao(usuarioPermissao.getPermissao());
			this.session.evict(usuarioPermissao);
		}
		TransactionUtil.transactionStart();
		this.session.update(usuario);
		TransactionUtil.transactionEnd("Tempo de atualização do usuário");

	}

	@Override
	public void excluir(Usuario usuario) {
		TransactionUtil.transactionStart();
		this.session.delete(usuario);
		this.session.flush();
		TransactionUtil.transactionEnd("Tempo de exclusão do usuário");

	}

	@Override
	public Usuario carregar(Integer codigo) {
		TransactionUtil.transactionStart();
		Usuario usuario = (Usuario) this.session.get(Usuario.class, codigo);
		TransactionUtil.transactionEnd("Tempo de busca de usuário");
		return usuario;
	}

	@Override
	public Usuario buscarPorEmail(String email) {
		TransactionUtil.transactionStart();
		String sql = "select u from Usuario u where u.email = :email";
		Query consulta = this.session.createQuery(sql);
		consulta.setString("email", email);
		TransactionUtil.transactionEnd("Tempo de busca de usuário por email");
		return (Usuario) consulta.uniqueResult();
	}

	@Override
	public List<Usuario> listar() {
		TransactionUtil.transactionStart();
		List<Usuario> lista = this.session.createCriteria(Usuario.class).list();
		TransactionUtil.transactionEnd("Tempo de carregamento da lista de usuários");
		return lista;
	}

}
