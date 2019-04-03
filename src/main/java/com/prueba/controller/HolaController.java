package com.prueba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

  @GetMapping("/hola")
  public String saludar() {
    return "Mi vieja mula ya no es lo que era";
  }
}