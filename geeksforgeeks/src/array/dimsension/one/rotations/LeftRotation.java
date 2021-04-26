package array.dimsension.one.rotations;

import java.util.*;
public class LeftRotation{
    public void leftRotate(int [] arr, int d){
        int length = arr.length;
        if(length == 0 || d == 0 || d >= length)
            return;
        Reverse.reverse(arr , 0 , d-1);
        Reverse.reverse(arr , d , length -1);
        Reverse.reverse(arr , 0 ,length-1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }

        LeftRotation obj = new LeftRotation();
        obj.leftRotate(inputArr , d);
        ArrUtils.print(inputArr);
    }
}
