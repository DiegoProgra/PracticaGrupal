/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Practica01.controller;

import com.Practica01.dao.EstadoDao;
import com.Practica01.domain.estado;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController {
    
     @Autowired
    EstadoDao estadoDao;
     
   @GetMapping("/")
    public String page(Model model) {
      
   //     log.info("Ahora desde MVC");
   //     model.addAttribute("Mensaje", "Hola desde el contralodor");
   //    
   //     estado Estado = new estado(Long.MIN_VALUE, "Panama", "cuidad Panama", "Los Santos", "4000000", "Si");
   //     model.addAttribute("Estado", Estado);
   //     
   //    
   //    List<estado> estado = Arrays.asList(Estado);
   
        var estado = estadoDao.findAll();
        model.addAttribute("Estado", estado);
        
        return "index";
        
        
        
        
    }
    
}

    
