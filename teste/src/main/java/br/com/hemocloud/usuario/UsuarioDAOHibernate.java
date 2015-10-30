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
		TransactionUtil.transactionEnd("inserção");

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
		TransactionUtil.transactionEnd("atualização");

	}

	@Override
	public void excluir(Usuario usuario) {
		TransactionUtil.transactionStart();
		this.session.delete(usuario);
		this.session.flush();
		TransactionUtil.transactionEnd("exclusão");

	}

	@Override
	public Usuario carregar(Integer codigo) {
		return (Usuario) this.session.get(Usuario.class, codigo);
	}

	@Override
	public Usuario buscarPorEmail(String email) {
		String sql = "select u from Usuario u where u.email = :email";
		Query consulta = this.session.createQuery(sql);
		consulta.setString("email", email);
		return (Usuario) consulta.uniqueResult();
	}

	@Override
	public List<Usuario> listar() {
		return this.session.createCriteria(Usuario.class).list();
	}

}
