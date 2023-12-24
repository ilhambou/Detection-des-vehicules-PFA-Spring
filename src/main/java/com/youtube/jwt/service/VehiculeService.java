package com.youtube.jwt.service;

import com.youtube.jwt.entity.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class VehiculeService implements IVehicule{
    @Autowired
    private  com.youtube.jwt.dao.IVehicule iVehicule;
    @Override
    public List<Vehicule> getAll() {
        return iVehicule.findAll();
    }
    @Override
    public Vehicule save(Vehicule article) {return iVehicule.save(article);}
    @Override
    public void deleteById(Long id) {iVehicule.deleteById(id);}
    @Override
    public Optional<Vehicule> findById(Long id) {return Optional.empty();}
    @Override
    public Vehicule update(Vehicule stade) {
        return null;
    }
}
