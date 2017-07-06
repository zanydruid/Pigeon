package io.zanydruid.pigeon.core.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventoryId")
    private int inventoryId;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private int categoryId;

    @ManyToOne
    @JoinColumn(name = "brandId")
    private int brandId;

    @ManyToOne
    @JoinColumn(name = "batchId")
    private int batchId;

    @ManyToOne
    @JoinColumn(name = "taxTypeId")
    private int taxTypeId;

    @Column(name = "description")
    private String description;

    @Column(name = "buy")
    private float buy;

    @Column(name = "sell")
    private float sell;

    @Column(name = "imageUrl")
    private String imageUrl;
}
