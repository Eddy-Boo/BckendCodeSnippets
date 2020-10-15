/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snnipets.Repository;

import com.snnipets.Model.Persona;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author brhyant
 */
@Repository
public interface PersonaRepository extends MongoRepository< Persona, String>{
    
    //BUSCAR POR USUARIO
     @Query(value = "{'usuario.0.usuario':?0}")
      Persona buscarbyUsuario(String usuario);
      
         @Query(value = "{'usuario.0.usuario':?0}")
      List <Persona> VerUsuario(String usuario);
    
      @Query(value = "{'publicaciones.lenguajeProgra':?0}")
      List<Persona>buscarbyLenguaje(String lenguaje);
      
      //{'usuario.0.usuario':'Eddy2'} consulta del metodo buscar por usuario
      
      @Query(value = "{'publicaciones.0.codigo':{$regex:\".*?0.*\", $options:\"i\"}}")
      List<Persona>buscarbyCodigo(String Codigo);
      
       @Query(value = "{'publicaciones.Descripcion':{$regex:\".*?0.*\", $options:\"i\"}}")
      List<Persona>buscarbyDescripcion(String Cdescripcion);
      
      // Filtrar el max id de la persona
	@Query(value = "{}", sort = "{ _id : -1 }")
	List <Persona> findMaxId();
        
       @Query(value = "{$and: [{'usuario.0.usuario': ?0}, { 'usuario.0.contrasenia' : ?1}]}")
       Persona ComporbarUsuario(String usuario, String contraseña);
      
}
