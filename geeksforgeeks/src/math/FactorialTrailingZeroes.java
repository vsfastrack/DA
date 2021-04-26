package math;

import java.util.Scanner;

public class FactorialTrailingZeroes{
	
	public long factorial(int  input){
		if(input == 0 || input == 1)
			return 1;
		else return input * factorial(input -1);
	}
	
	public int findTrailingZeroesInFactorial(int input){
		int highestPowerOfFiveLessThanInput = (int) (Math.floor(Math.log(input) / Math.log(5)));
		double numberOfTrailingZeroes = input * 0.25 * ( 1 - Math.pow(0.20 , highestPowerOfFiveLessThanInput));
		return (int)(numberOfTrailingZeroes);
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);	
		Integer input = scanner.nextInt();
		FactorialTrailingZeroes obj = new FactorialTrailingZeroes();
		System.out.println("The factorial for number is "+ obj.factorial(input));
		System.out.println("Trailing Zeroes in factorial are "+ obj.findTrailingZeroesInFactorial(input));
	}
}