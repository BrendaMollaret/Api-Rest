package com.desarrollo.apirest.Services;


import java.util.List;

public interface BaseService<E>{

    //Trae lista de todas las entidades que tiene la base de datos
    public List<E> findAll() throws Exception;

    //Traer una entidad de acuerdo de una entidad
    public E findById(Long id) throws Exception;

    //Crear nueva entidad
    public E save(E entity) throws Exception;

    //Actualiza una entidad, le pasamos el id de la entidad no actualizada y devuelve la entidad actualizada
    public E update(Long id, E entity) throws Exception;

    //Eliminar el registro de la base de datos
    public boolean delete(Long id) throws Exception;
}
