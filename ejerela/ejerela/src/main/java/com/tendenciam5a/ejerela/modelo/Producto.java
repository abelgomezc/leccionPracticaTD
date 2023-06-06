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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Abel Gomez
 */
@Data
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private int id_producto;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripccion")
    private String descripccion;
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "color")
    private String color;
    @Column(name = "talla")
    private String talla;
    @Column(name = "ruta_imagen")
    private String ruta_imagen;
    @Column(name = "precio_emprendedor")
    private double precio_emprendedor;
    @Column(name = "cantidad")
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_venta", referencedColumnName = "id_venta")
    private Venta venta;

}
