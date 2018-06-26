package com.bean;

import java.util.ArrayList;

public class Department {
	String DepartmentName; ArrayList<Employee> employee=new ArrayList<>();

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public ArrayList<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(ArrayList<Employee> employee) {
		this.employee = employee;
	}
	
}
