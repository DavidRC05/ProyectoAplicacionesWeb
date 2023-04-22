/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.servicio;

import com.main.dao.serieDao;
import com.main.domain.serie;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class serieServicioImp implements serieServicio{
    
    @Autowired
    private serieDao seriDao;
            
    @Override
    @Transactional(readOnly = true)
    public List<serie> listaSerie(String palabra) {
        if (palabra !=null){
            return (List<serie>) seriDao.findAll(palabra);
        }
      return (List<serie>) seriDao.findAll();
    }

    

    @Override
    @Transactional(readOnly = true)
    public serie localizarSerie(serie seri) {
       return seriDao.findById(seri.getIdserie()).orElse(null);
    }

    @Override
    @Transactional
    public void guardar(serie seri) {
        seriDao.save(seri);
    }

    @Override
    @Transactional
    public void borrar(serie seri) {
        seriDao.delete(seri);
    }
    
}
