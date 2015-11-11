package br.com.hemocloud.util;

import br.com.hemocloud.usuario.*;
import br.com.hemocloud.paciente.*;
import br.com.hemocloud.triagem.*;

public class DAOFactory {

	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}

	public static PacienteDAO criarPacienteDAO() {
		PacienteDAOImpl pacienteDAO = new PacienteDAOImpl();
		pacienteDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return pacienteDAO;
	}

	public static TriagemDAO criarTriagemDAO() {
		TriagemDAOImpl triagemDAO = new TriagemDAOImpl();
		triagemDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return triagemDAO;
	}
	
}
