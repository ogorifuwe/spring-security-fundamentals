package com.oi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@Configuration
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {
  /**
   * /account - secure
   * /balance - secure
   * /loans - secure
   * /cards - secure
   * /notices - not secure
   * /contact - not secure
   */
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
            .antMatchers("/account").authenticated()
            .antMatchers("/balance").authenticated()
            .antMatchers("/loans").authenticated()
            .antMatchers("/cards").authenticated()
            .antMatchers("/notices").permitAll()
            .antMatchers("/contact").permitAll()
            .and()
            .formLogin().and()
            .httpBasic();
  }

//  @Override
//  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//    auth.inMemoryAuthentication()
//            .withUser("admin").password("admin").authorities("admin").and()
//            .withUser("user").password("password").authorities("read").and()
//            .passwordEncoder(NoOpPasswordEncoder.getInstance());
//  }

//  @Override
//  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//    InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
//    UserDetails user = User.withUsername("admin").password("admin").authorities("admin").build();
//    UserDetails user1 = User.withUsername("user").password("password").authorities("read").build();
//    userDetailsService.createUser(user);
//    userDetailsService.createUser(user1);
//    auth.userDetailsService(userDetailsService);
//  }

//  @Bean
//  public UserDetailsService userDetailsService(DataSource dataSource) {
//    return new JdbcUserDetailsManager(dataSource);
//  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return NoOpPasswordEncoder.getInstance();
  }
}
