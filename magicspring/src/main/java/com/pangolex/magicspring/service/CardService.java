package com.pangolex.magicspring.service;

import com.pangolex.magicspring.dto.CardDTO;
import com.pangolex.magicspring.exception.MagicSpringException;

public interface CardService {
    public CardDTO getCard(Integer id) throws MagicSpringException;
}
