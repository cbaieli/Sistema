
package com.efectores.sistema.servicios;

import com.efectores.sistema.entidades.ProvinciaEntidad;
import com.efectores.sistema.excepciones.MiException;
import com.efectores.sistema.repositorios.ProvinciaRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaServicio {
    @Autowired
    private ProvinciaRepositorio provinciaRepositorio;
    
    @Transactional
    public void crearProvincia(Long id, String nombre) throws MiException{
        validar(id, nombre);
        ProvinciaEntidad provinciaEntidad = new ProvinciaEntidad();
        provinciaEntidad.setNombre(nombre);
        provinciaRepositorio.save(provinciaEntidad);        
    }
    
    public List<ProvinciaEntidad> listarProvincia(){
        List<ProvinciaEntidad> provinciasEntidades = new ArrayList();
        provinciasEntidades = provinciaRepositorio.findAll();
        return provinciasEntidades;
    }
    
    @Transactional
    public void modificarProvincia (Long id, String nombre) throws MiException{
        validar(id,nombre);
        Optional<ProvinciaEntidad> respuestaProvincia = provinciaRepositorio.findById(id);
        if(respuestaProvincia.isPresent()){
            ProvinciaEntidad provinciaEntidad = respuestaProvincia.get();
            provinciaEntidad.setNombre(nombre);
            provinciaRepositorio.save(provinciaEntidad);
        }
    }    
    
    private void validar(Long id, String nombre) throws MiException{
        if (id == null){
            throw new MiException("El codigo no puede ser nulo");
        }
        if (nombre.isEmpty() || nombre == null){
            throw new MiException("El nombre no puede ser nulo");
        }
    }    
}
