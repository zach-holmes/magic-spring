package com.pangolex.magicspring.controller;

import com.pangolex.magicspring.dto.LegalitiesDTO;
import com.pangolex.magicspring.service.LegalitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class LegalityController {
    @Autowired
    LegalitiesService legalitiesService;

    @Autowired
    private Environment environment;

    @GetMapping("legalities/{id}")
    public ResponseEntity<LegalitiesDTO> getLegality(@PathVariable Integer id){
        try{
            LegalitiesDTO legalitiesDTO = legalitiesService.getLegality(id);
            return new ResponseEntity<>(legalitiesDTO, HttpStatus.OK);
        } catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,environment.getProperty(e.getMessage()));
        }
    }
}
