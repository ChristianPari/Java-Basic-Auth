package com.christianpari.basic.security.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String sayHello(
    @RequestParam(required = false, defaultValue = "CareerDevs User") String name
  ) {
    return "Hello " + name;
  }
}
