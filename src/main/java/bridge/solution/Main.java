public class Main {
    public static void main(String[] args) {
        AmericanRestaurant ar = new AmericanRestaurant(new PepperoniPizza());
        ar.deliver();

        italianRestaurant ir = new ItalianRestaurant(new VeggiePizza());
        ir.deliver();

        //Flexibler Wechsel zwischen Pizzen und Restaurants
    }
}
