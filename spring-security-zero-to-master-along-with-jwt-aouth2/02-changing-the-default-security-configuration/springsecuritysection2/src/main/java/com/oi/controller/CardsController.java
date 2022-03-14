package com.oi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

  @GetMapping(value = "/cards")
  public String getCardsDetails(String input) {
    return "Here are your card details from the DB";
  }
}
