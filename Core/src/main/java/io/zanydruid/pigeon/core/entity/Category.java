package io.zanydruid.pigeon.core.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryId")
    private int categoryId;

    @Column(name = "name")
    private String name;
}
