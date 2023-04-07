/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.servicio;

import com.main.domain.usuario;
import java.util.List;

/**
 *
 * @author maxta
 */
public interface usuarioServicio {
    
    public List<usuario> listaUsuarios();
    public void guardar(usuario obj);
    public void borrar(usuario obj);
    public usuario localizarUsuario(usuario obj);
}
