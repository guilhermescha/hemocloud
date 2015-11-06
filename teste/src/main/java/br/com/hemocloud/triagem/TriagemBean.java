package br.com.hemocloud.triagem;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import br.com.hemocloud.paciente.Paciente;
import br.com.hemocloud.paciente.PacienteDAO;
import br.com.hemocloud.paciente.PacienteRN;
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
	
	public void gerar() {
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		Integer quantidadeTriagens = Integer.parseInt(request.getParameter("quantidadeTriagens"));
		Random gerador = new Random();
		String[] listaTempo = {"dias","semanas","meses","anos"};
		String[] listaSexo = {"M","F"};
		if (quantidadeTriagens != 0 || quantidadeTriagens != null) {
			TriagemRN triagemRN = new TriagemRN();
			PacienteRN pacienteRN = new PacienteRN();
			int quantidadePacientes = pacienteRN.contar();
			for (int i = 0; i < quantidadeTriagens; i++) {
				this.triagem = new Triagem();
				while (this.triagem.getPaciente() == null || !this.triagem.getPaciente().isAtivo())
					this.triagem.setPaciente(pacienteRN.carregar(gerador.nextInt(quantidadePacientes)));
				this.triagem.setDataCadastro(new Date());
				this.triagem.setCampo001(gerador.nextBoolean());
				this.triagem.setCampo002(this.triagem.isCampo001() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo003(this.triagem.isCampo001() ? gerador.nextBoolean() : false);
				this.triagem.setCampo004(this.triagem.isCampo003() ? "Teste" : "");
				this.triagem.setCampo005(this.triagem.isCampo001() ? gerador.nextBoolean() : false);
				this.triagem.setCampo006(this.triagem.isCampo005() ? "Teste" : "");
				this.triagem.setCampo007(gerador.nextBoolean());
				this.triagem.setCampo008(this.triagem.isCampo007() ? "Teste" : "");
				this.triagem.setCampo009(gerador.nextBoolean());
				this.triagem.setCampo010(this.triagem.isCampo009() ? "Teste" : "");
				this.triagem.setCampo011(this.triagem.isCampo009() ? "Teste" : "");
				this.triagem.setCampo012(gerador.nextBoolean());
				this.triagem.setCampo013(gerador.nextBoolean());
				this.triagem.setCampo014(gerador.nextBoolean());
				this.triagem.setCampo015(gerador.nextBoolean());
				this.triagem.setCampo016(this.triagem.isCampo015() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo017(gerarPeriodo(gerador, listaTempo));
				this.triagem.setCampo018("Teste");
				this.triagem.setCampo019("Teste");
				this.triagem.setCampo020(gerador.nextBoolean());
				this.triagem.setCampo021(this.triagem.isCampo020() ? "Teste" : "");
				this.triagem.setCampo022(this.triagem.isCampo020() ? "Teste" : "");
				this.triagem.setCampo023(gerador.nextBoolean());
				this.triagem.setCampo024(gerador.nextBoolean());
				this.triagem.setCampo025(gerador.nextBoolean());
				this.triagem.setCampo026(gerador.nextBoolean());
				this.triagem.setCampo027(gerador.nextBoolean());
				this.triagem.setCampo028(gerarPeriodo(gerador, listaTempo));
				this.triagem.setCampo029(gerador.nextBoolean());
				this.triagem.setCampo030(this.triagem.isCampo029() ? "Teste" : "");
				this.triagem.setCampo031(gerador.nextBoolean());
				this.triagem.setCampo032(this.triagem.isCampo031() ? "Teste" : "");
				this.triagem.setCampo033(this.triagem.isCampo031() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo034(this.triagem.isCampo031() ? "Teste" : "");
				this.triagem.setCampo035(gerador.nextBoolean());
				this.triagem.setCampo036(this.triagem.isCampo035() ? "Teste" : "");
				this.triagem.setCampo037(gerador.nextBoolean());
				this.triagem.setCampo038(this.triagem.isCampo037() ? "Teste" : "");
				this.triagem.setCampo039(this.triagem.isCampo037() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo040(this.triagem.isCampo037() ? gerador.nextBoolean() : false);
				this.triagem.setCampo041(this.triagem.isCampo037() ? "Teste" : "");
				this.triagem.setCampo042(gerador.nextBoolean());
				this.triagem.setCampo043(this.triagem.isCampo042() ? "Teste" : "");
				this.triagem.setCampo044(gerador.nextBoolean());
				this.triagem.setCampo045(this.triagem.isCampo044() ? "Teste" : "");
				this.triagem.setCampo046(gerador.nextBoolean());
				this.triagem.setCampo047(this.triagem.isCampo046() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo048(this.triagem.isCampo046() ? "Teste" : "");
				this.triagem.setCampo049(this.triagem.isCampo046() ? gerador.nextBoolean() : false);
				this.triagem.setCampo050(this.triagem.isCampo046() ? gerador.nextBoolean() : false);
				this.triagem.setCampo051(gerador.nextBoolean());
				this.triagem.setCampo052(this.triagem.isCampo051() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo053(gerador.nextBoolean());
				this.triagem.setCampo054(this.triagem.isCampo053() ? "Teste" : "");
				this.triagem.setCampo055(gerador.nextBoolean());
				this.triagem.setCampo056(gerador.nextBoolean());
				this.triagem.setCampo057(this.triagem.isCampo056() ? "Teste" : "");
				this.triagem.setCampo058(gerador.nextBoolean());
				this.triagem.setCampo059(gerador.nextBoolean());
				this.triagem.setCampo060(gerador.nextBoolean());
				this.triagem.setCampo061(gerador.nextBoolean());
				this.triagem.setCampo062(gerador.nextBoolean());
				this.triagem.setCampo063(this.triagem.isCampo062() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo064(this.triagem.isCampo062() ? "Teste" : "");
				this.triagem.setCampo065(gerador.nextBoolean());
				this.triagem.setCampo066(this.triagem.isCampo065() ? "Teste" : "");
				this.triagem.setCampo067(this.triagem.isCampo065() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo068(gerador.nextBoolean());
				this.triagem.setCampo069(this.triagem.isCampo068() ? "Teste" : "");
				this.triagem.setCampo070(gerador.nextBoolean());
				this.triagem.setCampo071(gerador.nextBoolean());
				this.triagem.setCampo072(gerador.nextBoolean());
				this.triagem.setCampo073(gerador.nextBoolean());
				this.triagem.setCampo074(this.triagem.isCampo073() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo075(this.triagem.isCampo073() ? gerador.nextBoolean() : false);
				this.triagem.setCampo076(gerador.nextBoolean());
				this.triagem.setCampo077(this.triagem.isCampo076() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo078(this.triagem.isCampo076() ? "Teste" : "");
				this.triagem.setCampo079(gerador.nextBoolean());
				this.triagem.setCampo080(this.triagem.isCampo079() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo081(this.triagem.isCampo079() ? gerador.nextBoolean() : false);
				this.triagem.setCampo082(gerador.nextBoolean());
				this.triagem.setCampo083(this.triagem.isCampo082() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo084(gerador.nextBoolean());
				this.triagem.setCampo085(this.triagem.isCampo084() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo086(this.triagem.isCampo084() ? gerador.nextBoolean() : false);
				this.triagem.setCampo087(gerador.nextBoolean());
				this.triagem.setCampo088(this.triagem.isCampo087() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo089(gerador.nextBoolean());
				this.triagem.setCampo090(gerador.nextBoolean());
				this.triagem.setCampo091(gerador.nextBoolean());
				this.triagem.setCampo092(this.triagem.isCampo091() ? "Teste" : "");
				this.triagem.setCampo093(this.triagem.isCampo091() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo094(this.triagem.isCampo091() ? "Teste" : "");
				this.triagem.setCampo095(gerador.nextBoolean());
				this.triagem.setCampo096(this.triagem.isCampo095() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo097(gerador.nextBoolean());
				this.triagem.setCampo098(gerador.nextBoolean());
				this.triagem.setCampo099(gerador.nextBoolean());
				this.triagem.setCampo100(this.triagem.isCampo099() ? "Teste" : "");
				this.triagem.setCampo101("Teste");
				this.triagem.setCampo102(gerador.nextBoolean());
				this.triagem.setCampo103(this.triagem.isCampo102() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo104(gerador.nextBoolean());
				this.triagem.setCampo105(this.triagem.isCampo104() ? "Teste" : "");
				this.triagem.setCampo106(this.triagem.isCampo104() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo107(gerador.nextBoolean());
				this.triagem.setCampo108(this.triagem.isCampo107() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo109(gerador.nextBoolean());
				this.triagem.setCampo110(this.triagem.isCampo109() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo111(gerador.nextBoolean());
				this.triagem.setCampo112(this.triagem.isCampo111() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo113(gerador.nextBoolean());
				this.triagem.setCampo114(this.triagem.isCampo113() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo115(gerador.nextBoolean());
				this.triagem.setCampo116(this.triagem.isCampo115() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo117(gerador.nextBoolean());
				this.triagem.setCampo118(this.triagem.isCampo117() ? gerarPeriodo(gerador, listaTempo) : "");
				this.triagem.setCampo119(gerador.nextBoolean());
				this.triagem.setCampo120(this.triagem.isCampo119() ? "Teste" : "");

				System.out.print(String.valueOf(i) + " - ");
				triagemRN.salvar(this.triagem);
			}
		}
	}
	
	private String gerarPeriodo(Random gerador, String[] listaTempo) {
		return String.valueOf(gerador.nextInt(10)+1) + " " + listaTempo[gerador.nextInt(listaTempo.length)];
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
