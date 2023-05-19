/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

/**
 *
 * @author Guesst
 */
public class BankAccount {
    String accountNumber;
    double balance;
    
    public BankAccount(String accountNumber, double balance) {
      this.accountNumber = accountNumber;
      this.balance = balance;
    }
    
    public void deposit(double amount) {
     System.out.println(balance += amount);
  }
    
    public void withdraw(double amount) {
      if (balance >= amount) {
         System.out.println( balance -= amount);
      } else {
          System.out.println("Insufficient balance");
      }
  }
    
    public double getBalance() {
      return balance;
  }
    
    public static void main(String[] args) {
    BankAccount bank1 = new BankAccount("9876543210", 1000000000);
    System.out.println("Saldo: " + bank1.getBalance()); 
    System.out.print("Deposit: ");
    bank1.deposit(90705030);
    System.out.print("Withdraw: ");
    bank1.withdraw(7593100);

    bank1.getBalance();
    System.out.println("Saldo Sisa: "+ bank1.getBalance());
  }
    
}
