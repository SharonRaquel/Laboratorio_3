/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Domain.Client;
/**
 *
 * @author User
 */
public abstract class Account {
    
  protected String accountNumber;
  protected double balance;
  protected Client client;
  
  public Account(){}

    public Account(String accountNumbre, double balance, Client client) {
        this.accountNumber = accountNumbre;
        this.balance = balance;
        this.client = client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumbre) {
        this.accountNumber = accountNumbre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
     
  //-----------------------------------
  //Methods in order to represent the polimorfism
  //-----------------------------------
  
  public abstract void deposit(double account);
  public abstract void withdraw(double account);
  public abstract double interestCalculation();
  
   public String toString(){
   String result = "BANK ACCOUNT INFORMATION:"+
    "\nAccount Number: "+this.getAccountNumber()+
    "\nBalance: "+this.getBalance()+
    "\nAccount Owner: "+this.getClient().toString();
  
  return result;
  }
    
}
