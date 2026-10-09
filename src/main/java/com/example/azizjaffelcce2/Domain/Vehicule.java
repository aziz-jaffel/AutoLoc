package com.example.azizjaffelcce2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idVehicule;

    String immatriculation;
    String marque;
    String modele;

    @Enumerated(EnumType.STRING)
    CategorieVehicule categorie;

    BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    StatutVehicule statut;

    @ManyToOne
    Agence agence;
    @OneToMany(mappedBy = "vehicule")
    @ToString.Exclude
    List<Maintenance> maintenances;
    @ManyToMany
    @ToString.Exclude
    List<Equipement> equipements;
    @OneToMany(mappedBy = "vehicule")
    @ToString.Exclude
    List<Reservation> reservations;
}