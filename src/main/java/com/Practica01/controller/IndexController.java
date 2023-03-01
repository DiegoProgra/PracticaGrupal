/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Practica01.controller;

import com.Practica01.dao.EstadoDao;
import com.Practica01.domain.estado;
import com.Practica01.service.EstadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    EstadoService EstadoService;

    @GetMapping("/")
    public String inicio(Model model) {

        var estado = EstadoService.getEstados();
        model.addAttribute("Estado", estado);

        return "index";

    }

    @GetMapping("/nuevoEstado")
    public String nuevoEstado(estado estado) {
        return "modificarEstado";
    }

    @PostMapping("/guardarEstado")
    public String guardarEstado(estado estado) {
        EstadoService.save(estado);
        return "redirect:/";
    }

    @GetMapping("/modificarEstado/{id}")
    public String modificarEstado(estado estado, Model model) {
        estado = EstadoService.getEstado(estado);
        model.addAttribute("estado", estado);
        return "modificarEstado";
    }

    @GetMapping("/eliminarEstado/{id}")
    public String eliminarEstado(estado estado) {
        EstadoService.delete(estado);
        return "redirect:/";
    }
}
