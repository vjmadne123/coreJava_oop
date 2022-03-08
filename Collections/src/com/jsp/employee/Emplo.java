package com.jsp.employee;

import java.util.HashSet;

public class Emplo {
	static HashSet<Object>employee = new HashSet<Object>();
	public void addDetails()
	{
		Employee e1=new Employee("salmankhan",101,1000000.0");
		Employee e2=new Employee("karinakafe",102,1000500.0");"
			
				employee.add(e1);
		        employee.add(e2);
		        employee.add(null);
		        employee.add(e1);
		 
	}

	public static void main(String[] args) {
		Emplo e1 =new Emplo();
		e1.addDetails();
		System.out.println(employee);
		employee.forEach(employee1 ->System.out.println(employee));
		// TODO Auto-generated method stub

	}

}
