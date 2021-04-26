package math;

import java.util.Scanner;

public class Power{

	public int findPowerUsingIteration(int x , int n){
		int result = 1;
		while(n > 0){
			if(n%2 != 0)
				result = result * x;
			x = x * x;
			n = n/2;
		}
		return result;
	}

	//Recursive algorithm TC = Theta(logn)
	public int findPowerUsingRecursiveCall(int x , int n){
		if(n == 0)
			return 1;
		if(n%2 == 0)
			return findPowerUsingRecursiveCall(x, n/2) * findPowerUsingRecursiveCall(x , n/2);
		else
			return x * findPowerUsingRecursiveCall(x , n-1);
	}
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		Power obj = new Power();
		System.out.println("a ^ b = "+obj.findPowerUsingIteration(a , b));
	}
}