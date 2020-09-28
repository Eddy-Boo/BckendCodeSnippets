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
 * @author edy
 */
@Data
@Document
public class Publicaciones {
    private String codigo;
    private String Descripcion;
    private String lenguajeProgra;
    private String IDE;
}
