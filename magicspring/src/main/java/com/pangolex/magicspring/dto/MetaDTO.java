package com.pangolex.magicspring.dto;

import com.pangolex.magicspring.entity.Meta;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@RequiredArgsConstructor
public class MetaDTO {
    private Integer id;
    private LocalDateTime date;
    private String version;

    public void entityToDTO(Meta meta){
        this.id = meta.getId();
        this.date = meta.getDate();
        this.version = meta.getVersion();
    }
    public Meta DTOToEntity(){
        Meta meta = new Meta();
        meta.setId(id);
        meta.setDate(date);
        meta.setVersion(version);
        return meta;
    }
}
