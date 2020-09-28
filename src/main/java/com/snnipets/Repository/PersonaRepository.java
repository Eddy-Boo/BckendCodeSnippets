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
    Persona findByCedula(String cedula);
    
      @Query(value = "{'publicaciones.0.categotias.lenguajeProgra':?0}")
      List<Persona>buscarbyLenguaje(String lenguaje);
      
      @Query(value = "{'publicaciones.0.codigo':{$regex:\".*?0.*\", $options:\"i\"}}")
      List<Persona>buscarbyCodigo(String Codigo);
      
       @Query(value = "{'publicaciones.0.Descripcion':{$regex:\".*?0.*\", $options:\"i\"}}")
      List<Persona>buscarbyDescripcion(String Cdescripcion);
      
      // Filtrar el max id de la persona
	@Query(value = "{}", sort = "{ _id : -1 }")
	List <Persona> findMaxId();
      
}
