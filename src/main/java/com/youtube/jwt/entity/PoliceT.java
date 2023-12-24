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
public class PoliceT {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

 private String name;
 private String prenom;
 private String CIN;
 private String email;
 private String passsword;


}
