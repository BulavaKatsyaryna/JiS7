package address.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String country;
    private String city;
    private String street;

    @Column(name = "home_number")
    private String homeNumber;

    public AddressEntity(String country, String city, String street, String homeNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
    }
}
