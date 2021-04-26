package array.dimsension.one.rearrangement;

import java.util.Scanner;

public class MaxProdSubArray {
    public int [] findMaxProdSubArray(int [] input){
        int length = input.length;
        int [] resultIndexes = new int[2];
        int  index = 0 , currentProdSum = 1 , maxProdSum = Integer.MIN_VALUE , previousIndex = 0;
        while(index < length){
            currentProdSum = currentProdSum * input[index];
            if(currentProdSum > maxProdSum){
                maxProdSum = currentProdSum;
                resultIndexes = new int[]{previousIndex , index};
            }
            else if(currentProdSum == 0){
                currentProdSum = 1;
                previousIndex = index +1 ;
            }
            index++;
        }
        return resultIndexes;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }
        MaxProdSubArray obj = new MaxProdSubArray();
        int [] resultantSubArr =  obj.findMaxProdSubArray(inputArr);
        for(int  i = resultantSubArr[0] ; i <= resultantSubArr[1] ; i++){
            System.out.print(inputArr[i] + " ");
        }
        System.out.println();
    }
}

