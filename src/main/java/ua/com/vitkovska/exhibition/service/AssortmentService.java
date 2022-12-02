package ua.com.vitkovska.exhibition.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.vitkovska.exhibition.entity.Assortment;
import ua.com.vitkovska.exhibition.repository.AssortmentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AssortmentService implements IService<Assortment> {


    private AssortmentRepository assortmentRepository;

    @Autowired
    public void setAssortmentRepository(AssortmentRepository assortmentRepository) {
        this.assortmentRepository = assortmentRepository;
    }

    @Override
    public List<Assortment> findAll() {
        return assortmentRepository.findAll();
    }

    @Override
    public Optional<Assortment> findById(int id) {
        return assortmentRepository.findById(id);
    }

    @Override
    public void save(Assortment entity) {
        assortmentRepository.save(entity);
    }

    @Override
    public void deleteById(int id) {
        assortmentRepository.deleteById(id);
    }

    public List<Assortment> findAllByExhibitionId(int exhibitionId) {
        return assortmentRepository.findAssortmentByExhibition_Id(exhibitionId);
    }

    public List<Assortment> findAllByOrganizationId(int organizationId) {
        return assortmentRepository.findAssortmentByOrganization_Id(organizationId);
    }

    public Optional<Assortment> findAssortmentByOrganization_IdAndProduct_Id(int organizationId, int productId) {
        return assortmentRepository.findAssortmentByOrganization_IdAndProduct_Id(organizationId, productId);
    }

}
