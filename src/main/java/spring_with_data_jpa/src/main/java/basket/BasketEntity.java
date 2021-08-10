package basket;

import lombok.Data;
import lombok.NoArgsConstructor;
import product.ProductEntity;

import javax.persistence.*;
import java.util.Collection;

@Data
@NoArgsConstructor
@Entity
@Table(name = "baskets")
public class BasketEntity {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    @JoinColumn(name = "basket_id")
    private Collection<ProductEntity> products;

    public BasketEntity(Collection<ProductEntity> products) {
        this.products = products;
    }
}
