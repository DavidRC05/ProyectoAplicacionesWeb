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
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
            
    @GetMapping({"/", "/login"})
    public String comienzo(Model model){
        return "index";
    }
    @GetMapping("/menu")
    public String menu(Model model){
        return "menu";
    }
    @GetMapping("/admin")
    public String admin(Model model){
        return "admin";
    }
    @GetMapping("/user")
    public String user(Model model){
        return "user";
    }
    
    @GetMapping("/usuarios")
    public String getUsuarios(Model model){
        
        List<usuario> usuarios = usuariServicio.listaUsuarios();
        
        log.info("Estoy ejecutando el controlador MVC");
        
        model.addAttribute("usuarios",usuarios);
        return "usuarios";
    }
    
    
    
    @GetMapping("/busqueda")
    public String buscar(Model model, @Param("palabra") String palabra){
        
        List<documental> documentales = docuServicio.listaDocumentales(palabra);
        List<serie> series = seriServicio.listaSerie(palabra);
        List<pelicula> peliculas = peliServicio.listaPeliculas(palabra);
        
        
        model.addAttribute("peliculas",peliculas);
        model.addAttribute("series",series);
        model.addAttribute("documentales",documentales);
        model.addAttribute("palabra", palabra);
        return "Busqueda";
    }
    
    
    @GetMapping("/series")
    public String getSeries(Model model){
        
        List<serie> series = seriServicio.listaSerie(null);
        
        log.info("Estoy ejecutando el controlador MVC");
        
        model.addAttribute("series",series);
        return "Series";
    }
    
    @GetMapping("/peliculas")
    public String getPeliculas(Model model){
        
        List<pelicula> peliculas = peliServicio.listaPeliculas(null);
        
        log.info("Estoy ejecutando el controlador MVC");
        
        model.addAttribute("peliculas",peliculas);
        return "Peliculas";
    }
    
    @GetMapping("/documentales")
    public String getDocumentales(Model model){
        
        List<documental> documentales = docuServicio.listaDocumentales(null);
        
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
        usuari.setRol("admin");
        usuariServicio.guardar(usuari);
        return "redirect:/usuarios";
    }
    @PostMapping("/guardarUsuario")
    public String guardarUser(usuario usuari){
        usuari.setRol("user");
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
    
    @PostMapping("/buscar")
    public String buscar(@RequestParam("palabra") String key){
        System.out.println(key);
        return "redirect:/busqueda";
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
