package com.hefshine.homework.assign1;

public class Assign1 {

	public static void main(String[] args) 
	{
		int a[]={4,77,34,2,1};
		int sum=0;
		int l=a.length;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
	int	averrage=sum/l;
	System.out.println("average of array element is ="+averrage);

	}

}
