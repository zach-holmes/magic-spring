package com.pangolex.magicspring.entity;
import com.pangolex.magicspring.model.LegalityFormat;
import com.pangolex.magicspring.model.LegalityStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

import javax.validation.constraints.Size;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "legalities")
public class Legalities {
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
