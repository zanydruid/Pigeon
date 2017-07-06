package io.zanydruid.pigeon.core.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerId")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "provinceId")
    private int provinceId;

    @Column(name = "phone")
    private int phone;


}
