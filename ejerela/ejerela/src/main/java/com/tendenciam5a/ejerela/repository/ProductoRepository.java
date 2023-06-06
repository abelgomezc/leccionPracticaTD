/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tendenciam5a.ejerela.repository;

import com.tendenciam5a.ejerela.modelo.Persona;
import com.tendenciam5a.ejerela.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Abel Gomez
 */
public interface ProductoRepository  extends JpaRepository<Producto, Integer>{
    
        @Query(value = "Select * from producto p where p.precio_emprendedor = :precio_emprendedor", nativeQuery = true)
    public Producto buscarProducto(double precio);
    
}
