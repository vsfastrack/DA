package array.dimsension.one.rearrangement;

import java.util.*;
public class SeggregateEvensAndOdds{
    public void reArrangeEvenAndOdd(int [] input){
        int length  = input.length;
        int i = 0 , j = length -1;
        while(i < j){
            if(input[i] % 2 == 0)
                i++;
            if(input[j] % 2 != 0)
                j--;
            if(input[i] % 2 != 0 && input[j] % 2 == 0){
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }

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
        SeggregateEvensAndOdds obj = new SeggregateEvensAndOdds();
        obj.reArrangeEvenAndOdd(inputArr);
        Arrays.stream(inputArr).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
