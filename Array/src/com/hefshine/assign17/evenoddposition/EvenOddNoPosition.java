package com.hefshine.assign17.evenoddposition;

public class EvenOddNoPosition {

	public static void main(String[] args) 
	{
		int a[]={12,13,11,14,88,15,17,20,22,44  };
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a.length;j++)
		{
			if(a[j]%2==	1)
			{
				int tem=a[i];
				a[i]=a[j];
				a[j]=tem;
			}
		}
		}
/*		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[sum]=a[i];
				sum++;
			}
		}
		for(int j=0;j<a.length;j++)
		 {
			if(a[j]%2==1)
			{
				b[sum]=a[j];
				sum++;
			}
		}*/
		

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
                        