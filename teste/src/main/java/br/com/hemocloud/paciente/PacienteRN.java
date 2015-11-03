package br.com.hemocloud.paciente;

import java.util.List;
import br.com.hemocloud.util.DAOFactory;

public class PacienteRN {
	private PacienteDAO	pacienteDAO; 
	public PacienteRN() { 
		this.pacienteDAO = DAOFactory.criarPacienteDAO();
	}
	public Paciente carregar(Integer codigo) { 
		return this.pacienteDAO.carregar(codigo);
	}
	public Paciente buscarPorRg(Integer rg) { 
		return this.pacienteDAO.buscarPorRg(rg);
	}
	public Paciente buscarPorCpf(Integer cpf) { 
		return this.pacienteDAO.buscarPorCpf(cpf);
	}
	public void salvar(Paciente paciente) { 
		Integer codigo = paciente.getCodigo();
		if (codigo == null || codigo == 0) {
			this.pacienteDAO.salvar(paciente);
		} else {
			this.pacienteDAO.atualizar(paciente);
		}
	}
	public void excluir(Paciente paciente) { 
		this.pacienteDAO.excluir(paciente);
	}
	public int contar() { 
		return this.pacienteDAO.quantidadeRegistros();
	}
	public List<Paciente> listar() { 
		return this.pacienteDAO.listar();
	}
}