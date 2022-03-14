package com.oi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

  @GetMapping(value = "/contact")
  public String saveContactInquiryDetails(String input) {
    return "Inquiry details have been saved to the DB";
  }
}
