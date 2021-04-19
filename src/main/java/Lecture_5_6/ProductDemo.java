package Lecture_5_6;

public class ProductDemo {

    public static void main(String[] args) {
        Product product = new Product();

        product.name = "Milk";
        product.discount = 15;
        product.regularPrice = 2000;

        System.out.println("Product name: " + product.name);
        System.out.println("Regular price: " + product.regularPrice);
        System.out.println("Discount: " + product.discount);
        System.out.println("Actual price: " + product.actualPrice());
    }
}
