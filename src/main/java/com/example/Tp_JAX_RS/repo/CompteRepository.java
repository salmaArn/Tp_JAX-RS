package com.example.Tp_JAX_RS.repo;

import com.example.Tp_JAX_RS.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CompteRepository extends JpaRepository<Compte, Long> {


}
