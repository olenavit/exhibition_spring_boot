package ua.com.vitkovska.exhibition.service;

import java.util.List;

public interface IService<E> {
     List<E> findAll();

     E findById(int id);

     void save(E entity);

     void deleteById(int id);
}
