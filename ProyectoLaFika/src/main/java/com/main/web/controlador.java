/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.web;

import com.main.dao.documentalDao;
import com.main.dao.peliculaDao;
import com.main.dao.serieDao;
import com.main.dao.usuarioDao;
import com.main.domain.serie;
import com.main.domain.pelicula;
import com.main.domain.documental;
import com.main.domain.usuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class controlador {
    
    @Autowired
    private usuarioDao usuariDao;
    @Autowired
    private serieDao seriDao;
    @Autowired
    private documentalDao docuDao;
    @Autowired
    private peliculaDao peliDao;
            
    @GetMapping("/")
    public String comienzo(Model model){
        return "index";
    }
    
    @GetMapping("/usuarios")
    public String getUsuarios(Model model){
        
        Iterable<usuario> usuarios = usuariDao.findAll();
        
        log.info("Estoy ejecutando el controlador MVC");
        
        model.addAttribute("usuarios",usuarios);
        return "usuarios";
    }
    
    @GetMapping("/series")
    public String getSeries(Model model){
        
        Iterable<serie> series = seriDao.findAll();
        
        log.info("Estoy ejecutando el controlador MVC");
        
        model.addAttribute("series",series);
        return "Series";
    }
    
    @GetMapping("/peliculas")
    public String getPeliculas(Model model){
        
        Iterable<pelicula> peliculas = peliDao.findAll();
        
        log.info("Estoy ejecutando el controlador MVC");
        
        model.addAttribute("peliculas",peliculas);
        return "Peliculas";
    }
    
    @GetMapping("/documentales")
    public String getDocumentales(Model model){
        
        Iterable<documental> documentales = docuDao.findAll();
        
        log.info("Estoy ejecutando el controlador MVC");
        
        model.addAttribute("documentales",documentales);
        return "Documentales";
    }
}
