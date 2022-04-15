package com.hefshine.assign15.replace;

public class Replace_0to1 {

	public static void main(String[] args)
	{
		int a[]={26,0,67,45,100000,78,100,34,00,0,34};

	for(int i=0;i<a.length;i++)
		{	/*if(a[i]==0)
			{
				a[i]=1;
				System.out.println(a[i]);
			}
		else
			System.out.println(a[i]);
			*/int r,sum=0;
		if(a[i]==0)
		{
			a[i]=1;
				//System.out.println(a[i]);
		}
			int tem=a[i];
			
			while(tem>0)
			{
				r=tem%10;
				if(r==0)
				{
					r=1;
				}
				sum=sum*10+r;
				tem=tem/10;
			}a[i]=sum;
			
			//System.out.println(sum);
			

			
		}
		for(int i=0;i<a.length;i++)
		{	int tem=a[i],rem,summ=0;
			while(tem>0)
			{
				rem=tem%10;
				summ=summ*10+rem;
				tem=tem/10;
			}
			System.out.print(summ+" ");
		}
	}

}
