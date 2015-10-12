package br.com.hemocloud.triagem;

import java.util.List;

public interface TriagemDAO {
	public void salvar(Triagem triagem);
	public void atualizar(Triagem triagem);
	public void excluir(Triagem triagem);
	public Triagem carregar(Integer codigo);
	public List<Triagem> listar();
}
