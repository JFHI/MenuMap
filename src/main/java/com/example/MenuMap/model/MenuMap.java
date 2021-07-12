package com.example.MenuMap.model;

import org.hibernate.annotations.GeneratorType;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.HashMap;

@Entity
public class MenuMap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private BigDecimal price;

    public MenuMap() {
    }

    public MenuMap(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
