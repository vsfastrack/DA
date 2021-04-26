package array.dimsension.one.rearrangement;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceWithNextLargestElement {
    public void replaceWithNextLargestElement(int [] input){
        int length = input.length;
        int i = 0 , current_max = -1;
        int index = length -1 ;
        while(index >= 0){
            int temp = input[index];
            input[index] = current_max;
            if(temp > current_max)
                current_max = temp;
            index--;
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
        ReplaceWithNextLargestElement obj = new ReplaceWithNextLargestElement();
        obj.replaceWithNextLargestElement(inputArr);
        Arrays.stream(inputArr).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
