package com.hefshine.assign27.triplates;

import java.util.Scanner;

public class Triplates {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size=");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements=");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the number=");
		int num=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]<num)
					{
						System.out.println("("+a[i]+","+a[j]+","+a[k]+")");
					}
				}
			}
		}
	}
}
