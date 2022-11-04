package ua.com.vitkovska.exhibition.service;

import org.springframework.stereotype.Service;
import ua.com.vitkovska.exhibition.entity.Product;

import java.util.List;

@Service
public class ProductService implements IService<Product> {
    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void save(Product entity) {

    }

    @Override
    public void deleteById(int id) {

    }
}
