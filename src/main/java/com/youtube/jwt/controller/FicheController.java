package com.youtube.jwt.controller;

import com.youtube.jwt.dao.IFicheDeRecherche;
import com.youtube.jwt.entity.FicheDeRecherche;
import com.youtube.jwt.service.FicheService;
import com.youtube.jwt.service.IFiche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ficher")
@CrossOrigin(origins = "http://localhost:4200",

        allowedHeaders = {"Access-Control-Allow-Origin", "Content-Type"})
public class FicheController {

    @Autowired
    private IFiche iFicheDeRecherche;

    @GetMapping
    public ResponseEntity<List<FicheDeRecherche>> getAllStades() {
        List<FicheDeRecherche> stades = iFicheDeRecherche.getAll();
        return new ResponseEntity<>(stades, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public ResponseEntity<FicheDeRecherche> registreForm(@RequestBody FicheDeRecherche stade){
        System.out.println(stade.toString());
        return new ResponseEntity<>(iFicheDeRecherche.save(stade), HttpStatus.OK);
    }
    // Handle preflight requests
    @RequestMapping(method = RequestMethod.OPTIONS)
    public ResponseEntity<?> handleOptions() {
        return ResponseEntity.ok().build();
    }
    @DeleteMapping ("/{id}")
    public void Delete(@PathVariable Long id){
        iFicheDeRecherche.deleteById(id);
    }
    @PutMapping("/updateClient")
    public FicheDeRecherche updateStade(@RequestBody FicheDeRecherche stade){
        System.out.println(stade.toString());
        return iFicheDeRecherche.update(stade);
    }




}
