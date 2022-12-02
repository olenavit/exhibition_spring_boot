package ua.com.vitkovska.exhibition.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.vitkovska.exhibition.entity.Organization;
import ua.com.vitkovska.exhibition.repository.OrganizationRepository;

import java.util.List;
import java.util.Optional;


@Service
public class OrganizationService implements IService<Organization> {


    private OrganizationRepository organizationRepository;

    @Autowired
    public void setOrganizationRepository(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public List<Organization> findAll() {
        return organizationRepository.findAll();
    }

    @Override
    public Optional<Organization> findById(int id) {
        return organizationRepository.findById(id);
    }


    @Override
    public void save(Organization entity) {
        organizationRepository.save(entity);
    }

    @Override
    public void deleteById(int id) {
        organizationRepository.deleteById(id);
    }
}
