package com.testing;

import com.controller.EmpControl;
import com.entity.Employee;

public class EmpTesting {
	
	public static void main(String[] args) {
		EmpControl ec=new EmpControl();
		Employee[] e1=ec.controlAPI();
		for(Employee e3:e1)
		{
			System.out.println(e3);
		}
		System.out.println("************************************");
		System.out.println(ec.controlAPI1());
		System.out.println("************************************");
		System.out.println(ec.controlAPI2());
		System.out.println("************************************");
		ec.controlAPI3("Developer");
		System.out.println("************************************");
		Employee[] e2=ec.controlAPI3();
		for(Employee e:e2)
		{
			System.out.println(e);
		}
		System.out.println("************************************");
		Employee[] e3=ec.controlAPI4();
		for(Employee e:e3)
		{
			System.out.println(e);
		}
		System.out.println("************************************");
		System.out.println("Employee Name : "+ec.controlAPI5(101));
		
	}

}
