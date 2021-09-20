package com.pangolex.magicspring.entity;

import com.pangolex.magicspring.model.card.CardBorderColor;
import com.pangolex.magicspring.model.card.CardRarity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="artist")
    private String artist;
    @Column(name="asciiName")
    private String asciiName;
    @Column(name="availability")
    private String availability;
    @Column(name="borderColor")
    @Enumerated(EnumType.STRING)
    private CardBorderColor borderColor;
    @Column(name="cardKingdomFoilId")
    private String cardKingdomFoilId;
    @Column(name="cardKingdomId")
    private String cardKingdomId;
    @Column(name="colorIdentity")
    private String colorIdentity;
    @Column(name="colorIndicator")
    private String colorIndicator;
    @Column(name="colors")
    private String colors;
    @Column(name="convertedManaCost")
    private Long convertedManaCost;
    @Column(name="duelDeck")
    private String duelDeck;
    @Column(name="edhrecRank")
    private Integer edhrecRank;
    @Column(name="faceConvertedManaCost")
    private Float faceConvertedManaCost;
    @Column(name="faceName")
    private String faceName;
    @Column(name="finishes")
    private String finishes;
    @Column(name="flavorName")
    private String flavorName;
    @Column(name="flavorText")
    private String flavorText;
    @Column(name="frameEffects")
    private String frameEffects;
    @Column(name="frameVersion")
    private String frameVersion;
    @Column(name="hand")
    private String hand;
    @Column(name="hasAlternativeDeckLimit")
    private Integer hasAlternativeDeckLimit;
    @Column(name="hasContentWarning")
    private Integer hasContentWarning;
    @Column(name="hasFoil")
    private Integer hasFoil;
    @Column(name="hasNonFoil")
    private Integer hasNonFoil;
    @Column(name="isAlternative")
    private Integer isAlternative;
    @Column(name="isFullArt")
    private Integer isFullArt;
    @Column(name="isOnlineOnly")
    private Integer isOnlineOnly;
    @Column(name="isOversized")
    private Integer isOversized;
    @Column(name="isPromo")
    private Integer isPromo;
    @Column(name="isReprint")
    private Integer isReprint;
    @Column(name="isReserved")
    private Integer isReserved;
    @Column(name="isStarter")
    private Integer isStarter;
    @Column(name="isStorySpotlight")
    private Integer isStorySpotlight;
    @Column(name="isTextless")
    private Integer isTextless;
    @Column(name="isTimeshifted")
    private Integer isTimeshifted;
    @Column(name="keywords")
    private String keywords;
    @Column(name="layout")
    private String layout;
    @Column(name="leadershipSkills")
    private String leadershipSkills;
    @Column(name="life")
    private String life;
    @Column(name="loyalty")
    private String loyalty;
    @Column(name="manaCost")
    private String manaCost;
    @Column(name="mcmId")
    private String mcmId;
    @Column(name="mcmMetaId")
    private String mcmMetaId;
    @Column(name="mtgArenaId")
    private String mtgArenaId;
    @Column(name="mtgjsonV4Id")
    private String mtgjsonV4Id;
    @Column(name="mtgoFoilId")
    private String mtgoFoilId;
    @Column(name="mtgoId")
    private String mtgoId;
    @Column(name="multiverseId")
    private String multiverseId;
    @Column(name="name")
    private String name;
    @Column(name="number")
    private String number;
    @Column(name="originalReleaseDate")
    private String originalReleaseDate;
    @Column(name="originalText")
    private String originalText;
    @Column(name="originalType")
    private String originalType;
    @Column(name="otherFaceIds")
    private String otherFaceIds;
    @Column(name="power")
    private String power;
    @Column(name="printings")
    private String printings;
    @Column(name="promoTypes")
    private String promoTypes;
    @Column(name="purchaseUrls")
    private String purchaseUrls;
    @Column(name="rarity")
    @Enumerated(EnumType.STRING)
    private CardRarity rarity;
    @Column(name="scryfallId")
    private String scryfallId;
    @Column(name="scryfallIllustrationId")
    private String scryfallIllustrationId;
    @Column(name="scryfallOracleId")
    private String scryfallOracleId;
    @Column(name="setCode")
    private String setCode;
    @Column(name="side")
    private String side;
    @Column(name="subtypes")
    private String subtypes;
    @Column(name="supertypes")
    private String supertypes;
    @Column(name="tcgplayerEtchedProductId")
    private String tcgplayerEtchedProductId;
    @Column(name="tcgplayerProductId")
    private String tcgplayerProductId;
    @Column(name="text")
    private String text;
    @Column(name="toughness")
    private String toughness;
    @Column(name="type")
    private String type;
    @Column(name="types")
    private String types;
    @Column(name="uuid")
    private String uuid;
    @Column(name="variations")
    private String variations;
    @Column(name="watermark")
    private String watermark;
}
