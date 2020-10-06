/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snnipets.Controller;


import com.snnipets.Model.Persona;
import com.snnipets.Service.PersonaService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author brhyant
 */
@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "*")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @PostMapping
    public Persona guardarPersona(@RequestBody Persona persona) {
        return personaService.crearPersona(persona);
    }

    @GetMapping(path = "/list", produces = "application/json")
    public List<Persona> listarPersonas() {
        return personaService.listarPersonas();
    }

    @RequestMapping(value = "/InsertarPublicacionByUsuario", method = RequestMethod.PUT)
    public Persona anadirPublicacionPersona(String usuario, String titulo,String codigo, String descripcion, String IDE, String lenguaje, String fecha) {
        return personaService.anadirPublicacionPersona(usuario,titulo,codigo, descripcion, IDE, lenguaje, fecha);
    }


    @GetMapping(path = "/listbyLenguaje", produces = "application/json")
    public List<Persona> listarPersonasbylenguaje(String Lenguaje) {
        return personaService.listarPersonasbyLenguaje(Lenguaje);
    }

    @GetMapping(path = "/likebyCodigo", produces = "application/json")
    public List<Persona> likeByCodigo(String codigo) {
        return personaService.likeCodigo(codigo);
    }

    @GetMapping(path = "/likebyDescripcion", produces = "application/json")
    public List<Persona> likeByDescripcion(String descripcion) {
        return personaService.likeDescripcion(descripcion);
    }

    @GetMapping(path = "/findMaxIdPersona", produces = "application/json")
    @CrossOrigin
    public Long findMaxIdPersona() {
        return personaService.buscarIdMax();
    }
    
    @GetMapping(path = "/Comprobarlogueo", produces = "application/json")
    public Persona ComprobarLogueo(String usuario, String Contraseña) {
        return personaService.comporbarUsuario(usuario, Contraseña);
    }
    
     @GetMapping(path = "/VerUsuario", produces = "application/json")
    public List <Persona> Verusuario(String usuario) {
        return personaService.verUsuario(usuario);
    }
    
    
}
