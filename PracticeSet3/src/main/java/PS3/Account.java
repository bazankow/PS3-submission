package PS3;

import java.util.*;

import Exceptions.InsufficientFundsException;

import java.io.*;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(){
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	public Account(int newId, int newBalance){
		this.id = newId;
		this.balance = newBalance;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		double monthlyInterestRate = this.annualInterestRate/12;
		return monthlyInterestRate;
	}
	
	public void withdraw(double ammount)throws InsufficientFundsException {
		if (ammount <= this.balance){
			this.balance = this.balance - ammount;
		}
		else{
			double defficit = ammount - balance;
			throw new InsufficientFundsException(defficit);
		}
		
	}
	
	public void deposit(double ammount){
		this.balance = this.balance + ammount;
	}
}
