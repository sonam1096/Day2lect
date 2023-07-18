package com.gurukal.day2;
import java.util.*;
public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a Number");
	    int num=sc.nextInt();
	    for(int i=1;i<=10;i++) {
	    	int n=num*i;
	    	System.out.println(num+"X"+i+" ="+n);
	    }
	}

}
