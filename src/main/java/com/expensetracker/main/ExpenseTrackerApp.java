package com.expensetracker.main;

import com.expensetracker.model.Expense;
import com.expensetracker.service.ExpenseService;

import java.util.Scanner;

public class ExpenseTrackerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ExpenseService expenseService = new ExpenseService();

        while (true) {

            System.out.println("\n===== Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Delete Expense");
            System.out.println("4. Show Total Spending");
            System.out.println("5. Exit");

            System.out.print("Choose Option: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter Category: ");
                    String category = scanner.nextLine();

                    Expense expense = new Expense(id, title, amount, category);

                    expenseService.addExpense(expense);
                    break;

                case 2:
                    expenseService.viewAllExpenses();
                    break;

                case 3:

                    System.out.print("Enter Expense ID to Delete: ");
                    int deleteId = scanner.nextInt();

                    expenseService.deleteExpense(deleteId);
                    break;

                case 4:
                    expenseService.showTotalSpends();
                    break;

                case 5:
                    System.out.println("Exiting Application...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}