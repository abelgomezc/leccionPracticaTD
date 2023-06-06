/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tendenciam5a.ejerela.repository;

import com.tendenciam5a.ejerela.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author 59398
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
        @Query(value = "Select * from usuario u where u.nombre = :nombre", nativeQuery = true)
    public Usuario buscarUsuario(String nombre);
}
