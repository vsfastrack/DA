package array.dimsension.one.rearrangement;
import java.util.*;
public class PosNegWave{
    //Method for rearranging positive and negative
    public void rearrangePosAndNegAlternate(int  [] input){
        int length = input.length;
        if(length  < 3)
            return;
        int i = 0 , j= 1;
        while(i < length && j < length){
            if(input[i] > 0 && input[j] < 0){
                i += 2;
                j += 2;
            }else if(input[i] < 0 && input[j] > 0){
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i += 2;
                j += 2;
            }else if(input[i] < 0)
                j += 2;
            else
                i += 2;
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

        PosNegWave obj = new PosNegWave();
        obj.rearrangePosAndNegAlternate(inputArr);
        Arrays.stream(inputArr).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
