package array.dimsension.one.rearrangement;

import java.util.*;
public class MaxMinWave{
    public int [] reArrangeMaxMinWave(int [] input){
        int length  = input.length;
        int [] auxArr = new int[length];
        int i = 0 , j = length -1,z =0;
        while(i <= j && z < length){
            auxArr[z++] = input[j--];
            if(z < length)
                auxArr[z++] = input[i++];
        }
        return auxArr;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }
        MaxMinWave obj = new MaxMinWave();
        Arrays.stream(obj.reArrangeMaxMinWave(inputArr)).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
