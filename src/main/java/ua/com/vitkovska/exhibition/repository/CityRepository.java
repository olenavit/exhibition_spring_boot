package ua.com.vitkovska.exhibition.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.vitkovska.exhibition.entity.City;

public interface CityRepository  extends JpaRepository<City, Integer> {
}
