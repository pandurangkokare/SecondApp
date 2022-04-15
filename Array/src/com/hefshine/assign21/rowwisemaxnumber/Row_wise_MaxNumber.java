package com.hefshine.assign21.rowwisemaxnumber;

import java.util.Scanner;

public class Row_wise_MaxNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
			int a[][]=new int[3][3];
			System.out.println("enter the elements=");
			
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("===========show matrix===========");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		for(int i=0;i<a.length;i++)
		{			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>sum)
				{
					sum=a[i][j];
				}
			}
			System.out.println("rowth max No="+i+" "+sum);
		}
	}

}
