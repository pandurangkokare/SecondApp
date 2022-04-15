package com.hefshine.assign25.chararray;

public class ArrayCharConcat 
{

	public void interleaved(char s1[],char s2[],int s1_len,int s2_len)
	{		char s3[]=new char[s1.length+s2.length];
		int n=0;
		for(int i=0;i<s1.length;i++)
		{
			s3[n]=s1[i];
			n=n+2;
		}
		 n=1;
		for(int i=0;i<s2.length;i++)
		{
			s3[n]=s2[i];
			n=n+2;
		}
		System.out.println("concat caracter s1&s2=");
		for(int i=0;i<s3.length;i++)
		{
			System.out.print(s3[i]);
		}
		/*for(int i=0;i<(s1.length+s2.length);i++)
		{
			System.out.println(s1[i]);
			System.out.println(s2[i]);
		}*/
	}
}
