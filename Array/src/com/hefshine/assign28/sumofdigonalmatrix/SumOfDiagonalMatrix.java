package com.hefshine.assign28.sumofdigonalmatrix;

public class SumOfDiagonalMatrix {

	public static void main(String[] args)
	{
		int a[][]={{2,3,4},{6,7,8},{9,7,4}};
		System.out.println("=======matrix=========");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			}
			
		}
		System.out.println("sum of diagonal elements="+sum);
		

	}

}
