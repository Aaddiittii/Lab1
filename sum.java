package com.aditi.lab;
import java.util.*;
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n,d,s=0;
		System.out.println("\n Enter a number:");
		n=sc.nextInt();
		while(n!=0)
		{
			d=n%10;
			s=s+d;
			n=n/10;
		}
		System.out.println("Sum of the digits="+s);
		
		}

	}


