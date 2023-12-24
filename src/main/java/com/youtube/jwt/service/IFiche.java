package com.youtube.jwt.service;

import com.youtube.jwt.entity.FicheDeRecherche;

import java.util.List;
import java.util.Optional;

public interface IFiche {
    List<FicheDeRecherche> getAll();
    FicheDeRecherche save(FicheDeRecherche article);
    void deleteById(Long id);
    Optional<FicheDeRecherche> findById(Long id);
    FicheDeRecherche update(FicheDeRecherche stade);

}
