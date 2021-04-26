package array.dimsension.one.rotations;

import java.util.*;
public class Reverse{
    public static void reverse(int [] arr , int start , int end){
        int length =arr.length;
        if(length ==0 || start >= end || end > length -1 )
            return;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++ ;
            end-- ;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }

        Reverse obj = new Reverse();
        obj.reverse(inputArr , 0 , n -1);
        ArrUtils.print(inputArr);
    }
}
