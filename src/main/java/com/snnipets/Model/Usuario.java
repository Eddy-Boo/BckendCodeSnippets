/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snnipets.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 *
 * @author edy
 */
@Data
@Document
public class Usuario {
  @Indexed(unique=true)
  private String usuario;
  private String contrasenia;  
}
