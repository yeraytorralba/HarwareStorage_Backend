package com.testCourse.StorageHarwareBackend.securingweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

@Configuration
public class AuthorizacionServerConfiguration extends AuthorizationServerConfigurerAdapter{
	
	@Autowired 
	private AuthenticationManager authenticationManager;
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.userDetailsService(userDetailsService)
		.authenticationManager(authenticationManager);
		 
	}
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory().withClient("cliente")
		.authorizedGrantTypes("password","authorization_code","refresh_token","implicit")
		.authorities("ROLE_USER","ROLE_ADMIN","USER")
		.scopes("read","write")
		.autoApprove(true)
		.secret(passwordEncoder().encode("password"));
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();		
	}
	@Bean
	public TokenStore tokenStore() {
		return new InMemoryTokenStore();
	}
}
