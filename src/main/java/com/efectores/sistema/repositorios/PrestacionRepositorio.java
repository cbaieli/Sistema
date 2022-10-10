
package com.efectores.sistema.repositorios;

import com.efectores.sistema.entidades.PrestacionEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestacionRepositorio extends JpaRepository<PrestacionEntidad,String>{
    @Query("SELECT p FROM PrestacionEntidad p WHERE p.nombre = :nombre")
    public PrestacionEntidad buscarPorNombre(@Param("nombre") String nombre);  
    
}
