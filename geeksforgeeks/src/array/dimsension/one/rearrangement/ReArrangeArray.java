package array.dimsension.one.rearrangement;
import java.util.Arrays;
import java.util.Scanner;

public class ReArrangeArray {
    public void reArrange(int [] input){
        for(int index = 0 ; index < input.length ; index++){
            input[input[index]%10] = 10*index + input[input[index]%10];
        }
        for(int index = 0 ; index < input.length ; index++){
            input[index] = input[index] / 10;
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

        ReArrangeArray obj = new ReArrangeArray();
        obj.reArrange(inputArr);
        Arrays.stream(inputArr).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}

