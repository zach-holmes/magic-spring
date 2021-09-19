package com.pangolex.magicspring.service;

import com.pangolex.magicspring.dto.LegalitiesDTO;
import com.pangolex.magicspring.entity.Legalities;
import com.pangolex.magicspring.exception.MagicSpringException;

public interface LegalitiesService {
    public LegalitiesDTO getLegality(Integer id) throws MagicSpringException;
}
