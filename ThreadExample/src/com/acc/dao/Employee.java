package com.acc.dao;

public class Employee {

	private int employeeWorkDay;
	private int employeeBasicPay;
	public Employee(int day,int pay) {
		
		this.employeeWorkDay=day;
		this.employeeBasicPay=pay;
	}
	

	public int getEmployeeWorkDay() {
		return employeeWorkDay;
	}
	public int getEmployeeBasicPay() {
		return employeeBasicPay;
	}
	
}
