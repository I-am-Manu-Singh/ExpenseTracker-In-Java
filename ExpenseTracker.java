import java.util.List;
import java.util.ArrayList;

public class ExpenseTracker {
    private List<Expense> expenses;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    // Add an expense to the list
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }   
    
    // Get all expenses
    public List<Expense> getExpenses() {
        return expenses;
    }

    // Remove an expense
    public void removeExpense(int index) {
        if (index >= 0 && index < expenses.size()) {
            expenses.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Get total expense amount
    public double getTotalExpense() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }
}