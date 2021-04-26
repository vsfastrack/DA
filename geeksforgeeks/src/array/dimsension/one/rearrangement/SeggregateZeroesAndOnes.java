package array.dimsension.one.rearrangement;

import java.util.*;
public class SeggregateZeroesAndOnes{
    public void seggregate0sand1s(int [] input){
        int length  = input.length;
        int i = 0  , j = length -1 ;
        while(i < j){
            if(input[i] == 0)
                i++;
            if(input[j] == 1)
                j--;
            if(input[i] == 1 && input[j] == 0){
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
        SeggregateZeroesAndOnes obj = new SeggregateZeroesAndOnes();
        obj.seggregate0sand1s(inputArr);
        Arrays.stream(inputArr).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
