package ua.com.vitkovska.exhibition.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.vitkovska.exhibition.entity.Assortment;

public interface AssortmentRepository extends JpaRepository<Assortment, Integer> {
}
