package com.kh.demo.web;

import org.springframework.data.relational.core.sql.Join;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  //초기화면
  @GetMapping("/")
  public String home() {
    return "index";
  }
}
