package com.hefshine.assign22.student;

import java.util.Scanner;

public class StudentMarks 
{
	int rollno;
	String name;
	int marks;
	public StudentMarks()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rollno=");
		this.rollno=sc.nextInt();
		System.out.println("entert the name=");
		this.name=sc.next();
		System.out.println("enter the mark=");
		this.marks=sc.nextInt();
	}
	@Override
	public String toString() {
		return "StudentMarks [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
