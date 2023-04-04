package com.main.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table (name = "documental")
public class documental implements Serializable{
    private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iddocumental;
    private String nombre;
    private String tema;
    private int year;
    private String linktrailer;
    private String linkbanner;
    private int minutos;
    private String sipnosis;
            
}
