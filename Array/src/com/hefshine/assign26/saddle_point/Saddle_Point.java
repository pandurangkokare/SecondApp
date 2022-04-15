package com.hefshine.assign26.saddle_point;

public class Saddle_Point {

	public static void main(String[] args) 
	{
		int a[][]={{6,3,1},{9,7,8},{2,4,5}};
		int min[]=new int[3];
		int max[]=new int[3];
		System.out.println("==============show matrix=======");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
			for(int i=0;i<a.length;i++)
			{
				int tem=a[i][0];
				for(int j=0;j<a.length;j++)
				{
					if(a[i][j]<tem)
					{
						tem=a[i][j];
					}
				}
				min[i]=tem;
			}
			for(int i=0;i<a.length;i++)
			{
				int tem=a[0][i];
				for(int j=0;j<a.length;j++)
				{
					if(a[j][i]>tem)
					{
						tem=a[j][i];
					}
				}
				max[i]=tem;
			//	System.out.println(max[i]);
			}
			for(int i=0;i<a.length;i++)
			{
			
				if(min[i]==max[i])
				{
					System.out.println("saddle point is="+min[i]);
				}
			
			}

	}

}
