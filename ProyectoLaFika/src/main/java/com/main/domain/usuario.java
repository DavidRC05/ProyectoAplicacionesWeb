package com.main.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table (name = "usuario")
public class usuario implements Serializable{
    private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idusuario;
    private String nombre;
    private String apellido;
    private String contrasena;
    private String username;
    private String rol;
    private int edad;
            
}
