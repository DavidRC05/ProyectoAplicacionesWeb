/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.servicio;

import com.main.domain.serie;
import java.util.List;

/**
 *
 * @author maxta
 */
public interface serieServicio {
    
    public List<serie> listaSerie();
    public void guardar(serie seri);
    public void borrar(serie seri);
    public serie localizarSerie(serie seri);
}
