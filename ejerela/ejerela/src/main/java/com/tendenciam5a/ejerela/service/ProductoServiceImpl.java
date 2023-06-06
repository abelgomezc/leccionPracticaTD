/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendenciam5a.ejerela.service;

import com.tendenciam5a.ejerela.modelo.Producto;
import com.tendenciam5a.ejerela.modelo.Usuario;
import com.tendenciam5a.ejerela.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Abel Gomez
 */
@Service
public class ProductoServiceImpl  extends GenericServiceImpl<Producto, Integer> implements GenericService<Producto, Integer> {
     @Autowired
     ProductoRepository productoRepository;
     
         @Override
    public CrudRepository<Producto, Integer> getDao() {
        return productoRepository;
    }
}
