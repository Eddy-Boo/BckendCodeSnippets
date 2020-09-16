/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snnipets.Model;

import java.util.List;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author brhyant
 */
@Data
@Document
public class Persona {
    private String nombre;
    private String apellido;
    private String edad;
    private String email;   
    private String pais;
    private List<Usuario> usuario;
    private List<Publicaciones> publicaciones;

}
