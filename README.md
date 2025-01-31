# 💰 Expense Tracker App in Java
- A simple console-based Expense Tracker that allows users to add, view, remove, and calculate total expenses.
---
## 🏗 Project Structure
```yaml
📦 ExpenseTrackerInJava  
 ┣ 📜 Expense.java         // Represents an expense with amount, category, date, and description  
 ┣ 📜 ExpenseTracker.java  // Manages a list of expenses (add, remove, get total expenses)  
 ┣ 📜 ExpenseApp.java      // Main program that provides a menu for user interaction
```
---
## 🔹 File Use Cases
1️⃣ Expense.java
- Represents an expense with attributes:
```yaml
amount: Expense amount
category: Type of expense (e.g., Food, Travel)
date: Date of the expense (YYYY-MM-DD)
description: A short description
```

2️⃣ ExpenseTracker.java
- Manages a list of expenses with functions:
```yaml
- addExpense(Expense expense): Adds an expense
- getExpenses(): Returns the list of all expenses
- removeExpense(int index): Removes an expense by index
- getTotalExpense(): Calculates the total amount spent
```

3️⃣ ExpenseApp.java
- Provides a console-based menu for users to:
```yaml
- Add an expense
- View all expenses
- Remove an expense
- View total expenses
- Exit the application
```
---
## 🖥 Console Input & Output Examples
1️⃣ Adding an Expense
```yaml
Welcome to the Expense Tracker App
1. Add an expense
2. View all expenses
3. Remove an expense
4. View total expenses
5. Exit

Enter your choice: 1
Enter the amount: 150
Enter the category: Food
Enter the date (YYYY-MM-DD): 2025-01-31
Enter the description: Lunch at restaurant

Expense added successfully!
```

2️⃣ Viewing All Expenses
```yaml
Enter your choice: 2

Expense List:
0. Amount: 150.0 | Category: Food | Date: 2025-01-31 | Description: Lunch at restaurant
1. Amount: 250.0 | Category: Travel | Date: 2025-01-30 | Description: Bus ticket
```

3️⃣ Removing an Expense

```yaml
Enter your choice: 3

Expense List:
0. Amount: 150.0 | Category: Food | Date: 2025-01-31 | Description: Lunch at restaurant
1. Amount: 250.0 | Category: Travel | Date: 2025-01-30 | Description: Bus ticket
```
```yaml
Enter the index of the expense to remove: 0
Expense removed successfully.
```

4️⃣ Viewing Total Expenses
```yaml
Enter your choice: 4

Total expenses: ₹250.0
```

5️⃣ Exiting the Application
```yaml
Enter your choice: 5

Exiting... Goodbye!
```
---
## 🛠 How to Run the Project
- Clone this repository
```yaml
git clone https://github.com/yourusername/ExpenseTrackerInJava.git
```
- Navigate to the project folder
```yaml
cd ExpenseTrackerInJava
```
- Compile and run the program
```yaml
javac ExpenseApp.java  
java ExpenseApp  
```
---
## 📝 License
- This project is open-source under the MIT License.
