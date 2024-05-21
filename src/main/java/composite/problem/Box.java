@Data
@AllArgsConstructor
public class Box {
    private List<Box> boxes;
    private List<Product> products;

    public double calcPrice() {
        double sum = products.stream().mapToDouble(Product::getPrice).sum();
        for(Box box : boxes) {
            sum = sum + box.calcPrice();
        }
        return sum;
    }
}