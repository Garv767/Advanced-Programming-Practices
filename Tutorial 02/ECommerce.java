import java.util.Scanner; // Import the Scanner class for user input


class ECommerce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        System.out.println("Enter the number of orders placed today: ");
        int numOrders = scanner.nextInt(); // Read the number of orders from user

        // Create an array to store prices of individual orders placed today
        double[] orderPrices = new double[numOrders];
        double totalOrderPrice = 0;

        // Loop to get price for each order from the user
        for (int i = 0; i < numOrders; i++) {
            System.out.printf("Enter price for order %d: $", (i + 1));
            orderPrices[i] = scanner.nextDouble(); // Read each price
            totalOrderPrice += orderPrices[i]; // Add to total
        }

        System.out.printf("Total price of all orders placed today: $%.2f", totalOrderPrice);
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}