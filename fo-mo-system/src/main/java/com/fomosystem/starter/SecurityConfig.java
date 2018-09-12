package com.fomosystem.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.fomosystem.controller.SuccessAuthenticationHandler;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	SuccessAuthenticationHandler successAuthenticationHandler;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
        .authorizeRequests()
            .antMatchers("/css/**","/js/**").permitAll()
            .anyRequest().authenticated()
            .and()
        .formLogin()
        .successHandler(successAuthenticationHandler)
            .loginPage("/login")
            .permitAll()
            .and()
        .logout()
            .permitAll();
		http.csrf().disable();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
				.withUser("mithun").password("{noop}mithun").roles("USER")
				.and()
				.withUser("krishna").password("{noop}krishna").roles("USER")
				.and()
				.withUser("shashi").password("{noop}shashi").roles("USER")
				.and()
				.withUser("shashank").password("{noop}shashank").roles("USER")
				.and()
				.withUser("vivek").password("{noop}vivek").roles("USER");
	}
	
}
