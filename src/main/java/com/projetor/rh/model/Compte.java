package com.projetor.rh.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.util.Optional;

@Entity
@CrossOrigin
@Data
@RequestMapping(value = "/compte")
public class Compte {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
@Column(length = 5)
    private String numcompte;
@JoinColumn(name = "prestataire_id",referencedColumnName = "id")
@ManyToOne(optional=false)
@JsonIgnoreProperties("compte")
    private Prestataire prestataire;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumcompte() {
        return numcompte;
    }

    public void setNumcompte(String numcompte) {
        this.numcompte = numcompte;
    }

    public Prestataire getPrestataire() {
        return prestataire;
    }

    public void setPrestataire(Prestataire prestataire) {
        this.prestataire = prestataire;
    }
}
