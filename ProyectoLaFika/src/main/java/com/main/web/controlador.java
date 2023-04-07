/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.web;

import com.main.servicio.documentalServicio;
import com.main.servicio.peliculaServicio;
import com.main.servicio.usuarioServicio;
import com.main.domain.serie;
import com.main.domain.pelicula;
import com.main.domain.documental;
import com.main.domain.usuario;
import com.main.servicio.serieServicio;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Slf4j
public class controlador {
    
    @Autowired
    private usuarioServicio usuariServicio;
    @Autowired
    private serieServicio seriServicio;
    @Autowired
    private documentalServicio docuServicio;
    @Autowired
    private peliculaServicio peliServicio;
            
    @GetMapping("/")
    public String comienzo(Model model){
        return "index";
    }
    
    @GetMapping("/usuarios")
    public String getUsuarios(Model model){
        
        List<usuario> usuarios = usuariServicio.listaUsuarios();
        
        log.info("Estoy ejecutando el controlador MVC");
        
        model.addAttribute("usuarios",usuarios);
        return "usuarios";
    }
    
    @GetMapping("/series")
    public String getSeries(Model model){
        
        List<serie> series = seriServicio.listaSerie();
        
        log.info("Estoy ejecutando el controlador MVC");
        
        model.addAttribute("series",series);
        return "Series";
    }
    
    @GetMapping("/peliculas")
    public String getPeliculas(Model model){
        
        List<pelicula> peliculas = peliServicio.listaPeliculas();
        
        log.info("Estoy ejecutando el controlador MVC");
        
        model.addAttribute("peliculas",peliculas);
        return "Peliculas";
    }
    
    @GetMapping("/documentales")
    public String getDocumentales(Model model){
        
        List<documental> documentales = docuServicio.listaDocumentales();
        
        log.info("Estoy ejecutando el controlador MVC");
        
        model.addAttribute("documentales",documentales);
        return "Documentales";
    }
    
    @GetMapping("/nuevoAdministrador")
    public String newAdmin(usuario usuari){
        return "nuevoAdmin";
    }
    
    @PostMapping("/guardarAdministrador")
    public String guardarAdmin(usuario usuari){
        usuariServicio.guardar(usuari);
        return "redirect:/usuarios";
    }
    @GetMapping("/nuevaSerie")
    public String newSerie(serie seri){
        return "nuevaSerie";
    }
    
    @PostMapping("/guardarSerie")
    public String guardarSerie(serie seri){
        seriServicio.guardar(seri);
        return "redirect:/series";
    }
    
    @GetMapping("/nuevaPelicula")
    public String newPelicula(pelicula peli){
        return "nuevaPelicula";
    }
    
    @PostMapping("/guardarPelicula")
    public String guardarPelicula(pelicula peli){
        peliServicio.guardar(peli);
        return "redirect:/peliculas";
    }
    
    @GetMapping("/nuevoDocumental")
    public String newDocumental(documental docu){
        return "nuevoDocumental";
    }
    
    @PostMapping("/guardarDocumental")
    public String guardarDocumental(documental docu){
        docuServicio.guardar(docu);
        return "redirect:/documentales";
    }
    
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    
    @GetMapping("/registrarse")
    public String registrarse(){
        return "nuevoUsuario";
    }
}
