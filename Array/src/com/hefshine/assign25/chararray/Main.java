   package com.hefshine.assign25.chararray;

public class Main {

	public static void main(String[] args)
	{
		ArrayCharConcat a1=new ArrayCharConcat();
		char [] s1={'a','b','c','d'};
		char []s2={'w','x','y','z'};
		a1.interleaved(s1,s2,s1.length,s2.length);
	}

}
