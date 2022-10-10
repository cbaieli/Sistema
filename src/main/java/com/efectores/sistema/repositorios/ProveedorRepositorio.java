
package com.efectores.sistema.repositorios;

import com.efectores.sistema.entidades.PaisEntidad;
import com.efectores.sistema.entidades.ProveedorEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepositorio extends JpaRepository<ProveedorEntidad,String>{
    @Query("SELECT pa FROM PaisEntidad pa WHERE pa.nombre = :nombre")
    public PaisEntidad buscarPorNombre(@Param("nombre") String nombre);    
}
