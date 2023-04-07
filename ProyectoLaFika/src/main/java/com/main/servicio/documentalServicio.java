/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.servicio;

import com.main.domain.documental;
import java.util.List;

/**
 *
 * @author maxta
 */
public interface documentalServicio {
    
    public List<documental> listaDocumentales();
    public void guardar(documental obj);
    public void borrar(documental obj);
    public documental localizarUsuario(documental obj);
}
