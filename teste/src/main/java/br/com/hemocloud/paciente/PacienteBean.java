package br.com.hemocloud.paciente;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import br.com.hemocloud.triagem.Triagem;
import br.com.hemocloud.triagem.TriagemRN;
import br.com.hemocloud.usuario.Usuario;
import br.com.hemocloud.usuario.UsuarioRN;

@ManagedBean(name="pacienteBean")
@RequestScoped
public class PacienteBean {
	
	private Paciente paciente = new Paciente();
	private List<Paciente> lista;
	private String destinosalvar;
	private boolean somentePesquisa;
	
	public String novo() {
		this.destinosalvar = "pacientes";
		this.paciente = new Paciente();
		this.paciente.setAtivo(true);
		return "pacientes";
	}
	
	public String editar() {
		this.setSomentePesquisa(false);
		return "paciente";
	}
	
	public String visualizar() {
		this.setSomentePesquisa(true);
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
		FacesContext context = FacesContext.getCurrentInstance();
		TriagemRN triagemRN = new TriagemRN();
		if (triagemRN.existePorPaciente(this.paciente.getCodigo())) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Paciente vinculado a triagens. Não pode ser excluído!",""));
			return null;
		}
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
	
	public void gerar() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpledateformat = new SimpleDateFormat("DDMMYYYY_HHMMSS_");
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		Integer quantidadePacientes = Integer.parseInt(request.getParameter("quantidadePacientes"));
		Random gerador = new Random();
		String[] listaSexo = {"M","F"};
		String[] listaTipoSanguineo = {"A-","A+","B+","B-","AB+","AB-","O+","O-"};
		String[] listaEstados = {"AC","AL","AM","AP","BA","CE","DF","ES","GO","MA","MG","MS","MT","PA","PB","PE","PI","PR","RJ","RN","RO","RR","RS","SC","SE","SP","TO"};
		if (quantidadePacientes != 0 || quantidadePacientes != null) {
			PacienteRN pacienteRN = new PacienteRN();
			for (int i = 0; i < quantidadePacientes; i++) {
				this.paciente = new Paciente();
				this.paciente.setNome("Paciente_" + simpledateformat.format(calendar.getTime()) + String.valueOf(i));
				this.paciente.setBairro("Bairro teste " + String.valueOf(i));
				this.paciente.setRua("Rua teste " + String.valueOf(i));
				this.paciente.setRg(gerador.nextInt(888888888) + 1111111111);
				this.paciente.setCpf(gerador.nextInt(999999990) + 191);
				this.paciente.setSexo(listaSexo[gerador.nextInt(listaSexo.length)].charAt(0));
				this.paciente.setTipoSanguineo(listaTipoSanguineo[gerador.nextInt(listaTipoSanguineo.length)]);
				this.paciente.setCep(gerador.nextInt(9999999)+90000000);
				this.paciente.setTelefone(gerador.nextInt(9999999)+30000000);
				this.paciente.setCelular(gerador.nextInt(9999999)+90000000);
				this.paciente.setEstado(listaEstados[gerador.nextInt(listaEstados.length)]);
				this.paciente.setNascimento(Date.valueOf(LocalDate.of(gerador.nextInt(50)+1950, gerador.nextInt(11)+1, gerador.nextInt(27)+1)));
				this.paciente.setAtivo(gerador.nextBoolean());
				pacienteRN.salvar(this.paciente);
			}
		}
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

	public boolean isSomentePesquisa() {
		return somentePesquisa;
	}

	public void setSomentePesquisa(boolean somentePesquisa) {
		this.somentePesquisa = somentePesquisa;
	}
	
}
