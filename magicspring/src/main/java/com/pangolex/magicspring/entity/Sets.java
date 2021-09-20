package com.pangolex.magicspring.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Getter
@Setter
@RequiredArgsConstructor

@Entity
@Table(name = "sets")
public class Sets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="baseSetSize")
    private Integer baseSetSize;
    private String block;
    private String booster;
    @NotNull
    @Column(length = 3, unique = true)
    private String code;
    @NotNull
    @Column(name="isFoilOnly")
    private Integer isFoilOnly;
    @NotNull
    @Column(name = "isForeignOnly")
    private Integer isForeignOnly;
    @NotNull
    @Column(name = "isNonFoilOnly")
    private Integer isNonFoilOnly;
    @NotNull
    @Column(name = "isOnlineOnly")
    private Integer isOnlineOnly;
    @NotNull
    @Column(name = "isPartialPreview")
    private Integer isPartialPreview;
    @Column(name = "keyruneCode")
    private String keyruneCode;
    @Column(name = "mcmId")
    private Integer mcmId;
    @Column(name = "mcmIdExtras")
    private Integer mcmIdExtras;
    @Column(name = "mcmName")
    private String mcmName;
    @Column(name = "mtgoCode")
    private String mtgoCode;
    private String name;
    @Column(name = "parentCode")
    private String parentCode;
    @Column(name = "releaseDate")
    private LocalDateTime releaseDate;
    @Column(name = "sealedProduct")
    private String sealedProduct;
    @Column(name = "tcgplayerGroupId")
    private Integer tcgplayerGroupId;
    @Column(name = "totalSetSize")
    private Integer totalSetSize;
    private String type;

}
