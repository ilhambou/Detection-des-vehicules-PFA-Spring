package com.youtube.jwt.controller;

import com.youtube.jwt.entity.FicheDeRecherche;
import com.youtube.jwt.service.IPersonne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personne")
@CrossOrigin(origins = "http://localhost:4200",

        allowedHeaders = {"Access-Control-Allow-Origin", "Content-Type"})
public class Personne {


    @Autowired
    private IPersonne iPersonne;

    @GetMapping
    public ResponseEntity<List<com.youtube.jwt.entity.Personne>> getAllStades() {
        List<com.youtube.jwt.entity.Personne> stades = iPersonne.getAll();
        return new ResponseEntity<>(stades, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public ResponseEntity<com.youtube.jwt.entity.Personne> registreForm(@RequestBody com.youtube.jwt.entity.Personne stade){
        System.out.println(stade.toString());
        return new ResponseEntity<>(iPersonne.save(stade), HttpStatus.OK);
    }
    // Handle preflight requests
    @RequestMapping(method = RequestMethod.OPTIONS)
    public ResponseEntity<?> handleOptions() {
        return ResponseEntity.ok().build();
    }
    @DeleteMapping ("/{id}")
    public void Delete(@PathVariable Long id){
        iPersonne.deleteById(id);
    }
    @PutMapping("/updateClient")
    public com.youtube.jwt.entity.Personne updateStade(@RequestBody com.youtube.jwt.entity.Personne stade){
        System.out.println(stade.toString());
        return iPersonne.update(stade);
    }



}
