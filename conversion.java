package com.aditi.lab;

public class conversion {
	public static void main(String[] args){
        int n=22;
        int[] binary =new int[44];
        int pow =1;
        int i=0;
        while(n>0){
            binary[i]=n%2;
            i++;
            n/=2;
        }
        for (int  j=i-1;j>=0;j--){
            System.out.print(binary[j]);
        }
    }
}


