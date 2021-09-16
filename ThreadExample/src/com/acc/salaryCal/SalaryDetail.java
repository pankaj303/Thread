package com.acc.salaryCal;

import com.acc.dao.Employee;

public class SalaryDetail implements Runnable  {
	
	Employee e=null;
	public SalaryDetail(Employee e1)
	{
		this.e=e1;
	}
	@Override
	public void run() {
		int employeeBasicPay = e.getEmployeeBasicPay();
		int employeeWorkDay = e.getEmployeeWorkDay();
		int totalSalary=employeeBasicPay*employeeWorkDay;
		System.out.println(totalSalary);
		
	}

}
