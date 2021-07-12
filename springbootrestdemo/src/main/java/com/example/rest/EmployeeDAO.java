package com.example.rest;

import org.springframework.stereotype.Repository;

import com.example.rest.Employees;

@Repository
public class EmployeeDAO {

	private static Employees list = new Employees();

	static {

		list.getEmployeeList().add(new Employee(1, "Ram", "Kumar", "ramkumar@gmail.com", "35000"));
		list.getEmployeeList().add(new Employee(2, "Nikitha", "Karthik", "nikitha@gmail.com", "40000"));
		list.getEmployeeList().add(new Employee(3, "Suresh", "Raina", "suresh@gmail.com", "60000"));
	}

	// Method to return the list
	public Employees getAllEmployees() {

		return list;
	}

	// Method to add an employee to the employees list
	public void addEmployee(Employee employee) {
		list.getEmployeeList().add(employee);

	}
}