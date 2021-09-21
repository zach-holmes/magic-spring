package com.pangolex.magicspring.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "tokens")
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "artist")
    private String artist;
    @Column(name = "asciiName")
    private String asciiName;
    @Column(name = "availability")
    private String availability;
    @Column(name = "borderColor")
    private String borderColor;
    @Column(name = "colorIdentity")
    private String colorIdentity;
    @Column(name = "colors")
    private String colors;
    @Column(name = "edhrecRank")
    private Integer edhrecRank;
    @Column(name = "faceName")
    private String faceName;
    @Column(name = "finishes")
    private String finishes;
    @Column(name = "flavorText")
    private String flavorText;
    @Column(name = "frameEffects")
    private String frameEffects;
    @Column(name = "frameVersion")
    private String frameVersion;
    @Column(name = "hasFoil")
    private Integer hasFoil;
    @Column(name = "hasNonFoil")
    private Integer hasNonFoil;
    @Column(name = "isFullArt")
    private Integer isFullArt;
    @Column(name = "isPromo")
    private Integer isPromo;
    @Column(name = "isReprint")
    private Integer isReprint;
    @Column(name = "keywords")
    private String keywords;
    @Column(name = "layout")
    private String layout;
    @Column(name = "mcmId")
    private String mcmId;
    @Column(name = "mtgArenaId")
    private String mtgArenaId;
    @Column(name = "mtgjsonV4Id")
    private String mtgjsonV4Id;
    @Column(name = "multiverseId")
    private String multiverseId;
    @Column(name = "name")
    private String name;
    @Column(name = "number")
    private String number;
    @Column(name = "originalText")
    private String originalText;
    @Column(name = "originalType")
    private String originalType;
    @Column(name = "power")
    private String power;
    @Column(name = "promoTypes")
    private String promoTypes;
    @Column(name = "reverseRelated")
    private String reverseRelated;
    @Column(name = "scryfallId")
    private String scryfallId;
    @Column(name = "scryfallIllustrationId")
    private String scryfallIllustrationId;
    @Column(name = "scryfallOracleId")
    private String scryfallOracleId;
    @Column(name = "setCode")
    private String setCode;
    @Column(name = "side")
    private String side;
    @Column(name = "subtypes")
    private String subtypes;
    @Column(name = "supertypes")
    private String supertypes;
    @Column(name = "tcgplayerProductId")
    private String tcgplayerProductId;
    @Column(name = "text")
    private String text;
    @Column(name = "toughness")
    private String toughness;
    @Column(name = "type")
    private String type;
    @Column(name = "types")
    private String types;
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "watermark")
    private String watermark;
}
