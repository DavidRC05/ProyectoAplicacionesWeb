
package com.main.dao;

import com.main.domain.documental;
import com.main.domain.serie;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface documentalDao extends CrudRepository<documental, Long>{
    @Query("SELECT d FROM documental d WHERE d.nombre LIKE %?1%")
    public List<documental> findAll(String palabra);
}
