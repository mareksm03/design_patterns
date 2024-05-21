public class CompositeBox implements Box{
    private fina List<Box> children = new ArrayList<>();

    public CompositeBox(Box...boxes) {
        children.addAll(Arrays.asList(boxes));
    }

    @Override
    public double calcPrice() {
        return children.stream().mapToDouble(Box::calcPrice).sum();
    }
}