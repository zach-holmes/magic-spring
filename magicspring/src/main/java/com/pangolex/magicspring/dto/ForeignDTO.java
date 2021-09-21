package com.pangolex.magicspring.dto;

import com.pangolex.magicspring.entity.ForeignData;

public class ForeignDTO {
    private Integer id;
    private String flavorText;
    private String language;
    private Integer multiverseid;
    private String name;
    private String text;
    private String type;
    private String uuid;

    public ForeignData DTOToEntity(){
        ForeignData foreignData = new ForeignData();
        foreignData.setId(id);
        foreignData.setFlavorText(flavorText);
        foreignData.setLanguage(language);
        foreignData.setMultiverseid(multiverseid);
        foreignData.setName(name);
        foreignData.setText(text);
        foreignData.setType(type);
        foreignData.setUuid(uuid);
        return foreignData;
    }

    public void EntityToDTO(ForeignData foreignData){
        this.id = foreignData.getId();
        this.flavorText = foreignData.getFlavorText();
        this.language = foreignData.getLanguage();
        this.multiverseid = foreignData.getMultiverseid();
        this.name = foreignData.getName();
        this.text = foreignData.getText();
        this.type = foreignData.getType();
        this.uuid = foreignData.getUuid();
    }
}
