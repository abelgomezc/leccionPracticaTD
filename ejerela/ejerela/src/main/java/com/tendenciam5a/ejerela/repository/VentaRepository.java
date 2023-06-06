/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tendenciam5a.ejerela.repository;

import com.tendenciam5a.ejerela.modelo.Persona;
import com.tendenciam5a.ejerela.modelo.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Abel Gomez
 */
public interface VentaRepository  extends JpaRepository<Venta, Integer>{
    
}
