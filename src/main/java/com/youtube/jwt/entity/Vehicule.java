package com.youtube.jwt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;
    @NotNull

    private String marque;
    @NotNull

    private String modele;
    @NotNull

    private String couleur;
    @NotNull

    private String carburant;
    @NotNull

    private boolean automatique;
    @NotNull

    private String licenseplate;
}
