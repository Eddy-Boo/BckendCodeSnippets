/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snnipets.Service;



import com.snnipets.Model.Lenguajes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.snnipets.Repository.LenguajesRepository;
import java.util.List;

/**
 *
 * @author brhyant
 */
@Service
public class LenguajeService {
    @Autowired
    private LenguajesRepository lenguajeRepository;
    
      //CREAR UNA NUEVA PERSONA
    public Lenguajes IngresarLengaje(Lenguajes len) {
        return lenguajeRepository.save(len);
    }

    //LISTAR PERSONA
    public List<Lenguajes> listarLenguajes() {
        return lenguajeRepository.findAll();
    }

}
