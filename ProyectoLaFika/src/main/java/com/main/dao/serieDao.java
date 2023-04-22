
package com.main.dao;

import com.main.domain.serie;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface serieDao extends CrudRepository<serie, Long>{
    
    @Query("SELECT s FROM serie s WHERE s.nombre LIKE %?1%")
    public List<serie> findAll(String palabra);
}
