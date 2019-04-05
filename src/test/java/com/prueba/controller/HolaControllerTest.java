package com.prueba.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*; 

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HolaControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void saludarDeberiaRetornarUnMensaje() throws Exception{
    mockMvc
      .perform(get("/hola"))
      .andExpect(status().isOk())
      .andExpect(content().string("Mi vieja mula ya no es lo que era"));
  }
  
}