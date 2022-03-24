package com.oi.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping(value = "/hello")
  public String hello() {
    return "Spring Secuirty Rocks";
  }

  @GetMapping(value = "/bye")
  public String bye() {
    return "Get lost!";
  }
}
