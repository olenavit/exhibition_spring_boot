package ua.com.vitkovska.exhibition.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.vitkovska.exhibition.entity.Exhibition;

public interface ExhibitionRepository extends JpaRepository<Exhibition,Integer> {
}
