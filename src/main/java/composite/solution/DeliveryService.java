public class DeliveryService {
    private Box box;

    public DeliveryService() {
    }

    public void setupOrder(Box... boxes) {
        this.box = new CompositeBox(boxes);
    }

    public double calcOrderPrice() {
        return box.calcPrice();
    }
}