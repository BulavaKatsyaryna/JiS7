package com.example.springboot.basket.entity;

import com.example.springboot.product.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@NoArgsConstructor
@Entity
@Table(name = "baskets")
@AllArgsConstructor
public class BasketEntity {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    @JoinColumn(name = "basket_id")
    private Collection<ProductEntity> products;
}
