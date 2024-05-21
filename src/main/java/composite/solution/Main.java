public static void main(String[] args) {
        DeliveryService devSer = new DeliveryService();

        devSer.setupOrder(
                new CompositeBox(
                        new Book("book1", 25)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Book("book2", 28),
                                new Book("book3", 26)
                        ),
                        new Book("book4", 25),
                        new Book("book5", 25)
                )
        );
        delSer.calcOrderPrice();
}