import java.util.*;

class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    public boolean reduceStock(int qty) {
        if (qty <= stock) {
            stock -= qty;
            return true;
        }
        return false;
    }
}

class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getItemTotal() {
        return product.getPrice() * quantity;
    }

    public String toString() {
        return product.getName() + " x " + quantity + " = " + getItemTotal();
    }
}

class ShoppingCart {
    private ArrayList<CartItem> items = new ArrayList<>();

    public void addItem(Product product, int quantity) {
        if (product.reduceStock(quantity)) {
            items.add(new CartItem(product, quantity));
            System.out.println(quantity + " " + product.getName() + " added to cart.");
        } else {
            System.out.println("Not enough stock for " + product.getName());
        }
    }

    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            System.out.println("Item removed.");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getItemTotal();
        }
        // Discount: 10% if total > 1000
        if (total > 1000) {
            total *= 0.9;
            System.out.println("10% discount applied!");
        }
        return total;
    }

    public void showCart() {
        for (CartItem item : items) {
            System.out.println(item);
        }
    }
}

class User {
    private String name;
    private ShoppingCart cart;

    public User(String name) {
        this.name = name;
        this.cart = new ShoppingCart();
    }

    public ShoppingCart getCart() {
        return cart;
    }
}

public class ShoppingSystem {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 60000, 5);
        Product p2 = new Product("Mouse", 500, 10);

        User user = new User("Alice");

        user.getCart().addItem(p1, 1);
        user.getCart().addItem(p2, 2);

        user.getCart().showCart();
        System.out.println("Total: " + user.getCart().calculateTotal());
    }
}
