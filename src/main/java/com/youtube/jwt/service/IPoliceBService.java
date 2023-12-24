package com.youtube.jwt.service;

import com.youtube.jwt.entity.PoliceBri;

import java.util.List;
import java.util.Optional;

public interface IPoliceBService {
    List<PoliceBri> getAll();
    PoliceBri save(PoliceBri article);
    void deleteById(Long id);
    Optional<PoliceBri> findById(Long id);
    PoliceBri update(PoliceBri stade);
}
