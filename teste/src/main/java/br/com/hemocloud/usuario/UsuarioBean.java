package br.com.hemocloud.usuario;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="usuarioBean")
@RequestScoped
public class UsuarioBean {
	
	private Usuario usuario = new Usuario();
	private String confirmaSenha;
	private List<Usuario> lista;
	private String destinosalvar;
	private boolean somentePesquisa;
	
	public String novo() {
		this.destinosalvar = "/publico/mostrausuario";
		this.usuario = new Usuario();
		this.usuario.setAtivo(true);
		return "usuario";
	}
	
	public String editar() {
		this.confirmaSenha = this.usuario.getSenha();
		this.setSomentePesquisa(false);
		return "usuario";
	}
	
	public String visualizar() {
		this.confirmaSenha = this.usuario.getSenha();
		this.setSomentePesquisa(true);
		return "usuario";
	}
	
	public String salvar() {
		FacesContext context = FacesContext.getCurrentInstance();
		String senha = this.usuario.getSenha();
		if (!senha.equals(this.confirmaSenha)) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Senha confirmada incorretamente!",""));
			return "index";
		}
		if (this.usuario.getCodigo() == null || this.usuario.getCodigo() == 0) {
			this.usuario.setAtivo(true);
		}
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.salvar(this.usuario);
		
		return this.destinosalvar;
	}
	
	public String excluir() {
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.excluir(this.usuario);
		this.lista = null;
		return null;
	}
	
	public String ativar() {
		this.usuario.setAtivo(this.usuario.isAtivo() ? false : true);
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.salvar(this.usuario);
		return null;
	}
	
	public List<Usuario> getLista() {
		if (this.lista == null) {
			UsuarioRN usuarioRN = new UsuarioRN();
			this.lista = usuarioRN.listar();
		}
		return this.lista;
	}
	
	public String atribuiPermissao(Usuario usuario, String permissao) {
		this.usuario = usuario;
		java.util.Set<String> permissoes = this.usuario.getPermissao();
		if (permissoes.contains(permissao)) {
			permissoes.remove(permissao);
		} else {
			permissoes.add(permissao);
		}
		return null;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getConfirmasenha() {
		return confirmaSenha;
	}
	public void setConfirmasenha(String confirmasenha) {
		this.confirmaSenha = confirmasenha;
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
