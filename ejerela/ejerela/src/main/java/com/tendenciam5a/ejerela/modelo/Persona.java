/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendenciam5a.ejerela.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Abel Gomez
 */
@Data
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private int id_persona;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "cedula")
    private String cedula;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "num_telefono")
    private String num_telefono;

    @JsonIgnore
    @OneToMany(mappedBy = "persona")
    private List<Usuario>listaUsuarios;
//    @OneToOne(cascade = CascadeType.ALL)
//    private Pasaporte pasaporte;
//    
}
