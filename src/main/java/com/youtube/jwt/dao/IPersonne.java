package com.youtube.jwt.dao;

import  com.youtube.jwt.entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "personnes", path = "personne")

public interface IPersonne extends JpaRepository<Personne, Long> {
}
