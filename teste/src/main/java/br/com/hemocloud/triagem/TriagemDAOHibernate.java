package br.com.hemocloud.triagem;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import br.com.hemocloud.util.TransactionUtil;

public class TriagemDAOHibernate implements TriagemDAO {
	private MongoOperations mongoOps;
	private static final String TRIAGEM_COLLECTION = "Triagem";

	public TriagemDAOHibernate(MongoOperations mongoOps) {
		this.mongoOps = mongoOps;
	}

	@Override
	public void salvar(Triagem triagem) {
		TransactionUtil.transactionStart();
		this.mongoOps.insert(triagem, TRIAGEM_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de inserção da Triagem");

	}

	@Override
	public void atualizar(Triagem triagem) {
		TransactionUtil.transactionStart();
		this.mongoOps.save(triagem, TRIAGEM_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de atualização da Triagem");

	}

	@Override
	public void excluir(Triagem triagem) {
		TransactionUtil.transactionStart();
		this.mongoOps.remove(triagem, TRIAGEM_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de exclusão da Triagem");

	}

	@Override
	public Triagem carregar(Integer codigo) {
		TransactionUtil.transactionStart();
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(codigo));
		Triagem triagem = (Triagem) mongoOps.findOne(query, Triagem.class, TRIAGEM_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de busca da Triagem");
		return triagem;
	}

	@Override
	public boolean existePorPaciente(Integer codigo) {
//		TransactionUtil.transactionStart();
//		String sql = "select u from Triagem u where u.paciente = :paciente_codigo";
//		Query consulta = this.session.createQuery(sql);
//		consulta.setInteger("paciente_codigo", codigo);
//		Triagem triagem;
//		try {
//			triagem = (Triagem) consulta.uniqueResult();
//		} catch (NonUniqueResultException  n) {
//			TransactionUtil.transactionEnd("Tempo de busca de existência de Triagem por paciente");
//			return true;
//		}
//		TransactionUtil.transactionEnd("Tempo de busca de existência de Triagem por paciente:");
//		return (triagem != null);
		return false;
	}
	
	@Override
	public List<Triagem> listar() {
		TransactionUtil.transactionStart();
		List<Triagem> lista = this.mongoOps.findAll(Triagem.class, TRIAGEM_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de carregamento da lista de triagens");
		return lista;
	}

}
