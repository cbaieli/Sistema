
package com.efectores.sistema.repositorios;

import com.efectores.sistema.entidades.EmpresaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepositorio extends JpaRepository<EmpresaEntidad,String>{
    @Query("SELECT e FROM EmpresaEntidad e WHERE e.nombre = :nombre")
    public EmpresaEntidad buscarPorNombre(@Param("nombre") String nombre);
  
}
