package com.oi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

  @GetMapping(value = "/loans")
  public String getLoanDetails(String input) {
    return "Here are your loan details form the DB";
  }
}
