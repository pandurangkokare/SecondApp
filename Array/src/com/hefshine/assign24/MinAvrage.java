package com.hefshine.assign24;

public class MinAvrage 
{
	int avg=0,i,j,Ind=0,sum=0,tem=0;
public void FindFirstsub(int[] a,int n) 
{
	
	for( i=0;i<=a.length-n;i++)
	{
		 tem=avg;
		avg=0;
		sum=0;
		for(j=i;j<i+n;j++)
		{
			
			sum=sum+a[j];
		}
		
		avg=sum/n;
		if(avg<=tem)
		{
			Ind=i;
			tem=avg;
	
		}
	}
	System.out.println("Index posi="+Ind+" "+"average"+tem);
}

	

}
