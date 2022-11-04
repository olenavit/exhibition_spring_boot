package ua.com.vitkovska.exhibition.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.vitkovska.exhibition.entity.Exhibition;
import ua.com.vitkovska.exhibition.repository.ExhibitionRepository;

import java.util.List;

@Service
public class ExhibitionService implements IService<Exhibition> {

    private final ExhibitionRepository exhibitionRepository;

    @Autowired
    public ExhibitionService(ExhibitionRepository exhibitionRepository) {
        this.exhibitionRepository = exhibitionRepository;
    }

    @Override
    public List<Exhibition> findAll() {
       return exhibitionRepository.findAll();
    }

    @Override
    public Exhibition findById(int id) {
        return null;
    }

    @Override
    public void save(Exhibition entity) {

    }

    @Override
    public void deleteById(int id) {

    }
}
