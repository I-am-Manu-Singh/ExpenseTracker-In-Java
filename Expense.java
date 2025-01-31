public class Expense {
    private double amount;
    private String category;
    private String date;
    private String description;

    public Expense(double amount, 
                    String category, 
                    String date, 
                    String description) {
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.description = description;
    }

    // Getter methods
    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    // Setter methods
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override 
    public String toString() {
        return "Amount: " + 
                amount + 
                " | Category: " + 
                category +
                " | Date: " + 
                date + 
                " | Description: " + 
                description;
    }
}