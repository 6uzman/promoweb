package com.isol.promoweb.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.util.Date;

/**
 * Created by Miguel Guzman on 10/05/2016.
 */
@Entity
public class Lanzamiento {
    @Id
    @GeneratedValue
    private long idLanzamiento;

    private String titulo;
    private String artista;
    private String etiqueta;
    private String cat;
    private Date fechaCreacion;
    private Date fechaLanzamiento;
    private String descripcion;
    private String rutaCubierta;

}
