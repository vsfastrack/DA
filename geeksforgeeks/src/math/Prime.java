package math;//Time Complexity is O(n x sqrt(n))

import java.util.Arrays;
import java.util.Scanner;

public class Prime{
	public boolean [] populatePrimesArray(int limit){
		boolean [] primesArray = new boolean[limit + 1]; 
		Arrays.fill(primesArray, true);
		for(int i = 2 ; i <= limit ; i++){
			if(primesArray[i]){
				for(int j = i*i ; j<= limit ; j=j+i){
					primesArray[j] = false;	
				}
			}
		}
		return primesArray;
	}
	public void printPrimesUsingSieveOfEratosthenes(int limit){
		if(limit < 2)
			return ;
		boolean [] sieveOfEratosthenesArray = populatePrimesArray(limit);
		for(int i = 2 ; i <= limit ; i++){
			if(sieveOfEratosthenesArray[i]){
				System.out.print(i+" , ");
			}
		}
		System.out.println();
	}
	//Naive approach O(n x sqrt(n))
	public void printPrimes(int limit){
		if(limit <= 1)
			return;
		for(int i = 2 ; i <= limit ; i++){
			if(isPrime(i)){
				System.out.print(i+" , ");
			}
		}
		System.out.println();
	}
	public boolean isPrime(int number){
		if(number < 2)
			return false;
		int cnt = (int) (Math.sqrt(number));
		while(cnt >= 2 && number % cnt != 0)
			cnt--;
		return (cnt < 2);

	}
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		Prime primeInstance = new Prime();
		primeInstance.printPrimesUsingSieveOfEratosthenes(a);
	}
}