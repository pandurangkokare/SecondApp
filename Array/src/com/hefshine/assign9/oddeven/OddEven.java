package com.hefshine.assign9.oddeven;

public class OddEven {

	public static void main(String[] args)
	{
			int a[]={12,13,45,67,66,88,90,96899};
			int even[]=new int[a.length];
			int odd[]=new int [a.length];
			int count=0,count1=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
				{
					even[count]=a[i];
					count++;
				}
			}
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==1)
				{
					odd[count1]=a[i];
					count1++;
				}
			}
			System.out.println("even elements=");
			for( count=0;count<even.length;count++)
			{
				System.out.print(even[count]+" ");
			}
			System.out.println();
			System.out.println("odd elements=");
			for(int i=0;i<odd.length;i++)
			{
				System.out.print(odd[i]+" ");
			}

	}

}
