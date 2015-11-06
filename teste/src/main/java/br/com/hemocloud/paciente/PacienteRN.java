package br.com.hemocloud.paciente;

import java.util.List;
import br.com.hemocloud.util.DAOFactory;

public class PacienteRN {
	private PacienteDAO	pacienteDAO; 
	public PacienteRN() { 
		this.pacienteDAO = DAOFactory.criarPacienteDAO();
	}
	public Paciente carregar(String codigo) { 
		return this.pacienteDAO.carregar(codigo);
	}
	public Paciente buscarPorRg(Integer rg) { 
		return this.pacienteDAO.buscarPorRg(rg);
	}
	public Paciente buscarPorCpf(Integer cpf) { 
		return this.pacienteDAO.buscarPorCpf(cpf);
	}
	public Paciente buscarPorSexo(String sexo) { 
		return this.pacienteDAO.buscarPorSexo(sexo);
	}
	public void salvar(Paciente paciente) { 
		String codigo = paciente.getCodigo();
		if (codigo == null || codigo.isEmpty()) {
			this.pacienteDAO.salvar(paciente);
		} else {
			this.pacienteDAO.atualizar(paciente);
		}
	}
	public void excluir(Paciente paciente) { 
		this.pacienteDAO.excluir(paciente);
	}
	public List<Paciente> listar() { 
		return this.pacienteDAO.listar();
	}
}