/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendenciam5a.ejerela.controller;

import com.tendenciam5a.ejerela.modelo.Persona;
import com.tendenciam5a.ejerela.modelo.Producto;
import com.tendenciam5a.ejerela.modelo.Venta;
import com.tendenciam5a.ejerela.service.VentaServiceImpl;
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
@RequestMapping("/Venta")
public class VentaController {

    @Autowired
    VentaServiceImpl ventaServiceImpl;

    @Operation(summary = "Se obtiene la lista de Ventas")
    @GetMapping("/listarVentas")
    public ResponseEntity<List<Venta>> listaVenta() {
        return new ResponseEntity<>(ventaServiceImpl.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crearVenta")
    public ResponseEntity<Venta> crearVenta(@RequestBody Venta u) {
        return new ResponseEntity<>(ventaServiceImpl.save(u), HttpStatus.CREATED);
    }
    
       @DeleteMapping("/eliminarVenta/{id}")
    public ResponseEntity<Venta> elimiarProducto(@PathVariable Integer id) {
        ventaServiceImpl.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
