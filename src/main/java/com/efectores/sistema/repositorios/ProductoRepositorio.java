
package com.efectores.sistema.repositorios;

import com.efectores.sistema.entidades.ProductoEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends JpaRepository<ProductoEntidad,String>{
    @Query("SELECT p FROM ProductoEntidad p WHERE p.nombre = :nombre")
    public ProductoEntidad buscarPorNombre(@Param("nombre") String nombre);      
}
