package com.service;

import com.dao.Dao;
import com.entity.Employee;

public class EmpService {
	
	Dao d1=new Dao();
	
	
	public Employee[] showAll()
	{
		Employee[] e1=d1.manyEmployee();
		return e1;
	}
	public Employee checkMaxSalary()
	{
		Employee []e1=d1.manyEmployee();
		Employee e2=new Employee();
		e2=e1[0];
		int max=e1[0].getSalary();
		for(int i=1;i<10;i++)
		{
				if(max<e1[i].getSalary())
				{
					max=e1[i].getSalary();
					e2=e1[i];
				}	
		}
		System.out.println("Maximum Salary : "+e2.getSalary());
		return e2;
	}
	public Employee checkMinSalary()
	{
		Employee []e1=d1.manyEmployee();
		Employee e2=new Employee();
		e2=e1[0];
		int min=e1[0].getSalary();
		for(int i=1;i<10;i++)
		{
				if(min>e1[i].getSalary())
				{
					min=e1[i].getSalary();
					e2=e1[i];
				}
		}
		System.out.println("Minimum Salary : "+e2.getSalary());
		return e2;
	}
	public void employeeByRole(String role)
	{
		Employee []e1=d1.manyEmployee();
		for(Employee e2:e1)
		{
			if(e2.getRole().equals(role))
			{
				System.out.println(e2);
			}
		}
	}
	public Employee[] sortEmployeeAsc()
	{
		Employee []e1=d1.manyEmployee();
		Employee e=null;
		for(int i=0;i<e1.length;i++)
		{
			for(int j=i+1;j<e1.length;j++)
			{
				if(e1[i].getId()>e1[j].getId())
				{
					e=e1[i];
					e1[i]=e1[j];
					e1[j]=e;
				}
			}
		}
		return e1;
	}
	public Employee[] sortEmployeeDsc()
	{
		Employee []e1=d1.manyEmployee();
		Employee e=null;
		for(int i=0;i<e1.length;i++)
		{
			for(int j=i+1;j<e1.length;j++)
			{
				if(e1[i].getId()<e1[j].getId())
				{
					e=e1[i];
					e1[i]=e1[j];
					e1[j]=e;
				}
			}
		}
		return e1;
	}
	public String showEmployeeName(int id)
	{
		Employee []e1=d1.manyEmployee();
		for(Employee e:e1)
		{
			if(e.getId()==id)
			{
				return e.getName();
			}
		}
		return null;
	}
}
