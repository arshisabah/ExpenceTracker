package com.expensetracker.service;
import com.expensetracker.model.Expense;

import java.util.ArrayList;

public class ExpenseService {

    private ArrayList<Expense> expenses = new ArrayList<>();
    //add expense
    public void addExpense(Expense expense) {
        expenses.add(expense);
        System.out.println("Expense added successfully");
    }
    //view all expenses
    public void viewAllExpenses() {
        if(expenses.isEmpty()) {
            System.out.println("No expenses found");
            return;
        }
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
    }
    //delete expense
    public void deleteExpense(int id) {
        expenses.removeIf(expense -> expense.getId() == id);
        System.out.println("Expense deleted successfully");
    }
    //total spends
    public void showTotalSpends() {
        double total = 0;
        for (Expense expence : expenses) {
            total += expence.getAmount();
        }
        System.out.println("Total spending :" + total);
    }
}
