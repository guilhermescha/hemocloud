package br.com.hemocloud.util;

import br.com.hemocloud.usuario.*;

import java.net.UnknownHostException;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

import br.com.hemocloud.paciente.*;
import br.com.hemocloud.triagem.*;

public class DAOFactory {

	public static final String DB_NAME = "hemocloudnosql";
	public static final String MONGO_HOST = "localhost";
	public static final int MONGO_PORT = 27017;
	
	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate(getMongoOps());
		return usuarioDAO;
	}

	public static PacienteDAO criarPacienteDAO() {
		PacienteDAOHibernate pacienteDAO = new PacienteDAOHibernate(getMongoOps());
		return pacienteDAO;
	}

	public static TriagemDAO criarTriagemDAO() {
		TriagemDAOHibernate triagemDAO = new TriagemDAOHibernate(getMongoOps());
		return triagemDAO;
	}
	
	private static MongoOperations getMongoOps() {
		MongoClient mongo = null;
		try {
			mongo = new MongoClient(MONGO_HOST, MONGO_PORT);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MongoOperations mongoOps = new MongoTemplate(mongo, DB_NAME);
		return mongoOps;
	}
	
}
