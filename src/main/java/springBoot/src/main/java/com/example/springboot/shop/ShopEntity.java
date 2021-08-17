package com.example.springboot.shop;

import com.example.springboot.product.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Data
@NoArgsConstructor
@Entity
@Table(name = "shop")
@AllArgsConstructor
public class ShopEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany
    @JoinColumn(name = "shop_id")
    private Collection<ProductEntity> products;
    private BigDecimal cashAmount;
}
