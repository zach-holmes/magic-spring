package com.pangolex.magicspring.entity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "set_translations")
public class SetTranslation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String language;
    @Column(name = "setCode")
    String setCode;
    String translation;
}
