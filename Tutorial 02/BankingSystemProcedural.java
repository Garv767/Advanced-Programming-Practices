import java.util.Scanner; // Import the Scanner class for user input

class BankingSystemProcedural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        System.out.print("Enter the number of savings accounts: ");
        int numAccounts = scanner.nextInt(); // Read the number of accounts from user

        // Create an array to store balances based on user input
        double[] accountBalances = new double[numAccounts];
        double totalBalance = 0;

        // Loop to get balance for each account from the user
        for (int i = 0; i < numAccounts; i++) {
            System.out.printf("Enter balance for account %d: $", (i + 1));
            accountBalances[i] = scanner.nextDouble(); // Read each balance
            totalBalance += accountBalances[i]; // Add to total
        }

        System.out.printf("Total balance of all savings accounts: $%.2f%n%n", totalBalance);
        
    }
}