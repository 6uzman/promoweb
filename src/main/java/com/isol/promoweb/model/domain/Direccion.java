package com.isol.promoweb.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Miguel Guzman on 11/05/2016.
 */
@Entity
@Table
public class Direccion {
    @Id
    @GeneratedValue
    private long idDireccion;
    private String calle;
    private String colonia;
    private String municipio;
    private String comentarios;
    private long codigoPostal;
    private String ciudad;
    private String estado;
    private String pais;
    private long telOficina;
    private long telMovil;



    public long getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(long idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public long getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(long codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public long getTelOficina() {
        return telOficina;
    }

    public void setTelOficina(long telOficina) {
        this.telOficina = telOficina;
    }

    public long getTelMovil() {
        return telMovil;
    }

    public void setTelMovil(long telMovil) {
        this.telMovil = telMovil;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
