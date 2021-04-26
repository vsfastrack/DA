package array.dimsension.one.rearrangement;
import java.util.*;
public class SortedSubSequence{
    public int []  findSortedSubSequence(int [] input){
        int length  = input.length;
        int [] maxOnRight = new int[length];
        int [] minOnLeft =  new int[length];
        int  j = length - 1 , i = 0 , currentMax = Integer.MIN_VALUE , currentMin =Integer.MAX_VALUE;
        while( j >= 0){
            maxOnRight[j] = currentMax;
            if(input[j] > currentMax)
                currentMax = input[j];
            j--;
        }
        Arrays.stream(maxOnRight).forEach(x -> System.out.print(x + " "));
        System.out.println();
        while( i < length){
            minOnLeft[i] = currentMin;
            if(input[i] < currentMin)
                currentMin = input[i];
            i++;
        }
        Arrays.stream(minOnLeft).forEach(x -> System.out.print(x + " "));
        System.out.println();
        return maxOnRight;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }
        SortedSubSequence obj = new SortedSubSequence();
        obj.findSortedSubSequence(inputArr);
        Arrays.stream(inputArr).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
