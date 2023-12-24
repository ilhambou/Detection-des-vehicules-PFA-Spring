package com.youtube.jwt.entity;

import javax.persistence.*;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String CIN;
    private String nom;
    private String prenom;
    private String adresse;
    private String numeroTelephone;
    private String email;
    private int age;
    private char sexe; // 'M' pour masculin, 'F' pour féminin, par exemple





}
