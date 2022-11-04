package ua.com.vitkovska.exhibition.service;


import org.springframework.stereotype.Service;
import ua.com.vitkovska.exhibition.entity.City;

import java.util.List;

@Service
public class CityService implements IService<City> {
    @Override
    public List<City> findAll() {
        return null;
    }

    @Override
    public City findById(int id) {
        return null;
    }

    @Override
    public void save(City entity) {

    }

    @Override
    public void deleteById(int id) {

    }
}
