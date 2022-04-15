package com.hefshine.Assign11.secondsmallestno;

public class SecondSmallestno {

	public static void main(String[] args)
	{
		int[]a={12,45,3,4,-1,90,56,1,3,4};
		int tem=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>tem)
			{
				tem=a[i];
			}
		}
		System.out.println("max number="+tem);
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{ 
				min=a[i];
			}
		}
		int max=tem;
		System.out.println("minimum number="+min);
	
		for(int i=0;i<a.length;i++)
		{
			if(min!=a[i]&&a[i]<max)
			{
				max=a[i];
			}
		}
		System.out.println("second smallest number="+max);

	}

}
