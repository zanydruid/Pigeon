package io.zanydruid.pigeon.core.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Brand")
@Data
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brandId")
    private int brandId;

    @Column(name = "name")
    private String name;
}
