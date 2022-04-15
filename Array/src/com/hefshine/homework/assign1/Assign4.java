package com.hefshine.homework.assign1;

public class Assign4 {

	public static void main(String[] args)
	{
		int a[]={23,11,12,4,5,1,8};
		int b[]={21,7,45,23,2,9,0};
		int n=0;
		int k=a.length+b.length;
		int merge[]=new int[k];
		for(int i=0;i<a.length;i++)
		{
			
			merge[n]=a[i];
			n=n+2;
		}
			 n=1;
			 
		for(int j=0;j<b.length;j++)
		{
			merge[n]=b[j];
		  	n=n+2;
		}

			for(int i=0;i<merge.length;i++)
			{
				System.out.println(merge[i]);
			}
		/*int n=0;
		int k=a.length+b.length;
		int merge[]=new int[k];
		for(int i=0;i<a.length;i++)
		{
			
			merge[n]=a[i];
			n++;
		}
	
			 
		for(int j=0;j<b.length;j++)
		{
			merge[n]=b[j];
			n++;
			
		}

			for(int i=0;i<merge.length;i++)
			{
				System.out.println(merge[i]);
			}
			*/
			
	}

}
