package Recursion;

import java.util.Scanner;


//1. print the natural number till n
public class Test {
	
	public static void printNatural(int n) {
		if(n<=0) {
			return ;
		}
		else {
			printNatural(n-1);
			System.out.println("Number:"+n);
			
		}
	}
	
	
	
	//2. implement the sum of n natural number

	public static int sum(int n) {
		int sum=0;
		if(n<=1) {
			return 1;
		}
		else {
			sum=n+sum(n-1);
		}
		return sum;
		
	}
	
	//3.implement a program to calculate a^b
	
	public static int power(int a, int b) {
		if(b<=0) {
			return 1;
		}
		else {
			return a*power(a,b-1);
		}
	}
	
	
	//4.implement  a program to find the factorial of the number
	
	static int fact(int n) {
		if(n<=1) {
			return 1;
		}
		else return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number1= sc.nextInt();
		int number2=sc.nextInt();
		
		/*
		printNatural(number);
		System.out.println(sum(number))
		System.out.println(power(number1, number2));

		 */
	System.out.print(fact(number1));
		
		
		
	}

}
