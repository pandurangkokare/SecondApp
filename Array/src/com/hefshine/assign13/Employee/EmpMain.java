package com.hefshine.assign13.Employee;

public class EmpMain {

	public static void main(String[] args) 
	{
		EmployeeSal emp[]=new EmployeeSal[3];
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new EmployeeSal();
		}
		for(int i=0;i<emp.length;i++)
		{
			for(int j=i+1;j<emp.length;j++)
			{
				if(emp[i].sal==emp[j].sal)
				{
					System.out.println(emp[i]+"=="+emp[j]);
				}
			}
		}

	}

}
