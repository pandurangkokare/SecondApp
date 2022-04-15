package com.hefshine.Assign23.employeesal;

public class Main {

	public static void main(String[] args) 
	{
		
			Employeesal emp[]=new Employeesal[5];
			for(int i=0;i<emp.length;i++)
			{
				emp[i]=new Employeesal();
			} 
			for(int i=0;i<emp.length;i++)
			{
				for(int j=0;j<emp.length;j++)
				{	if(emp[i].sal>emp[j].sal)
					{	Employeesal tem=emp[i];
						emp[i]=emp[j];
						emp[j]=tem;
					}
				}
			}

				for(int j=0;j<emp.length;j++)
				{
					System.out.println(emp[j]);
				}
			
	}

}
