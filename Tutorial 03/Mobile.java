class Mobile {
    String brand;
    String model;
    double price;

    public Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Samsung", "Galaxy S21", 799.99);
        Mobile mobile2 = new Mobile("Apple", "iPhone 13", 999.99);
        Mobile mobile3 = new Mobile("Google", "Pixel 6", 599.99);

        System.out.println("Mobile 1 Details:");
        mobile1.showDetails();
        System.out.println("\nMobile 2 Details:");
        mobile2.showDetails();
        System.out.println("\nMobile 3 Details:");
        mobile3.showDetails();
    }
}