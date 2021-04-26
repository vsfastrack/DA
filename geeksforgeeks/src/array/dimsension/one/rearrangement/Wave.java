package array.dimsension.one.rearrangement;
import java.util.*;
public class Wave{
    public void reArrangeWave(int [] input){
        int length  = input.length;
        if(length < 3)
            return;
        Arrays.sort(input);
        for(int i = 1 ; i < length -1 ; i+=2){
            if(input[i] < input[i+1]){
                int temp = input[i];
                input[i] = input[i+1];
                input[i+1] = temp;
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

        Wave obj = new Wave();
        obj.reArrangeWave(inputArr);
        Arrays.stream(inputArr).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
