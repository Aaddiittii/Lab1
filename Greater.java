package com.aditi.lab;

public class Greater {
	public static void main(String[]args)
	{
		int a[]= {5,7,6,78,98,64,42,55};
		int i,max;
		max=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		
		System.out.println("Greatest no is:"+max);
		System.out.println("The greater no.is found at index is:"+(i+1));
		
	}

}


