/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snnipets.Repository;

import com.snnipets.Model.Persona;
import com.snnipets.Model.Publicaciones;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author edy
 */
@Repository
public interface PublicacionesRepository extends MongoRepository< Publicaciones, String>{
       List <Publicaciones> findByCodigo(String codigo);
       
    
}
