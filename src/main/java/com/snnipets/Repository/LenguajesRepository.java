/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snnipets.Repository;

import com.snnipets.Model.Lenguajes;
import com.snnipets.Model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author brhyant
 */
public interface LenguajesRepository extends MongoRepository < Lenguajes, String>{
    
}
