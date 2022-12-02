package ua.com.vitkovska.exhibition.service;

import java.util.List;
import java.util.Optional;

public interface IService<E> {
     List<E> findAll();

     Optional<E> findById(int id);

     void save(E entity);

     void deleteById(int id);
}
