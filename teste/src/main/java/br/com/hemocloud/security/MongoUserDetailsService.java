package br.com.hemocloud.security;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.com.hemocloud.usuario.Usuario;

public class MongoUserDetailsService implements UserDetailsService {
	private MongoTemplate mongoTemplate;

	public MongoUserDetailsService(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Usuario usuario = mongoTemplate.findOne(new Query(Criteria.where("email").is(email)), Usuario.class, "Usuario");
		if (usuario == null) {
			throw new UsernameNotFoundException("Usuário " + email + " não encontrado.");
		}

		List<String> permissoes = new ArrayList<String>(usuario.getPermissao());
		ArrayList<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (int i = 0; i < permissoes.size(); i++) {
			authorities.add(new SimpleGrantedAuthority(permissoes.get(i)));
		}

		UserDetails user = new User(usuario.getEmail(), usuario.getSenha(), authorities);
		return user;
	}
}