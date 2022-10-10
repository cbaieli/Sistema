package com.efectores.sistema.servicios;

import com.efectores.sistema.entidades.PaisEntidad;
import com.efectores.sistema.excepciones.MiException;
import com.efectores.sistema.repositorios.PaisRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisServicio {    
    @Autowired
    private PaisRepositorio paisRepositorio;
    
    @Transactional
    public void crearPais (Long id, String nombre) throws MiException{
        validar(id, nombre);
        PaisEntidad paisEntidad = new PaisEntidad();
        paisEntidad.setNombre(nombre);
        paisRepositorio.save(paisEntidad);
    }
    
    public List<PaisEntidad> listarPais(){
        List<PaisEntidad> paisesEntidades = new ArrayList();
        paisesEntidades = paisRepositorio.findAll();
        return paisesEntidades;
    }    
    
    @Transactional
    public void modificarPais (Long id, String nombre)  throws MiException{
        validar(id, nombre);
        Optional<PaisEntidad> respuestaPais = paisRepositorio.findById(id);
        if(respuestaPais.isPresent()){
            PaisEntidad paisEntidad = respuestaPais.get();
            paisEntidad.setNombre(nombre);
            paisRepositorio.save(paisEntidad);
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
