public static void main(String[] args) {
    Box box = new Box(
            Arrays.asList(
                    new Box(
                            Collections.emptyList(),
                            Arrays.asList(
                                    new Product("book0", 25),
                                    new Product("handy", 800),
                                    new Product("laptop", 1499.99)
                            )
                    ),
                    new Box(
                            Collections.emptyList(),
                            Arrays.asList(
                                    new Product("book1", 25),
                                    new Product("book2", 25),
                                    new Product("book3", 25),
                            )
                    )
        ),
        Arrays.asList(
                new Product("book4", 25),
                new Product("book5", 25),
        )
        );
    System.out.println(box.calcPrice());
}