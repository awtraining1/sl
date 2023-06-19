package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		
		auth.inMemoryAuthentication()
		.withUser("user").password(encoder.encode("password")).roles("USER")
		.and()
		.withUser("user1").password(encoder.encode("password1")).roles("USER")
		.and()
		.withUser("user2").password(encoder.encode("password2")).roles("USER")
		.and()
		.withUser("admin1").password(encoder.encode("adminpassword1")).roles("ADMIN");
	}
	
	

}
