public class Product {

    public String name;
    public double regularPrice;
    public double discount;

    public double actualPrice() {
        return regularPrice - (regularPrice * discount) / 100;
    }
}
