package com.youtube.jwt.dao;

import com.youtube.jwt.entity.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "vehicules", path = "vehicule")
public interface IVehicule extends JpaRepository<Vehicule, Long> {
}
