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
	
	public String visualizar() {
		return "visualizaTriagem";
	}
	
	public String salvar() {
		if (this.triagem.getCodigo() == null || this.triagem.getCodigo() == 0) {
			this.triagem.setDataCadastro(new Date());
		}
		TriagemRN triagemRN = new TriagemRN();
		// Busca dados informados para salvar no banco de dados

		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		String inputNomePaciente = request.getParameter("inputNomePaciente");
		if (inputNomePaciente == "" || inputNomePaciente == null) return "";
		PacienteDAO pacienteDAO = DAOFactory.criarPacienteDAO();
		this.triagem.setPaciente(pacienteDAO.buscarPorRg(Integer.parseInt(inputNomePaciente)));
		this.triagem.setCampo001(buscaConteudoRadioButton(request,"option0001_value"));
		this.triagem.setCampo003(buscaConteudoRadioButton(request,"option0002_value"));
		this.triagem.setCampo005(buscaConteudoRadioButton(request,"option0003_value"));
		this.triagem.setCampo007(buscaConteudoRadioButton(request,"option0004_value"));
		this.triagem.setCampo009(buscaConteudoRadioButton(request,"option0005_value"));
		this.triagem.setCampo012(buscaConteudoRadioButton(request,"option0006_value"));
		this.triagem.setCampo013(buscaConteudoRadioButton(request,"option0007_value"));
		this.triagem.setCampo014(buscaConteudoRadioButton(request,"option0008_value"));
		this.triagem.setCampo015(buscaConteudoRadioButton(request,"option0009_value"));
		this.triagem.setCampo020(buscaConteudoRadioButton(request,"option0010_value"));
		this.triagem.setCampo023(buscaConteudoRadioButton(request,"option0011_value"));
		this.triagem.setCampo024(buscaConteudoRadioButton(request,"option0012_value"));
		this.triagem.setCampo025(buscaConteudoRadioButton(request,"option0013_value"));
		this.triagem.setCampo026(buscaConteudoRadioButton(request,"option0014_value"));
		this.triagem.setCampo027(buscaConteudoRadioButton(request,"option0015_value"));
		this.triagem.setCampo029(buscaConteudoRadioButton(request,"option0016_value"));
		this.triagem.setCampo031(buscaConteudoRadioButton(request,"option0017_value"));
		this.triagem.setCampo035(buscaConteudoRadioButton(request,"option0018_value"));
		this.triagem.setCampo037(buscaConteudoRadioButton(request,"option0019_value"));
		this.triagem.setCampo040(buscaConteudoRadioButton(request,"option0020_value"));
		this.triagem.setCampo042(buscaConteudoRadioButton(request,"option0021_value"));
		this.triagem.setCampo044(buscaConteudoRadioButton(request,"option0022_value"));
		this.triagem.setCampo046(buscaConteudoRadioButton(request,"option0023_value"));
		this.triagem.setCampo049(buscaConteudoRadioButton(request,"option0024_value"));
		this.triagem.setCampo050(buscaConteudoRadioButton(request,"option0025_value"));
		this.triagem.setCampo051(buscaConteudoRadioButton(request,"option0026_value"));
		this.triagem.setCampo053(buscaConteudoRadioButton(request,"option0027_value"));
		this.triagem.setCampo055(buscaConteudoRadioButton(request,"option0028_value"));
		this.triagem.setCampo056(buscaConteudoRadioButton(request,"option0029_value"));
		this.triagem.setCampo058(buscaConteudoRadioButton(request,"option0030_value"));
		this.triagem.setCampo059(buscaConteudoRadioButton(request,"option0031_value"));
		this.triagem.setCampo060(buscaConteudoRadioButton(request,"option0032_value"));
		this.triagem.setCampo061(buscaConteudoRadioButton(request,"option0033_value"));
		this.triagem.setCampo062(buscaConteudoRadioButton(request,"option0034_value"));
		this.triagem.setCampo065(buscaConteudoRadioButton(request,"option0035_value"));
		this.triagem.setCampo068(buscaConteudoRadioButton(request,"option0036_value"));
		this.triagem.setCampo070(buscaConteudoRadioButton(request,"option0037_value"));
		this.triagem.setCampo071(buscaConteudoRadioButton(request,"option0038_value"));
		this.triagem.setCampo072(buscaConteudoRadioButton(request,"option0039_value"));
		this.triagem.setCampo073(buscaConteudoRadioButton(request,"option0040_value"));
		this.triagem.setCampo075(buscaConteudoRadioButton(request,"option0041_value"));
		this.triagem.setCampo076(buscaConteudoRadioButton(request,"option0042_value"));
		this.triagem.setCampo079(buscaConteudoRadioButton(request,"option0043_value"));
		this.triagem.setCampo081(buscaConteudoRadioButton(request,"option0044_value"));
		this.triagem.setCampo082(buscaConteudoRadioButton(request,"option0045_value"));
		this.triagem.setCampo084(buscaConteudoRadioButton(request,"option0046_value"));
		this.triagem.setCampo086(buscaConteudoRadioButton(request,"option0047_value"));
		this.triagem.setCampo087(buscaConteudoRadioButton(request,"option0048_value"));
		this.triagem.setCampo089(buscaConteudoRadioButton(request,"option0049_value"));
		this.triagem.setCampo090(buscaConteudoRadioButton(request,"option0050_value"));
		this.triagem.setCampo091(buscaConteudoRadioButton(request,"option0051_value"));
		this.triagem.setCampo095(buscaConteudoRadioButton(request,"option0052_value"));
		this.triagem.setCampo097(buscaConteudoRadioButton(request,"option0053_value"));
		this.triagem.setCampo098(buscaConteudoRadioButton(request,"option0054_value"));
		this.triagem.setCampo099(buscaConteudoRadioButton(request,"option0055_value"));
		this.triagem.setCampo102(buscaConteudoRadioButton(request,"option0056_value"));
		this.triagem.setCampo104(buscaConteudoRadioButton(request,"option0057_value"));
		this.triagem.setCampo107(buscaConteudoRadioButton(request,"option0058_value"));
		this.triagem.setCampo109(buscaConteudoRadioButton(request,"option0059_value"));
		this.triagem.setCampo111(buscaConteudoRadioButton(request,"option0060_value"));
		this.triagem.setCampo113(buscaConteudoRadioButton(request,"option0061_value"));
		this.triagem.setCampo115(buscaConteudoRadioButton(request,"option0062_value"));
		this.triagem.setCampo117(buscaConteudoRadioButton(request,"option0063_value"));
		this.triagem.setCampo119(buscaConteudoRadioButton(request,"option0064_value"));
		// Salva a triagem
		triagemRN.salvar(this.triagem);
		
		return this.destinosalvar;
	}
	
	private boolean buscaConteudoRadioButton(HttpServletRequest request, String idCampo) {
		String campo = request.getParameter(idCampo);
		if (campo == null) return false;
		return (campo).equals("1") ? true : false;
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
	
}
