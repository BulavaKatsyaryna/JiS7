package LECTURE_Stream_API_And_Lambdas.Task3_Product2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String name;
    private Double price;
    private Double discount;
}