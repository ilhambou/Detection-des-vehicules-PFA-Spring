package com.youtube.jwt.controller;

import com.youtube.jwt.dao.Irapport;
import com.youtube.jwt.entity.Rapport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200",

        allowedHeaders = {"Access-Control-Allow-Origin", "Content-Type"})

//@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/rapports")
public class RapportController {

    private final Irapport rapportRepository;

    @Autowired
    public RapportController(Irapport rapportRepository) {
        this.rapportRepository = rapportRepository;
    }

    @PostMapping
    public ResponseEntity<?> addRapport(@RequestBody Rapport rapport) {
        // Ajouter une validation si nécessaire
        Rapport newRapport = rapportRepository.save(rapport);
        return new ResponseEntity<>(newRapport, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<Rapport>> getAllRapports() {
        List<Rapport> rapports = rapportRepository.findAll();
        return new ResponseEntity<>(rapports, HttpStatus.OK);
    }
}
