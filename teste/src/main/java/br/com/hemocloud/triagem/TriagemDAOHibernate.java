package br.com.hemocloud.triagem;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

import br.com.hemocloud.util.DAOException;

public class TriagemDAOHibernate implements TriagemDAO {
	private Session session;
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Triagem triagem) {
		this.session.save(triagem);

	}

	@Override
	public void atualizar(Triagem triagem) {
		this.session.update(triagem);

	}

	@Override
	public void excluir(Triagem triagem) {
		this.session.delete(triagem);
		this.session.flush();

	}

	@Override
	public Triagem carregar(Integer codigo) {
		return (Triagem) this.session.get(Triagem.class, codigo);
	}
	
	@Override
	public List<Triagem> listar() {
		return this.session.createCriteria(Triagem.class).list();
	}

}
