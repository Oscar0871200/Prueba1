package com.example.inicial1.services;
import java.util.List;

public interface BaseService <E> {
    public List<E> findAll() throws Exception;
    //Nos trae una lista de las personas
    public E findById(Long id) throws Exception;
    //Obtenien una persona según su ID
    public E save(E entity) throws Exception;
    //Guarda una entidad que enviamos
    public E update(Long id, E entity) throws Exception;
    //Actualiza la persona del Id
    public boolean delete (Long id) throws Exception;
    //Borra según el Id de la BD
}
