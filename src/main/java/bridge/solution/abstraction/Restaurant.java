public abstract class Restaurant {

    //act as a BRIDGE
    protected Pizza pizza;

    protected Restaurant(Pizza pizza) {this.pizza = pizza;}

    abstract void addSauce();
    abstract void addToppings();
    abstract void makeCrust();

    public void deliver() {
        addSauce();
        addToppings();
        makeCrust();
        pizza.assemble();
        pizza.qualityCheck();

        System.out.println("Order in Progress");
    }
}