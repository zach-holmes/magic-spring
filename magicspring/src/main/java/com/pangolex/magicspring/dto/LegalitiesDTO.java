package com.pangolex.magicspring.dto;

import com.pangolex.magicspring.entity.Legalities;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LegalitiesDTO {
    private Integer id;
    private String format;
    private String status;
    private String uuid;

    public void entityToDTO(Legalities legalities){
        this.id = legalities.getId();
        this.format = legalities.getFormat();
        this.status = legalities.getStatus();
        this.uuid = legalities.getUuid();
    }

    public Legalities DTOToEntity(){
        Legalities legalities = new Legalities();
        legalities.setId(id);
        legalities.setFormat(format);
        legalities.setStatus(status);
        legalities.setUuid(uuid);
        return legalities;
    }
}
