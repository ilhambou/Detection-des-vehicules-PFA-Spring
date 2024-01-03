package com.youtube.jwt.controller;



import com.youtube.jwt.dao.IFicheDeRecherche;
import com.youtube.jwt.dao.IPersonne;
import com.youtube.jwt.dao.IVehicule;
import com.youtube.jwt.entity.FicheDeRecherche;
import com.youtube.jwt.entity.Vehicule;
import com.youtube.jwt.entity.Personne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",

        allowedHeaders = {"Access-Control-Allow-Origin", "Content-Type"})

//@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
@RequestMapping("/api/fiches")
public class FicheController {

    private final IFicheDeRecherche ficheDeRechercheRepository;
    private final IPersonne personneRepository;
    private final IVehicule vehiculeRepository;

    @Autowired
    public FicheController(
            IFicheDeRecherche ficheDeRechercheRepository,
            IPersonne personneRepository,
            IVehicule vehiculeRepository) {
        this.ficheDeRechercheRepository = ficheDeRechercheRepository;
        this.personneRepository = personneRepository;
        this.vehiculeRepository = vehiculeRepository;
    }

    @PostMapping("/ajouter")
    public FicheDeRecherche ajouterFiche(@RequestBody FicheDeRecherche ficheDeRecherche) {
        // Check if there is an associated Personne
        if (ficheDeRecherche.getPersonne() != null) {
            // Save the associated Personne
            Personne savedPersonne = personneRepository.save(ficheDeRecherche.getPersonne());

            // Set the saved Personne in the FicheDeRecherche
            ficheDeRecherche.setPersonne(savedPersonne);
        }

        // Check if there are associated Vehicules
        if (ficheDeRecherche.getVehicules() != null && !ficheDeRecherche.getVehicules().isEmpty()) {
            // Save the associated Vehicules
            List<Vehicule> savedVehicules = vehiculeRepository.saveAll(ficheDeRecherche.getVehicules());

            // Set the saved Vehicules in the FicheDeRecherche
            ficheDeRecherche.setVehicules(savedVehicules);
        }

        // Save the FicheDeRecherche
        return ficheDeRechercheRepository.save(ficheDeRecherche);
    }


    @GetMapping("/list")
    public List<FicheDeRecherche> listerFiches() {
        return ficheDeRechercheRepository.findAll();
    }
}
