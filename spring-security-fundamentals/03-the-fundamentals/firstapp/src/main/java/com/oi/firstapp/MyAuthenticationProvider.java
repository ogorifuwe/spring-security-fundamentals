package com.oi.firstapp;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyAuthenticationProvider implements AuthenticationProvider {

  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    String userName = authentication.getName();
    String password = authentication.getCredentials().toString();
    if (!isAuthenticated(userName, password)) {
      throw new BadCredentialsException("Invalid Username or Password");
    }
    return new UsernamePasswordAuthenticationToken(userName, password, Arrays.asList());
  }

  @Override
  public boolean supports(Class<?> authentication) {
    return authentication.equals(UsernamePasswordAuthenticationToken.class);
  }

  private boolean isAuthenticated(String username, String password) {
    boolean isAuthenticated = false;
    if (username.equals("tom") && password.equals("cruise")) {
      isAuthenticated = true;
    }
    return isAuthenticated;
  }
}
