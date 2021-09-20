package com.pangolex.magicspring.repository;

import com.pangolex.magicspring.entity.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card,Integer> {
}
