package array.dimsension.one.rotations;

// Implemented the rotation count for a sorted and rotated array
// Time complexity is O(log n)

import java.util.*;
public class RotationCount{
    public int countRotation(int [] input){
        int length =  input.length;
        if(length < 2)
            return -1;
        //Calculates pivot which reflects rotation inside array
        return  (new PivotSearch().findPivot(input , 0 , length -1) + 1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }
        RotationCount obj = new RotationCount();
        System.out.println("Rotation Count = "+obj.countRotation(inputArr));
    }
}
