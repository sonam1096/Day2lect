package com.gurukal.day2;
import java.util.*;
public class series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	double n=3;
//		double fact=1,sum=0;
//     for(double i=1;i<=n;i++) {
//    	 fact=fact*i;
//    	 sum=sum+1/fact;
//    	  
//     }
//     System.out.println(sum);	double n=3;
//		double fact=1,sum=0,num=1;
//	     for(double i=1;i<10;i++) {
//	    	 fact=fact*i;
//	    	 if(i%2!=0) {
//	    	 sum=sum+(num/fact);
//	    	 num=-num;
//	    	 } 
//	     }
//	     System.out.println(sum);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number:");
		double x=sc.nextDouble();
		 x=Math.toRadians(x);
		 double fact=1,sum=0,num=x,n=3;
	     for(double i=1;i<n;i++) {
	    	 fact=fact*i;
	    	 if(i%2!=0) {
	    	 sum=sum+(num/fact);
	    	 num=-num*x*x;
	    	 } 
	     }
	     System.out.println(sum);
	}

}
