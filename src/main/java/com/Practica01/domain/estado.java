/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Practica01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")
public class estado implements Serializable {
    
    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pais;
    private String estado;
    private String capital;
    private String poblacion;
    private String costas;

    public estado() {
    }

    public estado(Long id, String pais, String estado, String capital, String poblacion, String costas) {
        this.id = id;
        this.pais = pais;
        this.estado = estado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }

}
