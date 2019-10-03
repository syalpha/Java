package com.projetor.rh.controller;

import com.projetor.rh.Repository.PrestataireRepository;
import com.projetor.rh.model.Prestataire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @CrossOrigin
    @RequestMapping(value = "/employe")
    public class PrestataireController {
        @Autowired
        private PrestataireRepository prestataireRepository;
        @GetMapping(value = "/liste")
        @PreAuthorize("hasAuthority('ROLE_ADMIN')")
        public List<Prestataire> liste(){
            return prestataireRepository.findAll();
        }
    }

