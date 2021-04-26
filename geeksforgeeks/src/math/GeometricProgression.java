package math;

import java.util.Scanner;

class GeometricProgression
{
    
    public double termOfGP(int A,int B,int N)
    {
        return ((A*A)/B) * (Math.pow(B/A , N));
    }

    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int N = scanner.nextInt();
		GeometricProgression obj = new GeometricProgression();
		System.out.println(obj.termOfGP(A, B , N));
    }

}