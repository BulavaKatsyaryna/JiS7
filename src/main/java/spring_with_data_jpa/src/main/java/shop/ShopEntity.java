package shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import product.ProductEntity;

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
