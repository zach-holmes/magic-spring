package com.pangolex.magicspring.service;

import com.pangolex.magicspring.dto.CardDTO;
import com.pangolex.magicspring.entity.Card;
import com.pangolex.magicspring.exception.MagicSpringException;
import com.pangolex.magicspring.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service(value = "cardService")
@Transactional
public class CardServiceImpl implements CardService{
    @Autowired
    private CardRepository cardRepository;

    @Override
    public CardDTO getCard(Integer id) throws MagicSpringException{
        Optional<Card> optional = cardRepository.findById(id);
        Card card = optional.orElseThrow(() -> new MagicSpringException("SERVICE.CARD_NOT_FOUND"));
        CardDTO cardDTO = new CardDTO();
        cardDTO.EntityToDTO(card);
        return cardDTO;
    }
}
