package com.pangolex.magicspring.service;

import com.pangolex.magicspring.dto.LegalitiesDTO;
import com.pangolex.magicspring.entity.Legalities;
import com.pangolex.magicspring.exception.MagicSpringException;
import com.pangolex.magicspring.repository.LegalitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service(value = "legalitiesService")
@Transactional
public class LegalitiesServiceImpl implements LegalitiesService{

    @Autowired
    private LegalitiesRepository legalitiesRepository;

    @Override
    public LegalitiesDTO getLegality(Integer id) throws MagicSpringException {
        Optional<Legalities> optional = legalitiesRepository.findById(id);
        Legalities legality = optional.orElseThrow(() -> new MagicSpringException("SERVICE.LEGALITY_NOT_FOUND"));
        LegalitiesDTO legalitiesDTO = new LegalitiesDTO();
        legalitiesDTO.entityToDTO(legality);
        return legalitiesDTO;
    }
}
