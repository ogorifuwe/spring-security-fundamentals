package com.oi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

  @GetMapping(value = "/account")
  public String getAccountDetails(String input) {
    return "Here are your account details from the DB";
  }
}
