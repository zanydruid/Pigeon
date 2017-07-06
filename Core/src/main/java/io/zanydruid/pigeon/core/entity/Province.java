package io.zanydruid.pigeon.core.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by yizhu on 7/5/17.
 */
@Data
@Entity
@Table(name = "Province")
public class Province {

    @Column(name = "provinceId")
    private int provinceId;

    @Column(name = "name")
    private String name;
}
