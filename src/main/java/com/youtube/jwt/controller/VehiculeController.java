package com.youtube.jwt.controller;

import com.youtube.jwt.entity.FicheDeRecherche;
import com.youtube.jwt.entity.Vehicule;
import com.youtube.jwt.service.FicheService;
import com.youtube.jwt.service.IVehicule;
import com.youtube.jwt.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicule")
@CrossOrigin(origins = "http://localhost:4200",

        allowedHeaders = {"Access-Control-Allow-Origin", "Content-Type"})
public class VehiculeController {
    @Autowired
    private VehiculeService vehiculeService;
    @GetMapping
    public ResponseEntity<List<Vehicule>> getAllStades() {
        List<Vehicule> stades = vehiculeService.getAll();
        return new ResponseEntity<>(stades, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public ResponseEntity<Vehicule> registreForm(@RequestBody Vehicule stade){
        System.out.println(stade.toString());
        return new ResponseEntity<>(vehiculeService.save(stade), HttpStatus.OK);
    }
    // Handle preflight requests
    @RequestMapping(method = RequestMethod.OPTIONS)
    public ResponseEntity<?> handleOptions() {
        return ResponseEntity.ok().build();
    }
    @DeleteMapping ("/{id}")
    public void Delete(@PathVariable Long id){
        vehiculeService.deleteById(id);
    }
    @PutMapping("/updateClient")
    public Vehicule updateStade(@RequestBody Vehicule stade){
        System.out.println(stade.toString());
        return vehiculeService.update(stade);
    }

}
