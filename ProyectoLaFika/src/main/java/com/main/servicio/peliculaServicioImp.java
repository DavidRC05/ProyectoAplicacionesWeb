/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.servicio;

import com.main.dao.peliculaDao;
import com.main.domain.pelicula;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class peliculaServicioImp implements peliculaServicio{
    
    @Autowired
    private peliculaDao objDao;
            
    @Override
    @Transactional(readOnly = true)
    public List<pelicula> listaPeliculas(String palabra) {
        if (palabra !=null){
            return (List<pelicula>) objDao.findAll(palabra);
        }
      return (List<pelicula>) objDao.findAll();
    }
    @Override
    @Transactional
    public void guardar(pelicula obj) {
        objDao.save(obj);
    }

    @Override
    @Transactional
    public void borrar(pelicula obj) {
        objDao.delete(obj);
    }

    @Override
    public pelicula localizarUsuario(pelicula obj) {
        return objDao.findById(obj.getIdpelicula()).orElse(null);
    }
    
}
