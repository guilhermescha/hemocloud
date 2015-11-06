package br.com.hemocloud.paciente;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import br.com.hemocloud.util.TransactionUtil;

public class PacienteDAOHibernate implements PacienteDAO {

	private MongoOperations mongoOps;
	private static final String PACIENTE_COLLECTION = "Paciente";

	public PacienteDAOHibernate(MongoOperations mongoOps) {
		this.mongoOps = mongoOps;
	}

	@Override
	public void salvar(Paciente paciente) {
		TransactionUtil.transactionStart();
		this.mongoOps.insert(paciente, PACIENTE_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de inserção do Paciente");

	}

	@Override
	public void atualizar(Paciente paciente) {
		TransactionUtil.transactionStart();
		this.mongoOps.save(paciente, PACIENTE_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de atualização do Paciente");

	}

	@Override
	public void excluir(Paciente paciente) {
		TransactionUtil.transactionStart();
		this.mongoOps.remove(paciente, PACIENTE_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de exclusão do Paciente");
	}

	@Override
	public Paciente carregar(String codigo) {
		TransactionUtil.transactionStart();
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(codigo));
		Paciente paciente = (Paciente) mongoOps.findOne(query, Paciente.class, PACIENTE_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de busca do Paciente");
		return paciente;
	}

	@Override
	public Paciente buscarPorRg(Integer rg) {
		TransactionUtil.transactionStart();
		Query query = new Query();
		query.addCriteria(Criteria.where("rg").is(rg));
		Paciente paciente = (Paciente) mongoOps.findOne(query, Paciente.class, PACIENTE_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de busca do Paciente por RG");
		return paciente;
	}

	@Override
	public Paciente buscarPorCpf(Integer cpf) {
		TransactionUtil.transactionStart();
		Query query = new Query();
		query.addCriteria(Criteria.where("cpf").is(cpf));
		Paciente paciente = (Paciente) mongoOps.findOne(query, Paciente.class, PACIENTE_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de busca do Paciente por CPF");
		return paciente;
	}

	@Override
	public Paciente buscarPorSexo(String sexo) {
		TransactionUtil.transactionStart();
		Query query = new Query();
		query.addCriteria(Criteria.where("sexo").is(sexo));
		Paciente paciente = (Paciente) mongoOps.findOne(query, Paciente.class, PACIENTE_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de busca do Paciente por Sexo");
		return paciente;
	}

	@Override
	public Paciente buscarPorNome(String nome) {
		TransactionUtil.transactionStart();
		Query query = new Query();
		query.addCriteria(Criteria.where("nome").is(nome));
		Paciente paciente = (Paciente) mongoOps.findOne(query, Paciente.class, PACIENTE_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de busca do Paciente por nome");
		return paciente;
	}

	@Override
	public int quantidadeRegistros() {
		return 0;
	}
	
	@Override
	public List<Paciente> listar() {
		TransactionUtil.transactionStart();
		List<Paciente> lista = this.mongoOps.findAll(Paciente.class, PACIENTE_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de carregamento da lista de pacientes");
		return lista;
	}

}
