package array.dimsension.one.rotations;

// Finding min element in rotated and sorted array
// Time Complexity is O(log n)
import java.util.*;
public class RotatedMin{
    public int findMinInRotatedArr(int [] input){
        int length = input.length;
        if(length == 0)
            return -1;
        if(length == 1)
            return input[0];
        int pivot = new PivotSearch().findPivot(input , 0 , length - 1);
        if(pivot == -1)
            return input[0];
        else
            return input[pivot + 1];
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }

        RotatedMin obj = new RotatedMin();
        System.out.println("Minimum element in rotated Arr = "+obj.findMinInRotatedArr(inputArr));
    }
}
