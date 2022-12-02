package ua.com.vitkovska.exhibition.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.vitkovska.exhibition.entity.Assortment;

import java.util.List;
import java.util.Optional;

public interface AssortmentRepository extends JpaRepository<Assortment, Integer> {
    Optional<Assortment> findAssortmentByOrganization_IdAndProduct_Id(int organizationId, int assortmentId);

    List<Assortment> findAssortmentByExhibition_Id(int exhibitionId);

    List<Assortment> findAssortmentByOrganization_Id(int organizationId);
}
