package com.youtube.jwt.entity;

import javax.persistence.*;
import java.util.List;
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
public class FicheDeRecherche {
    @Id     @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @OneToMany
  private List<Vehicule> vehicule;
    @OneToOne
    private Personne personne;
}
