package array.dimsension.one.statistics;

import java.util.Scanner;

public class MaxDifference {
    public int findMaxDifference(int [] input){
        int length = input.length;
        int index = length -1 , localMin = Integer.MAX_VALUE , localMax = -1, maxDiff = Integer.MIN_VALUE;
        while(index >= 0){
            if(input[index] < localMin)
                localMin = input[index];
            else if(input[index] > localMax){
                int diff = localMax - localMin;
                if(diff > 0 && diff > maxDiff)
                    maxDiff = diff;
                localMax = input[index];
                localMin = input[index];
            }
            index--;
        }
        return Math.max(maxDiff, (localMax - localMin));
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }
        MaxDifference obj = new MaxDifference();
        System.out.println("The result is as follows ====");
        System.out.println(obj.findMaxDifference(inputArr));
    }
}

