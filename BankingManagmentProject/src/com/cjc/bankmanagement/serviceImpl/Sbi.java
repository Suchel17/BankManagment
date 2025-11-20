package com.cjc.bankmanagement.serviceImpl;

import java.util.Scanner;
import com.cjc.bankmanagement.model.Account;
import com.cjc.bankmanagement.service.Rbi;

public class Sbi implements Rbi {

    Scanner sc = new Scanner(System.in);
    Account acc;  

    @Override
    public void createAccount() {
        acc = new Account();

        System.out.print("Enter Account Number: ");
        acc.setAccNo(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Name: ");
        acc.setName(sc.nextLine());

        System.out.print("Enter Mobile Number: ");
        acc.setMobNo(sc.nextLine());

        System.out.print("Enter Aadhar Number: ");
        acc.setAdharNo(sc.nextLine());

        System.out.print("Enter Gender: ");
        acc.setGender(sc.nextLine());

        System.out.print("Enter Age: ");
        acc.setAge(sc.nextInt());

        System.out.print("Enter Initial Balance: ");
        acc.setBalance(sc.nextDouble());

        System.out.println("Account Created Successfully!");
    }

    @Override
    public void displayAllDetails() {
        if (verifyAccount()) {
            acc.displayAccount();
        }
    }

    @Override
    public void depositMoney() {
        if (verifyAccount()) {
            System.out.print("Enter Amount to Deposit: ");
            double amount = sc.nextDouble();
            if(amount>0) {
            acc.setBalance(acc.getBalance() + amount);
            System.out.println("Amount Deposited Successfully!");
            System.out.println("Updated Balance: " + acc.getBalance());
            }
            else {
            	System.out.println("Invalid input!");
            }
        }
    }

    @Override
    public void withdrawMoney() {
        if (verifyAccount()) {
            System.out.print("Enter Amount to Withdraw: ");
            double amount = sc.nextDouble();

            if (amount <= acc.getBalance()) {
                acc.setBalance(acc.getBalance() - amount);
                System.out.println("Withdrawal Successful!");
                System.out.println("Updated Balance: " + acc.getBalance());
            } else {
                System.out.println("Insufficient Balance!");
            }
        }
    }

    @Override
    public void checkBalance() {
        if (verifyAccount()) {
            System.out.println("Current Balance: " + acc.getBalance());
        }
    }

    private boolean verifyAccount() {
        if (acc == null) {
            System.out.println("No Account Found. Please Create an Account First!");
            return false;
        }

        System.out.print("Enter Your Account Number: ");
        int num = sc.nextInt();

        if (num == acc.getAccNo()) {
            return true;
        } else {
            System.out.println("Incorrect Bank Account!");
            return false;
        }
    }
}
