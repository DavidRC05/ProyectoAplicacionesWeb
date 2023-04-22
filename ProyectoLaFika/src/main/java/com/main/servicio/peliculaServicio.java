/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.servicio;

import com.main.domain.pelicula;
import java.util.List;

/**
 *
 * @author maxta
 */
public interface peliculaServicio {
    
    public List<pelicula> listaPeliculas(String palabra);
    public void guardar(pelicula obj);
    public void borrar(pelicula obj);
    public pelicula localizarUsuario(pelicula obj);
}
