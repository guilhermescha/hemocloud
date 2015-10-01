package br.com.hemocloud.util;

import br.com.hemocloud.usuario.*;
import br.com.hemocloud.paciente.*;

public class DAOFactory {

	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}

	public static PacienteDAO criarPacienteDAO() {
		PacienteDAOHibernate pacienteDAO = new PacienteDAOHibernate();
		pacienteDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return pacienteDAO;
	}
	
}
