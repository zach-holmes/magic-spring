package com.pangolex.magicspring.entity;

import com.pangolex.magicspring.model.legality.LegalityFormat;
import com.pangolex.magicspring.model.legality.LegalityStatus;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "legalities")
public class Legality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    @Column(name = "format")
    private LegalityFormat format;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private LegalityStatus status;
    @Size(min = 36,max = 36)
    private String uuid;
}
