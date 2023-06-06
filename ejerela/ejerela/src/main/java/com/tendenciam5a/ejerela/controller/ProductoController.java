/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendenciam5a.ejerela.controller;

import com.tendenciam5a.ejerela.modelo.Persona;
import com.tendenciam5a.ejerela.modelo.Producto;
import com.tendenciam5a.ejerela.service.ProductoServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Abel Gomez
 */
@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoServiceImpl productoServiceImpl;

    //     @Operation(summary = "Debe enviar los campos del Persona")
    @PostMapping("/crearProducto")
    public ResponseEntity<Producto> crearUsuario(@RequestBody Producto u) {
        return new ResponseEntity<>(productoServiceImpl.save(u), HttpStatus.CREATED);
    }

    @Operation(summary = "Se obtiene la lista de Productos")
    @GetMapping("/listarProductos")
    public ResponseEntity<List<Producto>> listaProductos() {
        return new ResponseEntity<>(productoServiceImpl.findByAll(), HttpStatus.OK);
    }
    
    
    @DeleteMapping("/eliminarProductos/{id}")
    public ResponseEntity<Producto> elimiarProducto(@PathVariable Integer id) {
        productoServiceImpl.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    

}
