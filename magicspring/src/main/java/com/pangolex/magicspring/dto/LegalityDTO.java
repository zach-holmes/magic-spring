package com.pangolex.magicspring.dto;

import com.pangolex.magicspring.entity.Legality;
import com.pangolex.magicspring.model.legality.LegalityFormat;
import com.pangolex.magicspring.model.legality.LegalityStatus;

public class LegalityDTO {
    private Integer id;
    private LegalityFormat format;
    private LegalityStatus status;
    private String uuid;

    public void entityToDTO(Legality legality){
        this.id = legality.getId();
        this.format = legality.getFormat();
        this.status = legality.getStatus();
        this.uuid = legality.getUuid();
    }

    public Legality DTOToEntity(){
        Legality legality = new Legality();
        legality.setId(id);
        legality.setFormat(format);
        legality.setStatus(status);
        legality.setUuid(uuid);
        return legality;
    }
}
