/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snnipets.Service;

import com.snnipets.Model.Categorias;
import com.snnipets.Model.Persona;
import com.snnipets.Model.Publicaciones;
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


      //CREAR UNA NUEVA PERSONA
    @Autowired
    private PersonaRepository personaRepository;

    public Persona crearPersona(Persona per) {
        return personaRepository.save(per);
    }

    //LISTAR PERSONA
    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }

   

    //Añadir publicaciones a una persona por cedula
    public Persona anadirPublicacionPersona(String cedula, String codigo, String descripcion, String IDE, String lenguaje) {
        Persona obj = personaRepository.findByCedula(cedula);//Consultamos por cedula
        Publicaciones publicacion = new Publicaciones();//Instanciar la publicacion, se usará para setear los datos de la nueva publicacion
        Categorias categoria = new Categorias();
        publicacion.setCodigo(codigo);//Setea titulo
        publicacion.setDescripcion(descripcion);//Setea contenido
        categoria.setLenguajeProgra(lenguaje);
        categoria.setIDE(IDE);
//        publicacion.getCategotias().get(0).setLenguajeProgra(lenguaje);
//        publicacion.getCategotias().get(0).setIDE(IDE);
        obj.getPublicaciones().add(publicacion);
        obj.getPublicaciones().get(0).getCategotias().add(categoria);

        personaRepository.save(obj);
        return obj;
    }
      public List<Persona> listarPersonasbyLenguaje(String Lenguaje) {
        return personaRepository.buscarbyLenguaje(Lenguaje);
    }
      
      
}
