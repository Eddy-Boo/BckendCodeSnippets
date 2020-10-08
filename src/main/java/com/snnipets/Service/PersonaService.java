/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snnipets.Service;

import com.snnipets.Model.Persona;
import com.snnipets.Model.Publicaciones;
import com.snnipets.Model.Usuario;
import com.snnipets.Repository.PersonaRepository;
import java.util.Date;
import java.util.List;
import java.util.Optional;
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

    //Añadir publicaciones a una persona por usuario
    public Persona anadirPublicacionPersona(String usuario, String titulo, String codigo, String descripcion, String IDE, String lenguaje, String fecha) {
        Persona obj = personaRepository.buscarbyUsuario(usuario);//Consultamos por usuario
        Publicaciones publicacion = new Publicaciones();//Instanciar la publicacion, se usará para setear los datos de la nueva publicacion
        publicacion.setTitulo(titulo);
        publicacion.setCodigo(codigo);//Setea Codigo
        publicacion.setDescripcion(descripcion);//Setea Descripcion
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

    public Persona comporbarUsuario(String usuario, String contraseña) {
        Persona obj = personaRepository.ComporbarUsuario(usuario, contraseña);
        if (obj.getUsuario().get(0).getUsuario().equals(usuario) && obj.getUsuario().get(0).getContrasenia().equals(contraseña)) {
            return obj;
        } else {

        }
        return obj;
    }

    public List<Persona> verUsuario(String usuario) {
        return personaRepository.VerUsuario(usuario);

    }

    public Persona editarUsuario(String usuario, String nombre,String apellido, String edad, String email, String pais, String foto) {
      Persona obj = personaRepository.buscarbyUsuario(usuario);
      Usuario objuser = new Usuario();
      obj.setNombre(nombre);
      obj.setApellido(apellido);
      obj.setEdad(edad);
      obj.setPais(pais);
      obj.setFoto(foto);
      personaRepository.save(obj);
      return obj;
    }
    
    public Persona cargarUsuario(String usuario){
        return personaRepository.buscarbyUsuario(usuario);
    }

}
