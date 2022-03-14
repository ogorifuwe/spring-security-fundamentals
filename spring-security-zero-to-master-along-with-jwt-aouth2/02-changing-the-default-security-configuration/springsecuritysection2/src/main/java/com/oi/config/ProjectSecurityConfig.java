package com.oi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

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
//    Default configuration - secures all endpoints/requests
//    http
//      .authorizeRequests()
//        .anyRequest().authenticated().and()
//        .formLogin().and()
//        .httpBasic();

//    custom configurations as per our requirement
//    http
//      .authorizeRequests()
//        .antMatchers("/account").authenticated()
//        .antMatchers("/balance").authenticated()
//        .antMatchers("/loans").authenticated()
//        .antMatchers("/cards").authenticated()
//        .antMatchers("/notices").permitAll()
//        .antMatchers("/contact").permitAll()
//        .and()
//      .formLogin().and()
//      .httpBasic();

    // configuration to deny all requests
//    http
//      .authorizeRequests()
//        .anyRequest().denyAll().and()
//        .formLogin().and()
//        .httpBasic();

    // configuration to permit all requests
    http
            .authorizeRequests()
            .anyRequest().permitAll().and()
            .formLogin().and()
            .httpBasic();
  }
}
