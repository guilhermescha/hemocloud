package br.com.hemocloud.usuario;

import java.util.List;

import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import br.com.hemocloud.util.TransactionUtil;

public class UsuarioDAOHibernate implements UsuarioDAO {

	private MongoOperations mongoOps;
	private static final String USUARIO_COLLECTION = "Usuario";

	public UsuarioDAOHibernate(MongoOperations mongoOps) {
		this.mongoOps = mongoOps;
	}

	@Override
	public void salvar(Usuario usuario) {
		TransactionUtil.transactionStart();
		this.mongoOps.insert(usuario, USUARIO_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de inserção do usuário");
	}

	@Override
	public void atualizar(Usuario usuario) throws OptimisticLockingFailureException {
		TransactionUtil.transactionStart();
		this.mongoOps.save(usuario, USUARIO_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de atualização do usuário");
	}

	@Override
	public void excluir(Usuario usuario) {
		TransactionUtil.transactionStart();
		this.mongoOps.remove(usuario, USUARIO_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de exclusão do usuário");
	}

	@Override
	public Usuario carregar(Integer codigo) {
		TransactionUtil.transactionStart();
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(codigo));
		Usuario usuario = (Usuario) mongoOps.findOne(query, Usuario.class, USUARIO_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de busca do usuário");
		return usuario;
	}

	@Override
	public Usuario buscarPorEmail(String email) {
		TransactionUtil.transactionStart();
		Query query = new Query();
		query.addCriteria(Criteria.where("email").is(email));
		Usuario usuario = (Usuario) mongoOps.findOne(query, Usuario.class, USUARIO_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de busca do usuário por email");
		return usuario;
	}

	@Override
	public List<Usuario> listar() {
		TransactionUtil.transactionStart();
		List<Usuario> lista = this.mongoOps.findAll(Usuario.class, USUARIO_COLLECTION);
		TransactionUtil.transactionEnd("Tempo de carregamento da lista de usuários");
		return lista;
	}

}
