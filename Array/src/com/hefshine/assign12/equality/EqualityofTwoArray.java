package com.hefshine.assign12.equality;

public class EqualityofTwoArray {

	public static void main(String[] args)
	{
		int a[]={1,2,3,5,5,6,7,8,9};
		int b[]={1,2,3,4,5,6,7,8,0};
		if(a.length==b.length)
		{
			
			for(int i=0;i<a.length||i<b.length;i++)
			{
				if(a[i]==b[i])
				{
					System.out.println(a[i]+"=="+a[i]);
				}
				else
					System.out.println("two  array are not equale"+a[i]+"=" +b[i]);
				
				
			}
				
		}
		else	
		System.out.println("above two array are not equale ");
	}

}
