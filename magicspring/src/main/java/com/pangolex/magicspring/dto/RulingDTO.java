package com.pangolex.magicspring.dto;

import com.pangolex.magicspring.entity.Ruling;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@RequiredArgsConstructor
public class RulingDTO {
    private Integer id;
    private LocalDateTime date;
    private String text;
    private String uuid;

    public Ruling DTOToEntity(){
        Ruling ruling = new Ruling();
        ruling.setId(id);
        ruling.setDate(date);
        ruling.setText(text);
        ruling.setUuid(uuid);
        return ruling;
    }
}
