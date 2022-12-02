package ua.com.vitkovska.exhibition.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.vitkovska.exhibition.entity.Product;
import ua.com.vitkovska.exhibition.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IService<Product> {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }


    @Override
    public void save(Product entity) {
        productRepository.save(entity);
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }

    public Optional<Product> findByName(String name) {
        return productRepository.findByName(name);
    }

    public boolean existsByName(String name) {
       return productRepository.existsByName(name);
    }
}
