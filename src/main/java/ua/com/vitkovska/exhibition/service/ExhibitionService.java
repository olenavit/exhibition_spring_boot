package ua.com.vitkovska.exhibition.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.vitkovska.exhibition.entity.Exhibition;
import ua.com.vitkovska.exhibition.repository.ExhibitionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ExhibitionService implements IService<Exhibition> {

    private ExhibitionRepository exhibitionRepository;

    @Autowired
    public void setExhibitionRepository(ExhibitionRepository exhibitionRepository) {
        this.exhibitionRepository = exhibitionRepository;
    }

    @Override
    public List<Exhibition> findAll() {
        return exhibitionRepository.findAll();
    }

    @Override
    public Optional<Exhibition> findById(int id) {
        return exhibitionRepository.findById(id);
    }

    @Override
    public void save(Exhibition entity) {
        exhibitionRepository.save(entity);
    }

    @Override
    public void deleteById(int id) {
        exhibitionRepository.deleteById(id);
    }

    public List<Exhibition> searchByName(String name) {
        if (name != null && (name.trim().length() > 0)){
            return exhibitionRepository.findAllByNameContainsAllIgnoreCase(name);
        }
        else return findAll();
    }
}
