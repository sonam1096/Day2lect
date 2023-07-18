package com.gurukal.day2;
import java.util.*;
public class Areaofcirclesquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("1. Circle  2. Triangle 3. Square");
   System.out.println("Enter your choice");
   int choice = sc.nextInt();
   double area;
   
   switch(choice)
   {
   case 1 :
	   System.out.println("Enter th radius: ");
	   int radius =sc.nextInt();
	   area=Math.PI*Math.pow(radius, 2);
	   System.out.println("area of circle: "+area);
	   break;
	   
	   
   case 2:
	   System.out.println("Enter the base and height: ");
	   int base=sc.nextInt();
	   int ht=sc.nextInt();
	   area=0.5*base*ht;
	   System.out.println("area of triangle: "+area);
	   break;
	   
   case 3:
	   System.out.println("Enter th side: ");
	   int side =sc.nextInt();
	   area=Math.pow(side, 2);
	   System.out.println("area of square: "+area);
	   break;
	   
	 default:
		 System.out.println("Enter correct choice");
		 
	   
	   
   }
   
	}

}
