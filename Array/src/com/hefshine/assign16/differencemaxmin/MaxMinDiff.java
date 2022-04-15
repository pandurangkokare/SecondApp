package com.hefshine.assign16.differencemaxmin;

public class MaxMinDiff {

	public static void main(String[] args)
	{
		int[]a={12,45,3,4,1,90,56,36,3,2};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		//System.out.println(max+" "+min);
		int diffNo=max-(min);
		System.out.println("minimum number="+diffNo);
	


	}

}
