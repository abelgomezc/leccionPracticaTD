/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendenciam5a.ejerela.service;

import com.tendenciam5a.ejerela.modelo.Producto;
import com.tendenciam5a.ejerela.modelo.Venta;
import com.tendenciam5a.ejerela.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Abel Gomez
 */
public class VentaServiceImpl extends GenericServiceImpl<Venta, Integer> implements GenericService<Venta, Integer> {

    @Autowired
    VentaRepository ventaRepository;

    @Override
    public CrudRepository<Venta, Integer> getDao() {
        return ventaRepository;
    }
}
