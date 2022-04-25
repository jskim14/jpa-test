package com.example.sample.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "SANHA_COMPANY")
@Getter @Setter
public class Sanha {

    @Id
    @GeneratedValue
    @Column(name = "SAN_ID")
    private Long id;

    @Column(name = "SAN_EMPCNT")
    private int empCnt;

    @Column(name = "SAN_LOCATION")
    private String location;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "YAN_ID")
    private Yanolja yanolja;

}
