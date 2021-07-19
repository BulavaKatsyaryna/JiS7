package LECTURE_Stream_API_And_Lambdas.Task4Part1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {

        Product product1 = new Product("Sony XPERIA xz3", 1500.0, 0.0);
        Product product2 = new Product("Sony XPERIA PRO 5G", 6324.94, 5.0);
        Product product3 = new Product("Sony Xperia 5 II", 2649.0, 0.0);
        Product product4 = new Product("Sony Xperia 1 II", 2812.50, 10.0);
        Product product5 = new Product("Sony Xperia 1 III", 2775.85, 0.0);

        List<Product> listProduct = List.of(product, product2, product3,
                product4, product5, product6, product7, product8);

        List<Product> sortByPriceInAscendingOrderFirstWithoutDiscountThenWithDiscount = productList.stream().sorted(
                        Comparator.comparingDouble(Product::getPrice)
                                .thenComparing((o1, o2) ->
                                        Double.compare(o2.getDiscount(), o1.getDiscount()))
                )
                .collect(Collectors.toList());

        System.out.println(sortByPriceInAscendingOrderFirstWithoutDiscountThenWithDiscount);
    }
}
