/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dao;

import com.prueba.modelo.Creditos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author heibe
 */
@Stateless
public class SociosDao implements SociosDaoLocal {
    
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public List<Creditos> getAllCreditos(){
        return em.createNamedQuery("Creditos.findAll").getResultList();
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
