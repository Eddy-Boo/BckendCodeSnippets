/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snnipets.Service;

import com.snnipets.Model.Publicaciones;
import com.snnipets.Repository.PublicacionesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author edy
 */
@Service
public class PublicacionesService {
      @Autowired
      private PublicacionesRepository publicacionrepository;
      
//      public List<Publicaciones>ListarPublicacionesbyCategoria(String lenguajeProgra ){
//          return publicacionrepository.findByCodigo(lenguajeProgra);
//          
//      }
    
}
