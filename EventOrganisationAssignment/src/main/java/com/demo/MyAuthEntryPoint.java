package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class MyAuthEntryPoint extends  BasicAuthenticationEntryPoint{
	public void afterPropertiesSet() {
		setRealmName("sec-demo");
		super.afterPropertiesSet();
	}

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException {
		// TODO Auto-generated method stub
	response.setHeader("www-authenticate","Basic realm=\"" + getRealmName() + "\"");
	response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
	PrintWriter out=response.getWriter();
	out.print("401-UNAUTHORIZED-contact ks@gmil.com");

	}
	
	

}
