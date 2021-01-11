package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.demo.service.DetailsService;



@EnableWebSecurity
public class SecConfig extends  WebSecurityConfigurerAdapter{

	

	@Autowired
	private MyAuthEntryPoint authEntryPoint;
	
	@Autowired
	private DetailsService detailService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.userDetailsService(detailService);
		
		
		
	}

	@Bean
   public PasswordEncoder getEncoder() {
	   return NoOpPasswordEncoder.getInstance();
   }
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.csrf().disable()
		.authorizeRequests()
		
		.antMatchers("/mgr/**").hasAnyRole("MGR")
		.antMatchers("/emp/**").hasAnyRole("MGR","EMP")
		.antMatchers("/home/**").permitAll()
				.and().httpBasic() .authenticationEntryPoint(authEntryPoint) 
        .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
	
	
	
}
