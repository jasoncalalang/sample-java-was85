package com.ibm.garage.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

  @GetMapping(value = "/", produces = "application/json")
  public String hello() {
    return "{\"message\":\"hello world!\"}";
  }
}
