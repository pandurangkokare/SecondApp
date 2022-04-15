package com.hefshine.assign22.student;

public class StudMain {

	public static void main(String[] args) 
	{
		StudentMarks s1[]=new StudentMarks[5]; 
		for(int i=0;i<s1.length;i++)
		{
			s1[i]=new StudentMarks();
		}
		int i,j;
		
		for( i=0;i<s1.length;i++)
		{for( j=0;j<s1.length;j++)
			{
				if(s1[i].marks<s1[j].marks)
				{
					s1[i]=s1[j];
					
				}
			}
		System.out.println(s1[i]);
		break;
		}
		
		
		

	}

}
