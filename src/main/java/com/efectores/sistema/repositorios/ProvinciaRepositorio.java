
package com.efectores.sistema.repositorios;
import com.efectores.sistema.entidades.ProvinciaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinciaRepositorio extends JpaRepository<ProvinciaEntidad,Long>{
    @Query("SELECT pr FROM ProvinciaEntidad pr WHERE pr.nombre = :nombre")
    public ProvinciaEntidad buscarPorNombre(@Param("nombre") String nombre);
  
}