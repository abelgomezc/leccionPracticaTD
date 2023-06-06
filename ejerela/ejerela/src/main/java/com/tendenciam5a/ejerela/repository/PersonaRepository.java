/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tendenciam5a.ejerela.repository;

import com.tendenciam5a.ejerela.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Abel Gomez
 */
public interface PersonaRepository extends JpaRepository<Persona, Integer>{
           @Query(value = "Select * from persona p where p.nombre = :nombre", nativeQuery = true)
    public Persona buscarPersona(String nombre);
}
