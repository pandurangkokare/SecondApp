package com.hefshine.Assign23.employeesal;

import java.util.Scanner;

public class Employeesal 
{
	int id;
	String name;
	double sal;
	public Employeesal()
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
		return "Employeesal [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

}
