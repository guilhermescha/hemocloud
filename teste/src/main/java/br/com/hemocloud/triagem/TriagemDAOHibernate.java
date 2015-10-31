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
		TransactionUtil.transactionEnd("Tempo de inserção da Triagem");

	}

	@Override
	public void atualizar(Triagem triagem) {
		TransactionUtil.transactionStart();
		this.session.update(triagem);
		TransactionUtil.transactionEnd("Tempo de atualização da Triagem");

	}

	@Override
	public void excluir(Triagem triagem) {
		TransactionUtil.transactionStart();
		this.session.delete(triagem);
		this.session.flush();
		TransactionUtil.transactionEnd("Tempo de exclusão da Triagem");

	}

	@Override
	public Triagem carregar(Integer codigo) {
		TransactionUtil.transactionStart();
		Triagem triagem = (Triagem) this.session.get(Triagem.class, codigo);
		TransactionUtil.transactionEnd("Tempo de busca da Triagem");
		return triagem;
	}
	
	@Override
	public List<Triagem> listar() {
		TransactionUtil.transactionStart();
		List<Triagem> lista = this.session.createCriteria(Triagem.class).list();
		TransactionUtil.transactionEnd("Tempo de carregamento da lista de triagens");
		return lista;
	}

}
