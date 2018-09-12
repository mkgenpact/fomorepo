package com.fomosystem.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class SuccessAuthenticationHandler implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, 
										HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		String username = request.getParameter("username");
		String password = request.getParameter("password"); 
		String role = request.getParameter("role");
		request.getRequestDispatcher("/").forward(request, response);
		
	}
	
	

}
