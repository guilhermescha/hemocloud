package br.com.hemocloud.triagem;

import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import br.com.hemocloud.paciente.PacienteDAO;
import br.com.hemocloud.util.DAOFactory;

@ManagedBean(name="triagemBean")
@RequestScoped
public class TriagemBean {
	
	private Triagem triagem = new Triagem();
	private List<Triagem> lista;
	private String destinosalvar;
	
	public String novo() {
		this.destinosalvar = "triagems";
		this.triagem = new Triagem();
		return "triagems";
	}
	
	public String editar() {
		return "triagems";
	}
	
	public String salvar() {
		this.buscaPaciente();
		if (this.triagem.getCodigo() == null || this.triagem.getCodigo() == 0) {
			this.triagem.setDataCadastro(new Date());
		}
		TriagemRN triagemRN = new TriagemRN();
		triagemRN.salvar(this.triagem);
		
		return this.destinosalvar;
	}
	
	public String excluir() {
		TriagemRN triagemRN = new TriagemRN();
		triagemRN.excluir(this.triagem);
		this.lista = null;
		return null;
	}
	
	public List<Triagem> getLista() {
		if (this.lista == null) {
			TriagemRN triagemRN = new TriagemRN();
			this.lista = triagemRN.listar();
		}
		return this.lista;
	}

	public Triagem getTriagem() {
		return triagem;
	}
	public void setTriagem(Triagem triagem) {
		this.triagem = triagem;
	}

	public String getDestinosalvar() {
		return destinosalvar;
	}

	public void setDestinosalvar(String destinosalvar) {
		this.destinosalvar = destinosalvar;
	}
	
	public void buscaPaciente() {
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		String inputNomePaciente = request.getParameter("inputNomePaciente");
		if (inputNomePaciente == "" || inputNomePaciente == null) return;
		PacienteDAO pacienteDAO = DAOFactory.criarPacienteDAO();
		this.triagem.setPaciente(pacienteDAO.buscarPorRg(Integer.parseInt(inputNomePaciente)));
	}
	
}
