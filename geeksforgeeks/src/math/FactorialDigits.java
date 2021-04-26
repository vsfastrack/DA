package math;

import java.util.Scanner;

public class FactorialDigits{
	public long findFactorialInDigits(int input){
		double result = 0;
		while(input >= 1){
			System.out.println("Result ="+result);
			result = result  + Math.log10(input--);
		}
		System.out.println("Result "+result);
		System.out.println("Floor "+Math.floor(result));
		return (int) (Math.floor(result) + 1);
	}
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		FactorialDigits obj = new FactorialDigits();
		System.out.println("Digits in "+input+"! = "+obj.findFactorialInDigits(input));
	}
}