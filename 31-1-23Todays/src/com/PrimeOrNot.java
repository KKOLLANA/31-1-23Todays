package com;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String args[]) {
		   Scanner s = new Scanner(System.in);
//		   nextInt() it is a Scanner method.
		   int no = s.nextInt();  
		   int temp =0;
		   for(int i =2;i<=no-1;i++)
		   {
			   if(no%i == 0)
			   {
				   temp = temp+1;
			   }
		   }
		   if(temp == 0)
		   {
			   
			System.out.println(no+ "is prime number");
		   }
		   else
		   {
			   System.out.println(no+"is not prime");
		   }
		
		    }
	}
		
	


