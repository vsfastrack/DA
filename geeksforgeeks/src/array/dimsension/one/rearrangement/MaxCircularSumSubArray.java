package array.dimsension.one.rearrangement;

import java.util.Scanner;

public class MaxCircularSumSubArray {
    public int findMaxSumCircularSubArray(int [] input){
        int length = input.length , maxBound = 2*length - 1;
        int [] tempArr = new int[maxBound];
        int currSum = 0 , maxSum = Integer.MIN_VALUE;
        int index = 0 , i = 0;
        while(index < maxBound){
            tempArr[i++] = input[index++ % length];
        }
        index = 0;
        while(index < maxBound){
            currSum = currSum + tempArr[index++ % length];
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }
        MaxCircularSumSubArray obj = new MaxCircularSumSubArray();
        //Arrays.stream(obj.findMaxSumCircularSubArray(inputArr)).forEach(x -> System.out.print(x + " "));
        System.out.println(obj.findMaxSumCircularSubArray(inputArr));
    }
}

