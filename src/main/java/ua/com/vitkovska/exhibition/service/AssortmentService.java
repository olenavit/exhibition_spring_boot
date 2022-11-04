package ua.com.vitkovska.exhibition.service;



import org.springframework.stereotype.Service;
import ua.com.vitkovska.exhibition.entity.Assortment;

import java.util.List;

@Service
public class AssortmentService implements IService<Assortment> {
    @Override
    public List<Assortment> findAll() {
        return null;
    }

    @Override
    public Assortment findById(int id) {
        return null;
    }

    @Override
    public void save(Assortment entity) {

    }

    @Override
    public void deleteById(int id) {

    }
}
