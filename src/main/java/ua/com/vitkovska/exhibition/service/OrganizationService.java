package ua.com.vitkovska.exhibition.service;



import org.springframework.stereotype.Service;
import ua.com.vitkovska.exhibition.entity.Organization;

import java.util.List;


@Service
public class OrganizationService implements IService<Organization>{
    @Override
    public List<Organization> findAll() {
        return null;
    }

    @Override
    public Organization findById(int id) {
        return null;
    }

    @Override
    public void save(Organization entity) {

    }

    @Override
    public void deleteById(int id) {

    }
}
