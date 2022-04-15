package com.hefshine.assign18.array2d;

import java.util.Scanner;

public class Array2_D {

	public static void main(String[] args) 
	{
		int a[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("entert the elements=");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
