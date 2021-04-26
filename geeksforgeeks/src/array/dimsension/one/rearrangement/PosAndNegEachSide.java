package array.dimsension.one.rearrangement;

import java.util.*;
public class PosAndNegEachSide{
    //Time COmplexity of above algorithm is O(n^2)
    public void rearrangePositiveAndNegativeOnEachSide(int [] input){
        int length  = input.length;
        if(length < 3)
            return;
        for(int i = 0 ;i < length ;i++){
            int j = i;
            while(j< length && input[j] > 0)
                j++;
            int k = j;
            while(k > 0 && k < length && k > i){
                int temp = input[k-1];
                input[k-1] = input[k];
                input[k] = temp;
                k--;
            }
        }
    }
    //Time COmplexity of above algorithm is O(n)
    public int []  rearrangePositiveAndNegativeOnEachSideWithExtraSpace(int [] input){
        int length  = input.length;
        if(length < 2)
            return new int[]{};
        int posCount = 0 , i  = 0 , j =0 , k = 0;
        int [] temp = new int[length];
        for(i = 0 ; i< length; i++){
            if(input[i] > 0)
                posCount++;
        }
        i = 0  ; j = posCount;
        while(i < length){
            if(input[i] > 0)
                temp[k++] = input[i++];
            else
                temp[j++] = input[i++];
        }
        return temp;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }

        PosAndNegEachSide obj = new PosAndNegEachSide();
        // obj.rearrangePositiveAndNegativeOnEachSide(inputArr);
        // System.out.println("Rearragement using modified insertion sort");
        // Arrays.stream(inputArr).forEach(x -> System.out.print(x + " "));
        // System.out.println();

        System.out.println("Rearragement using constant space");
        Arrays.stream(obj.rearrangePositiveAndNegativeOnEachSideWithExtraSpace(inputArr)).forEach(
                x -> System.out.print(x + " ")
        );
        System.out.println();
    }
}
