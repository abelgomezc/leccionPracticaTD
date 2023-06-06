/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendenciam5a.ejerela.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Date;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Abel Gomez
 */
@Data
@Entity
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private int id_venta;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "fechaCompra")
    private Date fechaCompra;

    @JsonIgnore
    @OneToMany(mappedBy = "venta")
    private List<Producto> listaProductos;

}
