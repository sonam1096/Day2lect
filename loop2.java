package com.gurukal.day2;

import java.util.Scanner;

public class loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a Number");
	    int b=sc.nextInt();
	    int e=sc.nextInt();
		  
		 int mul=1;
		 for(int i=1;i<=e;i++) {
			  mul=b*mul;
		 }
		 System.out.println(mul);
				

	}

}
