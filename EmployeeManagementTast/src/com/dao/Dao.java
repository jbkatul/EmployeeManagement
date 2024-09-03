package com.dao;

import com.entity.Employee;

public class Dao {
	
	public Employee oneEmployee()
	{
		Employee e1=new Employee(101,"Raj","Developer",350000);;
		return e1;
	}
	
	public Employee[] manyEmployee()
	{
		Employee[] e1=new Employee[10];
		e1[0]=new Employee(101,"Raj","Developer",350000);
		e1[1]=new Employee(103,"Devendra","Tester",250000);
		e1[2]=new Employee(105,"Abhishek","HR",450000);
		e1[3]=new Employee(102,"Nirav","Developer",350000);
		e1[4]=new Employee(104,"Rahul","Support Engineer",200000);
		e1[5]=new Employee(107,"Lalit","Developer",350000);
		e1[6]=new Employee(106,"Ani","Front-End Dev..",200000);
		e1[7]=new Employee(109,"Anupam","Senior Software Engineer",450000);
		e1[8]=new Employee(108,"Swapnil","Tester",250000);
		e1[9]=new Employee(110,"Ritik","Developer",350000);
		return e1;
	}

}
