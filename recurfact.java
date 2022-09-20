package collection;

import java.util.Scanner;

public class recurfact {
	
	static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    
		 public static void main(String args[]){  
		  int i,fact=1;  
//		  int number=5;//It is the number to calculate factorial  
		  int number;
		  Scanner sc =new Scanner (System.in);
		  System.out.println("Please enter any number:\n");
		  number = sc.nextInt();
		  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
}