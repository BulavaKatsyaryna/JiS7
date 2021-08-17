package com.example.springboot.customer.entity;

import com.example.springboot.address.entity.AddressEntity;
import com.example.springboot.basket.entity.BasketEntity;
import com.example.springboot.creditCard.entity.CreditCardEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Data
@NoArgsConstructor
@Entity
@Table(name = "customers")
@Builder
@AllArgsConstructor
@ToString(exclude = {"address", "creditCard", "basket"})
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "address_id")
    private AddressEntity address;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "customer_id", unique = true)
    private Collection<CreditCardEntity> creditCard;

    @OneToOne
    @JoinColumn(name = "basket_id")
    private BasketEntity basket;
}