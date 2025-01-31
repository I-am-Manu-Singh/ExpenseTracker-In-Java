import java.util.Scanner;
import java.util.List;

    public class ExpenseApp {
    private static ExpenseTracker expenseTracker = new ExpenseTracker();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWelcome to the Expense Tracker App");
            System.out.println("1. Add an expense");
            System.out.println("2. View all expenses");
            System.out.println("3. Remove an expense");
            System.out.println("4. View total expenses");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    viewAllExpenses();
                    break;
                case 3:
                    removeExpense();
                    break;
                case 4:
                    viewTotalExpenses();
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        }

    private static void addExpense() {
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter the category: ");
        String category = scanner.nextLine();
        System.out.print("Enter the date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter the description: ");
        String description = scanner.nextLine();

        Expense expense = new Expense(amount, category, date, description);
        expenseTracker.addExpense(expense);
        System.out.println("Expense added successfully!");
    }

    private static void viewAllExpenses() {
        List<Expense> expenses = expenseTracker.getExpenses();
        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
        } else {
            System.out.println("\nExpense List:");
            for (int i = 0; i < expenses.size(); i++) {
                System.out.println(i + ". " + expenses.get(i));
            }
        }
    }

    private static void removeExpense() {
        viewAllExpenses();
        System.out.print("Enter the index of the expense to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        expenseTracker.removeExpense(index);
        System.out.println("Expense removed successfully.");
    }

    private static void viewTotalExpenses() {
        double total = expenseTracker.getTotalExpense();
        System.out.println("Total expenses: ₹" + total);
    }
    
}