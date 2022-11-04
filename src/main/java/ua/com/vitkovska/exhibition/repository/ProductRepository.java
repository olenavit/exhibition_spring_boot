package ua.com.vitkovska.exhibition.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.vitkovska.exhibition.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
