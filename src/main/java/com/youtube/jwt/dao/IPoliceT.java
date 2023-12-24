package com.youtube.jwt.dao;

import com.youtube.jwt.entity.PoliceT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "policets", path = "policet")
public interface IPoliceT extends JpaRepository<PoliceT, Long> {
}
