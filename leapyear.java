package com.gurukal.day2;
import java.util.*;
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a year");
    int year=sc.nextInt();
    if((year%400==0)||(year%100!=0))

    	System.out.println("it is a leap year:"+year);
    else
    	System.out.println("it is not a leap year:"+year);
	}

}
