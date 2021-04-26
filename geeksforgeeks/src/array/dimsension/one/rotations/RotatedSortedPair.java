package array.dimsension.one.rotations;

import java.util.*;
public class RotatedSortedPair{
    public void findPairInRotatedAndSortedArray(int [] input ,int sumPair){
        int length = input.length;
        if(length < 2 || sumPair <= 0)
            return ;
        int pivot = PivotSearch.findPivot(input , 0 , length - 1);
        int start = -1 , end = -1;
        if(pivot == -1){
            start =0 ;end = length -1;
        }else{
            start = pivot + 1;
            end = pivot;
        }
        while(start != end){
            if(input[start] + input[end] == sumPair)
                System.out.println(input[start] + " + "+ input[end] +" = "+sumPair);
            if(input[start] + input[end] < sumPair){
                start = (start + 1) % length;
            }else{
                end = (end == 0) ? length -1 : end - 1;
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumPair = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }
        RotatedSortedPair obj = new RotatedSortedPair();
        obj.findPairInRotatedAndSortedArray(inputArr , sumPair);
    }
}
