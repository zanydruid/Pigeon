package io.zanydruid.pigeon.core.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TaxType")
@Data
public class TaxType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "taxTypeId")
    private int taxTypeId;

    @Column(name = "name")
    private String name;

    @Column(name = "rate")
    private float rate;
}
