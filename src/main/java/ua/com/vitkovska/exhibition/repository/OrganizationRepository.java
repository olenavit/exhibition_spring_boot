package ua.com.vitkovska.exhibition.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.vitkovska.exhibition.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
}
