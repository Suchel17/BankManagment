package com.cjc.bankmanagement.client;

import java.util.Scanner;
import com.cjc.bankmanagement.service.Rbi;
import com.cjc.bankmanagement.serviceImpl.Sbi;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rbi bank = new Sbi();

        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Display All Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: bank.createAccount(); 
                	break;
                case 2: bank.displayAllDetails(); 
                	break;
                case 3: bank.depositMoney(); 
                	break;
                case 4: bank.withdrawMoney(); 
                	break;
                case 5: bank.checkBalance(); 
                	break;
                case 6:
                    System.out.println("Thank you for using SBI Bank!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
             
        }
        
    }
}
