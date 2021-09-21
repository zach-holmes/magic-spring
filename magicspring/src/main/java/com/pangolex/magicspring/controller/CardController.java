package com.pangolex.magicspring.controller;

import com.pangolex.magicspring.dto.CardDTO;
import com.pangolex.magicspring.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class CardController {
    @Autowired
    CardService cardService;

    @Autowired
    Environment environment;

    @GetMapping(value = "/card/{id}")
    public ResponseEntity<CardDTO> getCard(@PathVariable Integer id){
        try {
            CardDTO cardDTO = cardService.getCard(id);
            return new ResponseEntity<>(cardDTO,HttpStatus.OK);
        } catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, environment.getProperty(e.getMessage()));
        }

    }
}
