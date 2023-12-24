package com.youtube.jwt.service;

import com.youtube.jwt.dao.IFicheDeRecherche;
import com.youtube.jwt.entity.FicheDeRecherche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FicheService implements IFiche{
    @Autowired
    private IFicheDeRecherche iFicheDeRecherche;
    @Override
    public List<FicheDeRecherche> getAll() {
        return iFicheDeRecherche.findAll();
    }

    @Override
    public FicheDeRecherche save(FicheDeRecherche article) {
        return iFicheDeRecherche.save(article);
    }

    @Override
    public void deleteById(Long id) {
    iFicheDeRecherche.deleteById(id);
    }

    @Override
    public Optional<FicheDeRecherche> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public FicheDeRecherche update(FicheDeRecherche stade) {
        Long id = stade.getId();
        Optional<FicheDeRecherche> optionalStade = iFicheDeRecherche.findById(id);

        if (optionalStade.isPresent()) {
            FicheDeRecherche existingStade = optionalStade.get();
            existingStade.setRecherche(stade.getRecherche());

            return iFicheDeRecherche.save(existingStade);
        } else {
            // Stade with the given ID does not exist
            System.out.println("Fiche De Recherche with ID " + id + " does not exist");
            return null;
        }    }
}
