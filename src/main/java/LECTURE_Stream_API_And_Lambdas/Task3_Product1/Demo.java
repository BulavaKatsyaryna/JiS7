package LECTURE_Stream_API_And_Lambdas.Task3_Product1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.List.of;

public class Demo {

    public static void main(String[] args) {

        Product product = new Product("BubbleGum", 2.50, 2.0);
        Product product2 = new Product("Lays", 3.20, 50.0);
        Product product3 = new Product("Milk", 1.50, 0.0);
        Product product4 = new Product("Cucumber", 6.0, 35.0);
        Product product5 = new Product("Bread", 1.20, 15.0);
        Product product6 = new Product("Ice-cream", 1.30, 5.0);
        Product product7 = new Product("Sugar", 1.60, 0.0);
        Product product8 = new Product("Mineral water Darida", 0.90, 10.0);

        List<Product> listProduct = List.of(product, product2, product3,
                product4, product5, product6, product7, product8);

        List<Product> productWitDiscountAboveTheSpecifiedOneAndThePriceNotExceedingTheSpecifiedOne = listProduct.stream()
                .filter(it -> it.getDiscount() > 30.0 && it.getPrice() < 10.5)
                .collect(Collectors.toList());

        System.out.println("productWitDiscountAboveTheSpecifiedOneAndThePriceNotExceedingTheSpecifiedOne = "
                + productWitDiscountAboveTheSpecifiedOneAndThePriceNotExceedingTheSpecifiedOne);
    }
}