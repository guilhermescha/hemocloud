package br.com.hemocloud.paciente;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

import br.com.hemocloud.util.DAOException;
import br.com.hemocloud.util.TransactionUtil;

public class PacienteDAOHibernate implements PacienteDAO {
	private Session session;
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Paciente paciente) {
		TransactionUtil.transactionStart();
		this.session.save(paciente);
		TransactionUtil.transactionEnd("Tempo de inserção do Paciente");

	}

	@Override
	public void atualizar(Paciente paciente) {
		TransactionUtil.transactionStart();
		this.session.update(paciente);
		TransactionUtil.transactionEnd("Tempo de atualização do Paciente");

	}

	@Override
	public void excluir(Paciente paciente) {
		TransactionUtil.transactionStart();
		this.session.delete(paciente);
		this.session.flush();
		TransactionUtil.transactionEnd("Tempo de exclusão do Paciente");

	}

	@Override
	public Paciente carregar(Integer codigo) {
		TransactionUtil.transactionStart();
		Paciente paciente = (Paciente) this.session.get(Paciente.class, codigo);
		TransactionUtil.transactionEnd("Tempo de busca do Paciente");
		return paciente;
	}

	@Override
	public Paciente buscarPorRg(Integer rg) {
		TransactionUtil.transactionStart();
		String sql = "select u from Paciente u where u.rg = :rg";
		Query consulta = this.session.createQuery(sql);
		consulta.setInteger("rg", rg);
		Paciente paciente =  (Paciente) consulta.uniqueResult();
		TransactionUtil.transactionEnd("Tempo de busca do Paciente por RG");
		return paciente;
	}

	@Override
	public Paciente buscarPorCpf(Integer cpf) {
		TransactionUtil.transactionStart();
		String sql = "select u from Paciente u where u.cpf = :cpf";
		Query consulta = this.session.createQuery(sql);
		consulta.setInteger("rg", cpf);
		Paciente paciente =  (Paciente) consulta.uniqueResult();
		TransactionUtil.transactionEnd("Tempo de busca do Paciente por CPF");
		return paciente;
	}

	@Override
	public Paciente buscarPorNome(String nome) {
		TransactionUtil.transactionStart();
		String sql = "select u from Paciente u where u.nome = :nome";
		Query consulta = this.session.createQuery(sql);
		consulta.setString("nome", nome);
		Paciente paciente =  (Paciente) consulta.uniqueResult();
		TransactionUtil.transactionEnd("Tempo de busca do Paciente por nome");
		return paciente;
	}

	@Override
	public int quantidadeRegistros() {
		TransactionUtil.transactionStart();
		String sql = "select max(codigo) from Paciente";
		Query consulta = this.session.createQuery(sql);
		int quantidade =  (int) consulta.uniqueResult();
		TransactionUtil.transactionEnd("Tempo de busca da quantidade de pacientes");
		return quantidade;
	}
	
	@Override
	public List<Paciente> listar() {
		TransactionUtil.transactionStart();
		List<Paciente> lista = this.session.createCriteria(Paciente.class).list();
		TransactionUtil.transactionEnd("Tempo de carregamento da lista de pacientes");
		return lista;
	}

}
