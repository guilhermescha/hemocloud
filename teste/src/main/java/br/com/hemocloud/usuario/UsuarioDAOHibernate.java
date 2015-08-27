package br.com.hemocloud.usuario;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

import br.com.hemocloud.util.DAOException;

public class UsuarioDAOHibernate implements UsuarioDAO {
	private Session session;
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Usuario usuario) {
		this.session.save(usuario);

	}

	@Override
	public void atualizar(Usuario usuario) {
		this.session.update(usuario);

	}

	@Override
	public void excluir(Usuario usuario) {
		this.session.delete(usuario);
		this.session.flush();

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
		// TODO Auto-generated method stub
		return null;
	}

}
