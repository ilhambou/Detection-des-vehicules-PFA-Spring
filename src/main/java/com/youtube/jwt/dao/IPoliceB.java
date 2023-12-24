package com.youtube.jwt.dao;

import  com.youtube.jwt.entity.PoliceBri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "policebris", path = "policebri")

public interface IPoliceB extends JpaRepository<PoliceBri, Long> {
}
