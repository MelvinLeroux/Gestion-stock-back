package com.melvin.gestiondestock.repository;

import java.util.Optional;

import com.melvin.gestiondestock.model.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenteRepository extends JpaRepository<Vente, Integer> {

    Optional<Vente> findVentesByCode(String code);
}
