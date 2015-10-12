package br.com.hemocloud.paciente;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

import br.com.hemocloud.util.DAOException;

public class PacienteDAOHibernate implements PacienteDAO {
	private Session session;
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Paciente paciente) {
		this.session.save(paciente);

	}

	@Override
	public void atualizar(Paciente paciente) {
		this.session.update(paciente);

	}

	@Override
	public void excluir(Paciente paciente) {
		this.session.delete(paciente);
		this.session.flush();

	}

	@Override
	public Paciente carregar(Integer codigo) {
		return (Paciente) this.session.get(Paciente.class, codigo);
	}

	@Override
	public Paciente buscarPorRg(Integer rg) {
		String sql = "select u from Paciente u where u.rg = :rg";
		Query consulta = this.session.createQuery(sql);
		consulta.setInteger("rg", rg);
		return (Paciente) consulta.uniqueResult();
	}

	@Override
	public Paciente buscarPorCpf(Integer cpf) {
		String sql = "select u from Paciente u where u.cpf = :cpf";
		Query consulta = this.session.createQuery(sql);
		consulta.setInteger("rg", cpf);
		return (Paciente) consulta.uniqueResult();
	}

	@Override
	public Paciente buscarPorNome(String nome) {
		String sql = "select u from Paciente u where u.nome = :nome";
		Query consulta = this.session.createQuery(sql);
		consulta.setString("nome", nome);
		return (Paciente) consulta.uniqueResult();
	}
	
	@Override
	public List<Paciente> listar() {
		return this.session.createCriteria(Paciente.class).list();
	}

}
