package com.expensetracker.service;
import java.io.*;
import com.expensetracker.model.Expense;

import java.util.ArrayList;

public class ExpenseService {

    private ArrayList<Expense> expenses = new ArrayList<>();
    //file path
    private final String FILE_NAME = "data/expenses.txt";
    //save expences to file
    private void saveExpensesToFile() {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (Expense expense : expenses) {

                writer.write(
                        expense.getId() + "," +
                                expense.getTitle() + "," +
                                expense.getAmount() + "," +
                                expense.getCategory()
                );

                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error Saving Expenses");
        }
    }
    //add expense
    public void addExpense(Expense expense) {
        expenses.add(expense);
        saveExpensesToFile();
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
