package com.main.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table (name = "pelicula")
public class pelicula implements Serializable{
    private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idpelicula;
    private String nombre;
    private String sipnosis;
    private int minutos;
    private int year;
    private String linktrailer;
    private String linkbanner;
}
