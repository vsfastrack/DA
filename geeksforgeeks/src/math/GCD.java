package math;

import java.util.Scanner;

//Implementation of Euclidean algorithm
public class GCD{
	//TC of function = O(log(min(a,b)))
	public int findGCD(int a , int b){
		if(b == 0)
			return a;
		else
			return findGCD(b, a%b);						
	}
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		GCD gcd = new GCD();
		System.out.println("GCD of numbers"+a+" and "+b+" is "+gcd.findGCD(a,b));
	}
}