package br.com.hemocloud.paciente;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="pacienteBean")
@RequestScoped
public class PacienteBean {
	
	private Paciente paciente = new Paciente();
	private List<Paciente> lista;
	private String destinosalvar;
	
	public String novo() {
		this.destinosalvar = "/publico/mostrapaciente";
		this.paciente = new Paciente();
		this.paciente.setAtivo(true);
		return "paciente";
	}
	
	public String editar() {
		return "paciente";
	}
	
	public String salvar() {
		if (this.paciente.getCodigo() == null || this.paciente.getCodigo() == 0) {
			this.paciente.setAtivo(true);
		}
		PacienteRN pacienteRN = new PacienteRN();
		pacienteRN.salvar(this.paciente);
		
		return this.destinosalvar;
	}
	
	public String excluir() {
		PacienteRN pacienteRN = new PacienteRN();
		pacienteRN.excluir(this.paciente);
		this.lista = null;
		return null;
	}
	
	public String ativar() {
		this.paciente.setAtivo(this.paciente.isAtivo() ? false : true);
		PacienteRN pacienteRN = new PacienteRN();
		pacienteRN.salvar(this.paciente);
		return null;
	}
	
	public List<Paciente> getLista() {
		if (this.lista == null) {
			PacienteRN pacienteRN = new PacienteRN();
			this.lista = pacienteRN.listar();
		}
		return this.lista;
	}

	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getDestinosalvar() {
		return destinosalvar;
	}

	public void setDestinosalvar(String destinosalvar) {
		this.destinosalvar = destinosalvar;
	}
	
}
