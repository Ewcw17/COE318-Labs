/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab4;

/**
 *
 * @author e225wong
 */
public class Account {
    
    String name;
    int number;
    double balance;
    
    public Account(String name, int number, double initialBalance){
        this.name = name;
        this.number = number;
        this.balance = initialBalance;
    }
    
    String getName(){
        return this.name;
    }
    
    double getBalance(){
        return this.balance;
    }
    
    int getNumber(){
        return this.number;
    }
    
    boolean deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            return true;
        }else{
            return false;
        }
    }
    
    boolean withdraw(double amount){
        if(amount < this.balance && amount > 0){
            this.balance -= amount;
           return true;
        }else{
            return false;
        }
        
    }
    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " + String.format("$%.2f", getBalance()) + ")";
}
}
