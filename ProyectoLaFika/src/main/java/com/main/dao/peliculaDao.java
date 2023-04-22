
package com.main.dao;

import com.main.domain.pelicula;
import com.main.domain.serie;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface peliculaDao extends CrudRepository<pelicula, Long>{
    
    @Query("SELECT p FROM pelicula p WHERE p.nombre LIKE %?1%")
    public List<pelicula> findAll(String palabra);
}
