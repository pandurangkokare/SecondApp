 package com.hefshine.assign13.Employee;

import java.util.Scanner;

public class EmployeeSal
{
	int id;
	String name;
	double sal;
	public EmployeeSal()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the empid=");
		this.id=sc.nextInt();
		System.out.println("enter the emp name=");
		this.name=sc.next();
		System.out.println("enter the sal=");
		this.sal=sc.nextDouble();
	}
	@Override
	public String toString() {
		return "EmployeeSal [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	

}
