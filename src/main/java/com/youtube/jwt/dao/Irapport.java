package com.youtube.jwt.dao;

import com.youtube.jwt.entity.Rapport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "rapport", path = "rapport")

public interface Irapport extends JpaRepository<Rapport, Long> {
}
