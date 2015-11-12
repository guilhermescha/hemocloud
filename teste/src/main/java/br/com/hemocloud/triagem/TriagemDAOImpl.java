package br.com.hemocloud.triagem;

import java.util.List;

import org.hibernate.NonUniqueResultException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.StaleObjectStateException;

import br.com.hemocloud.util.TransactionUtil;

public class TriagemDAOImpl implements TriagemDAO {
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
	public void atualizar(Triagem triagem) throws StaleObjectStateException {
		TransactionUtil.transactionStart();
		this.session.merge(triagem);
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
	public boolean existePorPaciente(Integer codigo) {
		TransactionUtil.transactionStart();
		String sql = "select u from Triagem u where u.paciente = :paciente_codigo";
		Query consulta = this.session.createQuery(sql);
		consulta.setInteger("paciente_codigo", codigo);
		Triagem triagem;
		try {
			triagem = (Triagem) consulta.uniqueResult();
		} catch (NonUniqueResultException  n) {
			TransactionUtil.transactionEnd("Tempo de busca de existência de Triagem por paciente");
			return true;
		}
		TransactionUtil.transactionEnd("Tempo de busca de existência de Triagem por paciente:");
		return (triagem != null);
	}
	
	@Override
	public List<Triagem> listar() {
		TransactionUtil.transactionStart();
		List<Triagem> lista = this.session.createCriteria(Triagem.class).list();
		TransactionUtil.transactionEnd("Tempo de carregamento da lista de triagens");
		return lista;
	}

}
