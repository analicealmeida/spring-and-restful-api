package com.ana.spring_com_api_rest;

public class Account {

	private String number;
    private String agency;
    private double balance;
    private double limit;

    // Getters and Setters
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public String getAgency() { return agency; }
    public void setAgency(String agency) { this.agency = agency; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public double getLimit() { return limit; }
    public void setLimit(double limit) { this.limit = limit; }
	
	
}
