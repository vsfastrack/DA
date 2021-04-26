package array.dimsension.one.statistics;

import java.util.Arrays;
import java.util.Scanner;

public class NextGreaterElement {
    public void printNextGreaterElement(int [] input){
        int length = input.length , absoluteMax = input[length -1] , localMax = -1;
        int [] result = new int[length];
        result[length -1] = -1;
        for(int index = length -2 ; index >= 0 ; index--){
            if(input[index] > absoluteMax){
                result[index] = -1;
                absoluteMax = input[index];
            }else if(input[index] > localMax){
                result[index] = absoluteMax;
                localMax = input[index];
            }else{
                result[index] = localMax;
            }
        }
        Arrays.stream(result).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }
        NextGreaterElement obj = new NextGreaterElement();
        obj.printNextGreaterElement(inputArr);
    }
}
