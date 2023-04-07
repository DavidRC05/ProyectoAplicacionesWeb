/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.servicio;

import com.main.dao.usuarioDao;
import com.main.domain.usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class usuarioServicioImp implements usuarioServicio{
    
    @Autowired
    private usuarioDao objDao;
            
    @Override
    @Transactional(readOnly = true)
    public List<usuario> listaUsuarios() {
      return (List<usuario>) objDao.findAll();
    }
    @Override
    @Transactional
    public void guardar(usuario obj) {
        objDao.save(obj);
    }

    @Override
    @Transactional
    public void borrar(usuario obj) {
        objDao.delete(obj);
    }

    @Override
    public usuario localizarUsuario(usuario obj) {
        return objDao.findById(obj.getIdusuario()).orElse(null);
    }
    
}
