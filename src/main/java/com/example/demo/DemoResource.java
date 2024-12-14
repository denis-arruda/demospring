package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoResource {
  
  @GetMapping("/")
  public String getMethodName() {
    return "Hello!";
  }
}