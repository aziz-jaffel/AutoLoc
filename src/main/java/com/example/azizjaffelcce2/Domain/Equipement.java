package com.example.azizjaffelcce2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEquipement;

    String libelle;

    @ManyToMany(mappedBy = "equipements")
    @ToString.Exclude
    List<Vehicule> vehicules;
}