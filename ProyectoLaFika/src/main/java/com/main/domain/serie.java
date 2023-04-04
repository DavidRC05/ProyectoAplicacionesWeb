package com.main.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table (name = "serie")
public class serie implements Serializable{
    private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idserie;
    private int temporadas;
    private String nombre;
    private int capitulos;
    private int year;
    private String sipnosis;
    private String linktrailer;
    private String linkbanner;
            
}
