package com.projetor.rh.Repository;

import com.projetor.rh.model.Prestataire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestataireRepository extends JpaRepository<Prestataire, Integer> {

}
