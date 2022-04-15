package com.hefshine.homework.assign1;

import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("add elements in array=");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		
	}

}
