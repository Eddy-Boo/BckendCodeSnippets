/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snnipets.Repository;

import com.snnipets.Model.Categorias;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author edy
 */
public interface CategoriasRepository extends MongoRepository< Categorias, String>{
    
}
