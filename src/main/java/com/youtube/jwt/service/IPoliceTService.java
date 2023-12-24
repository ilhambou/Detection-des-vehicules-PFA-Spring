package com.youtube.jwt.service;

import com.youtube.jwt.entity.PoliceT;

import java.util.List;
import java.util.Optional;

public interface IPoliceTService {
    List<PoliceT> getAll();
    PoliceT save(PoliceT article);
    void deleteById(Long id);
    Optional<PoliceT> findById(Long id);
    PoliceT update(PoliceT stade);
}
