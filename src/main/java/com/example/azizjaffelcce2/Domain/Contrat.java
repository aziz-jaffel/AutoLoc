package com.example.azizjaffelcce2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idContrat;

    LocalDate dateSignature;
    BigDecimal montantTotal;
    boolean valide;

    @OneToOne
    Reservation reservation;

    @OneToMany(mappedBy = "contrat")
    @ToString.Exclude
    List<Paiement> paiements;
}