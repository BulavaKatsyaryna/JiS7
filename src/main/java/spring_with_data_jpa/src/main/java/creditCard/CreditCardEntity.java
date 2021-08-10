package creditCard;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name = "credit_cards")
public class CreditCardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cardNumber;
    private String bankName;
    private BigDecimal founds;

    public CreditCardEntity(String cardNumber, String bankName, BigDecimal founds) {
        this.cardNumber = cardNumber;
        this.bankName = bankName;
        this.founds = founds;
    }
}
