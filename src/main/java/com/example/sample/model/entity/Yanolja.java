package com.example.sample.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "YANOJA_COMPANY")
@Getter @Setter
public class Yanolja {

    @Id
    @GeneratedValue
    @Column(name = "YAN_ID")
    private Long id;

    @Column(name = "YAN_EMPCNT")
    private int empCnt;

    @Column(name = "YAN_TOTALEMPCNT")
    private Long totalEmpCnt;

    @Column(name = "YAN_LOCATION")
    private String location;

    @OneToMany(mappedBy = "yanolja", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Sanha> sanhas = new ArrayList<>();

}
