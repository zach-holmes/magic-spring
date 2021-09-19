package com.pangolex.magicspring.entity;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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
    private String format;
    private String status;
    @Size(min = 36,max = 36)
    private String uuid;
}
