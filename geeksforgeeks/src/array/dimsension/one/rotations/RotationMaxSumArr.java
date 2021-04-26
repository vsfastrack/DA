package array.dimsension.one.rotations;

import java.util.*;
public class RotationMaxSumArr{

    public int maxRotationSum(int [] input){
        int length = input.length;
        if(length == 0)
            return -1;
        if(length == 1)
            return input[0];
        int sum = 0 , seriesSum = 0 , maxSum = Integer.MIN_VALUE;
        for(int i = 0 ;i < length ; i++){
            seriesSum += i * input[i];
            sum += input[i];
        }
        int localSeriesSum = seriesSum;
        for(int index = 1 ; index< length ; index++){
            localSeriesSum = localSeriesSum  - (sum - input[index - 1]) + (length-1)*(input[index - 1]);
            maxSum = Math.max(maxSum, localSeriesSum);
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
        RotationMaxSumArr obj = new RotationMaxSumArr();
        System.out.println("Maximum sum of rearrangement ="+obj.maxRotationSum(inputArr));
    }
}