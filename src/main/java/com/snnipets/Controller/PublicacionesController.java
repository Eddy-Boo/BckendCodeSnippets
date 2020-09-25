/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snnipets.Controller;

import com.snnipets.Model.Persona;
import com.snnipets.Model.Publicaciones;
import com.snnipets.Service.PersonaService;
import com.snnipets.Service.PublicacionesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author edy
 */
@RestController
@RequestMapping("/publicaciones")
public class PublicacionesController {
    @Autowired
    PublicacionesService publicacionService;   
}
