package br.com.hemocloud.triagem;

import java.util.List;
import br.com.hemocloud.util.DAOFactory;

public class TriagemRN {
	private TriagemDAO	triagemDAO; 
	public TriagemRN() { 
		this.triagemDAO = DAOFactory.criarTriagemDAO();
	}
	public Triagem carregar(Integer codigo) { 
		return this.triagemDAO.carregar(codigo);
	}
	public void salvar(Triagem triagem) { 
		Integer codigo = triagem.getCodigo();
		if (codigo == null || codigo == 0) {
			this.triagemDAO.salvar(triagem);
		} else {
			this.triagemDAO.atualizar(triagem);
		}
	}
	public void excluir(Triagem triagem) { 
		this.triagemDAO.excluir(triagem);
	}
	public List<Triagem> listar() { 
		return this.triagemDAO.listar();
	}
}