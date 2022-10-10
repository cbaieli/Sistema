
package com.efectores.sistema.repositorios;

import com.efectores.sistema.entidades.TipoProductoEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoProductoRepositorio extends JpaRepository<TipoProductoEntidad,String>{
    @Query("SELECT tp FROM TipoProuctoEntidad tp WHERE tp.nombre = :nombre")
    public TipoProductoEntidad buscarPorNombre(@Param("nombre") String nombre);      
}
