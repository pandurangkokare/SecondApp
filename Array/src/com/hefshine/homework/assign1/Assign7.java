package com.hefshine.homework.assign1;

public class Assign7 {

	public static void main(String[] args) 
	{
		int a[]={-9,23,2,-4,5,7,-11,-13,7};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.print(a[i]+" ");
				count++;
			}
		}
		System.out.println("\nno of negative number is="+count);
			

	}

}
