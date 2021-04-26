package math;//using formula = [LCM x HCF = a x b]

import java.util.Scanner;

public class LCM{
	//TC of function = O(log(min(a,b)))
	public int findLCM(int a , int b){
		int gcd = new GCD().findGCD(a , b);
		return (a*b)/(gcd);	
	}
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		LCM lcm = new LCM();
		System.out.println("GCD of numbers"+a+" and "+b+" is "+lcm.findLCM(a,b));
	}
}