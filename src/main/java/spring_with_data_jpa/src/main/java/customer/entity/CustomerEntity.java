package customer.entity;

import address.AddressEntity;
import basket.BasketEntity;
import creditCard.CreditCardEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "assress_id")
    private AddressEntity address;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "customer_id", unique = true)
    private Collection<CreditCardEntity> creditCard;

    @OneToOne
    @JoinColumn(name = "basket_id")
    private BasketEntity basket;

    public CustomerEntity(String firstName, String lastName, String userName, String password, String email, AddressEntity address, Collection<CreditCardEntity> creditCard, BasketEntity basket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.address = address;
        this.creditCard = creditCard;
        this.basket = basket;
    }
}
