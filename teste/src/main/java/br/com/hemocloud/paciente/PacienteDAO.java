package br.com.hemocloud.paciente;

import java.util.List;

public interface PacienteDAO {
	public void salvar(Paciente paciente);
	public void atualizar(Paciente paciente);
	public void excluir(Paciente paciente);
	public Paciente carregar(Integer codigo);
	public Paciente buscarPorRg(Integer rg);
	public Paciente buscarPorCpf(Integer cpf);
	public Paciente buscarPorNome(String nome);
	public List<Paciente> listar();
}
