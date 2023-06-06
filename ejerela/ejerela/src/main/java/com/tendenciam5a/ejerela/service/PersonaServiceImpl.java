/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendenciam5a.ejerela.service;

import com.tendenciam5a.ejerela.modelo.Persona;
import com.tendenciam5a.ejerela.repository.PersonaRepository;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Abel Gomez
 */
@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Integer> implements GenericService<Persona, Integer> {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public CrudRepository<Persona, Integer> getDao() {

        return personaRepository;
    }


}
