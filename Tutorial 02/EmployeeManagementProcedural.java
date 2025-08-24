import java.util.Scanner; // Import the Scanner class for user input

class EmployeeManagementProcedural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt(); // Read the number of employees from user

        // Create an array to store salaries
        double[] salaries = new double[numEmployees];
        // Create an array to store employee names (optional, but good for context)
        String[] employeeNames = new String[numEmployees];

        // Variables to keep track of the highest salary and the index of that employee
        double maxSalary = -1.0; // Initialize with a value lower than any possible salary
        int maxSalaryIndex = -1;

        // Loop to get name and salary for each employee from the user
        for (int i = 0; i < numEmployees; i++) {
            scanner.nextLine(); // Consume the leftover newline character from previous nextInt()

            System.out.printf("Enter name for employee %d: ", (i + 1));
            employeeNames[i] = scanner.nextLine(); // Read employee name

            System.out.printf("Enter salary for %s: $", employeeNames[i]);
            salaries[i] = scanner.nextDouble(); // Read salary

            // Check if current employee's salary is higher than the current max
            if (salaries[i] > maxSalary) {
                maxSalary = salaries[i];
                maxSalaryIndex = i;
            }
        }

        System.out.println("\n--- Results ---");
        if (numEmployees > 0) {
            System.out.printf("The highest paid employee is '%s' with a salary of $%.2f%n",
                              employeeNames[maxSalaryIndex], maxSalary);
        } else {
            System.out.println("No employee data entered.");
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}