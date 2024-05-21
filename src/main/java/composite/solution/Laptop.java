public class Laptop extends Product {
    public Laptop(String title, double price) {
        super(title, price);
    }

    @Override
    public double calcPrice() {
        return getPrice();
    }
}