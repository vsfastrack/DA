package array.dimsension.one.rearrangement;

import java.util.Arrays;
import java.util.Scanner;

public class PrevAndNextProduct {
    public void reArrangeAsPerProduct(int []  input){
        int temp = input[0] , length = input.length;
        if(length < 2)
            return;
        input[0] = input[0] * input[1];
        for(int index = 1 ; index < length -1 ; index++){
            int x = input[index];
            input[index] = temp * input[index +1];
            temp = x;
            index++;
        }
        input[length -1] = temp * input[length -1];
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }

        PrevAndNextProduct obj = new PrevAndNextProduct();
        obj.reArrangeAsPerProduct(inputArr);
        Arrays.stream(inputArr).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}

