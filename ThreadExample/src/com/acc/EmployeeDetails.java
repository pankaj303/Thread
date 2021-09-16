package com.acc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.lang.model.element.ExecutableElement;

import com.acc.dao.Employee;
import com.acc.salaryCal.SalaryDetail;

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee e1 = new Employee(25, 8000);
		Employee e2 = new Employee(26, 9000);
		Employee e3 = new Employee(27, 10000);
		Employee e4 = new Employee(28, 11000);
		Employee e5 = new Employee(29, 12000);
		Employee e6 = new Employee(30, 13000);
		Employee e7 = new Employee(31, 14000);
		Employee e8 = new Employee(26, 9000);
		Employee e9 = new Employee(27, 10000);
		Employee e10 = new Employee(28, 11000);

		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		list.add(e9);
		list.add(e10);

		ExecutorService sc = Executors.newFixedThreadPool(4);
		for (int i = 0; i < list.size(); i++) {
			Employee e = list.get(i);
			SalaryDetail s = new SalaryDetail(e);
			sc.execute(s);

		}

	}
}
