package br.com.hemocloud.security;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MongoUserDetailsService implements UserDetailsService {
	private MongoTemplate mongoTemplate;

	public MongoUserDetailsService(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails user = mongoTemplate.findOne(new Query(Criteria.where("username").is(username)), User.class,
				"users");
		if (user == null) {
			throw new UsernameNotFoundException("Username " + username + " not found.");
		}
		return user;
	}
}