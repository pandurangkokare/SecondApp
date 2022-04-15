package com.hefsihine.assign19.additionoftwomat;

public class AddTwoMatrix {

	public static void main(String[] args) 
	{
		int a[][]={{11,44,33},{14,23,12},{15,16,17}};
		int b[][]={{34,15,20},{55,22,10},{5,7,8}};
		int c[][]=new int[a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a.length;j++)			
		{
				System.out.print(c[i][j]+" ");		
		}
			System.out.println();
		}
		

	}

}
