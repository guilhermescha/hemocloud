package br.com.hemocloud.triagem;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

import br.com.hemocloud.util.DAOException;
import br.com.hemocloud.util.TransactionUtil;

public class TriagemDAOHibernate implements TriagemDAO {
	private Session session;
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Triagem triagem) {
		TransactionUtil.transactionStart();
		this.session.save(triagem);
		TransactionUtil.transactionEnd("inserção");

	}

	@Override
	public void atualizar(Triagem triagem) {
		TransactionUtil.transactionStart();
		this.session.update(triagem);
		TransactionUtil.transactionEnd("atualização");

	}

	@Override
	public void excluir(Triagem triagem) {
		TransactionUtil.transactionStart();
		this.session.delete(triagem);
		this.session.flush();
		TransactionUtil.transactionEnd("exclusão");

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
