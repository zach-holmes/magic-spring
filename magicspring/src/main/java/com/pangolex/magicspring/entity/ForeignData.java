package com.pangolex.magicspring.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Getter
@Setter
@RequiredArgsConstructor
public class ForeignData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="flavorText")
    private String flavorText;
    @Column(name="language")
    private String language;
    @Column(name="multiverseid")
    private Integer multiverseid;
    @Column(name="name")
    private String name;
    @Column(name="text")
    private String text;
    @Column(name="type")
    private String type;
    @Column(name="uuid")
    private String uuid;
}
