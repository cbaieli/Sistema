
package com.efectores.sistema.repositorios;

import com.efectores.sistema.entidades.TipoEnsenanzaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEnsenanzaRepositorio extends JpaRepository<TipoEnsenanzaEntidad,String>{
    @Query("SELECT pa FROM PaisEntidad pa WHERE pa.nombre = :nombre")
    public TipoEnsenanzaEntidad buscarPorNombre(@Param("nombre") String nombre);    
}
