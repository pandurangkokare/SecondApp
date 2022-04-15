package com.hefshine.assign10.minmaxvalue;

public class MinMaxValue {

	public static void main(String[] args) 
	{
		int[]a={12,45,3,4,-1,90,56,36,3,2};
		int tem=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>tem)
			{
				tem=a[i]; 
			}
		}
		System.out.println("max number="+tem);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<tem)
			{
				tem=a[i];
			}
		}
		System.out.println("minimum number="+tem);
	
	}

}
