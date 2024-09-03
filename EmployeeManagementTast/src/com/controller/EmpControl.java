package com.controller;

import com.entity.Employee;
import com.service.EmpService;

public class EmpControl {
	EmpService es;
	
	public Employee[] controlAPI()
	{
		es=new EmpService();
		return es.showAll();
	}
	public Employee controlAPI1()
	{
		es=new EmpService();
		return es.checkMaxSalary();
	}
	public Employee controlAPI2()
	{
		es=new EmpService();
		return es.checkMinSalary();
	}
	public void controlAPI3(String role)
	{
		es=new EmpService();
		es.employeeByRole(role);
	}
	public Employee[] controlAPI3()
	{
		es=new EmpService();
		return es.sortEmployeeAsc();
	}
	public Employee[] controlAPI4()
	{
		es=new EmpService();
		return es.sortEmployeeDsc();
	}
	public String controlAPI5(int id)
	{
		es=new EmpService();
		return es.showEmployeeName(id);
	}
	
 
}
