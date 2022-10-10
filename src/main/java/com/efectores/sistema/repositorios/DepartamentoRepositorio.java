
package com.efectores.sistema.repositorios;

import com.efectores.sistema.entidades.DepartamentoEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepositorio extends JpaRepository<DepartamentoEntidad,String>{
    @Query("SELECT d FROM DepartamentoEntidad d WHERE d.nombre = :nombre")
    public DepartamentoEntidad buscarPorNombre(@Param("nombre") String nombre);
  
}
