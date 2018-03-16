/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author heibe
 */
@Entity
@Table(name = "creditos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Creditos.findAll", query = "SELECT c FROM Creditos c")
    , @NamedQuery(name = "Creditos.findById", query = "SELECT c FROM Creditos c WHERE c.id = :id")
    , @NamedQuery(name = "Creditos.findBySocios", query = "SELECT c FROM Creditos c WHERE c.socios = :socios")
    , @NamedQuery(name = "Creditos.findByTasa", query = "SELECT c FROM Creditos c WHERE c.tasa = :tasa")
    , @NamedQuery(name = "Creditos.findByMontoMaximoDisponible", query = "SELECT c FROM Creditos c WHERE c.montoMaximoDisponible = :montoMaximoDisponible")})
public class Creditos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "socios")
    private String socios;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tasa")
    private float tasa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "monto_maximo_disponible")
    private int montoMaximoDisponible;

    public Creditos() {
    }

    public Creditos(Integer id) {
        this.id = id;
    }

    public Creditos(Integer id, String socios, float tasa, int montoMaximoDisponible) {
        this.id = id;
        this.socios = socios;
        this.tasa = tasa;
        this.montoMaximoDisponible = montoMaximoDisponible;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSocios() {
        return socios;
    }

    public void setSocios(String socios) {
        this.socios = socios;
    }

    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    public int getMontoMaximoDisponible() {
        return montoMaximoDisponible;
    }

    public void setMontoMaximoDisponible(int montoMaximoDisponible) {
        this.montoMaximoDisponible = montoMaximoDisponible;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Creditos)) {
            return false;
        }
        Creditos other = (Creditos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Creditos[ id=" + id + " ]";
    }
    
}
