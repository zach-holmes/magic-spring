package com.pangolex.magicspring.dto;

import com.pangolex.magicspring.entity.SetTranslation;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class SetTranslationDTO {
    private Integer id;
    private String language;
    private String setCode;
    private String translation;

    public void EntityToDTO(SetTranslation setTranslation){
        this.id = setTranslation.getId();
        this.language = setTranslation.getLanguage();
        this.setCode = setTranslation.getSetCode();
        this.translation = setTranslation.getTranslation();
    }

    public SetTranslation DTOToEntity(){
        SetTranslation setTranslation = new SetTranslation();
        setTranslation.setId(id);
        setTranslation.setLanguage(language);
        setTranslation.setSetCode(setCode);
        setTranslation.setTranslation(translation);
        return setTranslation;
    }
}
