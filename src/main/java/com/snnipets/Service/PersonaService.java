/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snnipets.Service;

import com.snnipets.Model.Persona;
import com.snnipets.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author brhyant
 */
@Service
public class PersonaService {
      @Autowired
    private PersonaRepository personaRepository;

    public Persona crearPersona(Persona per) {
        return personaRepository.save(per);
    }

    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }
}