/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dao;

import com.prueba.modelo.Creditos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author heibe
 */
@Local
public interface SociosDaoLocal {
    
    List<Creditos> getAllCreditos();
    
}
