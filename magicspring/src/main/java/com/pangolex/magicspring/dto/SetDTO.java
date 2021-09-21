package com.pangolex.magicspring.dto;

import com.pangolex.magicspring.entity.Set;
import com.pangolex.magicspring.model.set.SetType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@RequiredArgsConstructor
public class SetDTO {
    private Integer id;
    private Integer baseSetSize;
    private String block;
    private String booster;
    private String code;
    private Integer isFoilOnly;
    private Integer isForeignOnly;
    private Integer isNonFoilOnly;
    private Integer isOnlineOnly;
    private Integer isPartialPreview;
    private String keyruneCode;
    private Integer mcmId;
    private Integer mcmIdExtras;
    private String mcmName;
    private String mtgoCode;
    private String name;
    private String parentCode;
    private LocalDateTime releaseDate;
    private String sealedProduct;
    private Integer tcgplayerGroupId;
    private Integer totalSetSize;
    private SetType type;

    public void EntityToDTO(Set set){
        this.id = set.getId();
        this.baseSetSize = set.getBaseSetSize();
        this.block = set.getBlock();
        this.booster = set.getBooster();
        this.code = set.getCode();
        this.isFoilOnly = set.getIsFoilOnly();
        this.isForeignOnly = set.getIsForeignOnly();
        this.isNonFoilOnly = set.getIsNonFoilOnly();
        this.isOnlineOnly = set.getIsOnlineOnly();
        this.isPartialPreview = set.getIsPartialPreview();
        this.keyruneCode = set.getKeyruneCode();
        this.mcmId = set.getMcmId();
        this.mcmIdExtras = set.getMcmIdExtras();
        this.mcmName = set.getMcmName();
        this.mtgoCode = set.getMtgoCode();
        this.name = set.getName();
        this.parentCode = set.getParentCode();
        this.releaseDate = set.getReleaseDate();
        this.sealedProduct = set.getSealedProduct();
        this.tcgplayerGroupId = set.getTcgplayerGroupId();
        this.totalSetSize = set.getTotalSetSize();
        this.type = set.getType();
    }

    public Set DTOToEntity(){
        Set set = new Set();
        set.setId(id);
        set.setBaseSetSize(baseSetSize);
        set.setBlock(block);
        set.setBooster(booster);
        set.setCode(code);
        set.setIsFoilOnly(isFoilOnly);
        set.setIsForeignOnly(isForeignOnly);
        set.setIsNonFoilOnly(isNonFoilOnly);
        set.setIsOnlineOnly(isOnlineOnly);
        set.setIsPartialPreview(isPartialPreview);
        set.setKeyruneCode(keyruneCode);
        set.setMcmId(mcmId);
        set.setMcmIdExtras(mcmIdExtras);
        set.setMcmName(mcmName);
        set.setMtgoCode(mtgoCode);
        set.setName(name);
        set.setParentCode(parentCode);
        set.setReleaseDate(releaseDate);
        set.setSealedProduct(sealedProduct);
        set.setTcgplayerGroupId(tcgplayerGroupId);
        set.setTotalSetSize(totalSetSize);
        set.setType(type);
        return set;
    }
}
