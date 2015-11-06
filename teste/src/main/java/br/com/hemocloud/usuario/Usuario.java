package br.com.hemocloud.usuario;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;

public class Usuario {

	@Id
	private String codigo;
	
	private String nome;
	private String email;
	private String senha;
	private boolean ativo;
	private Set<String> permissao = new HashSet<String>();
	
	public Set<String> getPermissao() {
		return permissao;
	}
	public void setPermissao(Set<String> permissao) {
		this.permissao = permissao;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
