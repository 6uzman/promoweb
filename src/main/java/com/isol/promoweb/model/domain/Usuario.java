package com.isol.promoweb.model.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Date;


/**
 * Created by Miguel Guzman on 09/05/2016.
 */
@Entity
@Table
public class Usuario {
    @Id
    @GeneratedValue
    private long idUsuario;

    private String nombre;
    private String marca;
    private String email;
    private int estatus;
    private TipoMembresia membresia;
    private Date fechaCreacion;
    private Date fechamodificacion;

    //relationship
    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private Collection<Lanzamiento> lanzamientos;


    @OneToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private Direccion direccion;

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public TipoMembresia getMembresia() {
        return membresia;
    }

    public void setMembresia(TipoMembresia membresia) {
        this.membresia = membresia;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    public Collection<Lanzamiento> getLanzamientos() {
        return lanzamientos;
    }

    public void setLanzamientos(Collection<Lanzamiento> lanzamientos) {
        this.lanzamientos = lanzamientos;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}


