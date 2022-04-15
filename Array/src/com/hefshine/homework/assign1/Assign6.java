package com.hefshine.homework.assign1;

import java.util.Scanner;

public class Assign6 {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size=");
		int size=sc.nextInt();
	
		int a[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int tem;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{	if(a[i]<a[j])
			{
				tem=a[i];
				a[i]=a[j];
				a[j]=tem;
			}
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
