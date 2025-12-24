public class Main {
    public static void main(String[] args) {

        System.out.println("=== Grocery Store Management System ===\n");

        Product product1 = new Product(1, "Milk", 450.0, 20);
        Product product2 = new Product(2, "Bread", 250.0, 30);
        Product product3 = new Product(); // default constructor

        Customer customer1 = new Customer(101, "Alice", "Regular", 5000);
        Customer customer2 = new Customer(102, "Bob", "Gold", 15000);
        Customer customer3 = new Customer(); // default constructor

        Sale sale1 = new Sale(1001, "Alice", 0.0, "2025-09-10");
        Sale sale2 = new Sale();

        System.out.println("--- PRODUCTS ---");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        System.out.println("\n--- CUSTOMERS ---");
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);

        System.out.println("\n--- SALES ---");
        System.out.println(sale1);
        System.out.println(sale2);

        System.out.println("\n--- TESTING GETTERS ---");
        System.out.println("Product1 name: " + product1.getName());
        System.out.println("Customer1 total purchases: " + customer1.getTotalPurchases());
        System.out.println("Sale1 date: " + sale1.getDate());

        System.out.println("\n--- TESTING SETTERS ---");
        product3.setName("Apple");
        product3.setPrice(300.0);
        product3.setStockQuantity(50);
        System.out.println("Updated product3: " + product3);

        customer3.setName("Charlie");
        customer3.setTotalPurchases(12000);
        System.out.println("Updated customer3: " + customer3);

        System.out.println("\n--- TESTING METHODS ---");
        System.out.println("Product1 in stock: " + product1.isInStock());
        product1.restock(10);
        System.out.println("Product1 after restock: " + product1);

        customer1.addPurchase(6000);
        System.out.println("Customer1 is VIP: " + customer1.isVIP());

        sale1.addItem(450.0);
        sale1.addItem(250.0);
        System.out.println("Sale1 large sale: " + sale1.isLargeSale());

        System.out.println("\n--- FINAL STATE ---");
        System.out.println(product1);
        System.out.println(customer1);
        System.out.println(sale1);

        System.out.println("\n=== Program Complete ===");
    }
}
