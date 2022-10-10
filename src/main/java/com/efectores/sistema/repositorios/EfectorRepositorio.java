
package com.efectores.sistema.repositorios;

import com.efectores.sistema.entidades.EfectorEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EfectorRepositorio extends JpaRepository<EfectorEntidad,String>{
    @Query("SELECT e FROM EfectorEntidad e WHERE e.nombre = :nombre")
    public EfectorEntidad buscarPorNombre(@Param("nombre") String nombre);    
}
