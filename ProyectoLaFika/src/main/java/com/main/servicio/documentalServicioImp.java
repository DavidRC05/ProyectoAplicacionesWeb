/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.servicio;

import com.main.dao.documentalDao;
import com.main.domain.documental;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class documentalServicioImp implements documentalServicio{
    
    @Autowired
    private documentalDao objDao;
            
    @Override
    @Transactional(readOnly = true)
    public List<documental> listaDocumentales() {
      return (List<documental>) objDao.findAll();
    }
    @Override
    @Transactional
    public void guardar(documental obj) {
        objDao.save(obj);
    }

    @Override
    @Transactional
    public void borrar(documental obj) {
        objDao.delete(obj);
    }

    @Override
    public documental localizarUsuario(documental obj) {
        return objDao.findById(obj.getIddocumental()).orElse(null);
    }
    
}
