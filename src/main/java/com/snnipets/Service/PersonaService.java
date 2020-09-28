/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snnipets.Service;


import com.snnipets.Model.Persona;
import com.snnipets.Model.Publicaciones;
import com.snnipets.Repository.PersonaRepository;
import java.util.Date;
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

      //CREAR UNA NUEVA PERSONA
    public Persona crearPersona(Persona per) {
        return personaRepository.save(per);
    }

    //LISTAR PERSONA
    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }

    //Añadir publicaciones a una persona por cedula
    public Persona anadirPublicacionPersona(String usuario, String codigo, String descripcion, String IDE, String lenguaje, String fecha) {
        Persona obj = personaRepository.buscarbyUsuario(usuario);//Consultamos por usuario
        Publicaciones publicacion = new Publicaciones();//Instanciar la publicacion, se usará para setear los datos de la nueva publicacion
        publicacion.setCodigo(codigo);//Setea titulo
        publicacion.setDescripcion(descripcion);//Setea contenido
        publicacion.setLenguajeProgra(lenguaje);
        publicacion.setIDE(IDE);
        publicacion.setFecha(fecha);
        obj.getPublicaciones().add(publicacion);
    
        personaRepository.save(obj);
        return obj;
    }

    public List<Persona> listarPersonasbyLenguaje(String Lenguaje) {
        return personaRepository.buscarbyLenguaje(Lenguaje);
    }

    public List<Persona> likeCodigo(String codigo) {
        return personaRepository.buscarbyCodigo(codigo);
    }

    public List<Persona> likeDescripcion(String descripcion) {
        return personaRepository.buscarbyDescripcion(descripcion);
    }
    // Filtrar el max id

    public Long buscarIdMax() {
        return personaRepository.findMaxId().get(0).getId();
    }
}
