package ua.com.vitkovska.exhibition.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.vitkovska.exhibition.entity.City;
import ua.com.vitkovska.exhibition.repository.CityRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CityService implements IService<City> {

    private CityRepository cityRepository;

    @Autowired
    public void setCityRepository(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public Optional<City> findById(int id) {
        return Optional.empty();
    }


    @Override
    public void save(City entity) {
        cityRepository.save(entity);
    }

    @Override
    public void deleteById(int id) {
        cityRepository.deleteById(id);
    }
}
