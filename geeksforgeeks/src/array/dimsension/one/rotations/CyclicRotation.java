package array.dimsension.one.rotations;

import java.util.*;
public class CyclicRotation{
    public void rotateCyclically(int [] input){
        int length = input.length;
        if(length <= 1)
            return ;
        LeftRotation obj = new LeftRotation();
        obj.leftRotate(input , length - 1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }

        CyclicRotation obj = new CyclicRotation();
        obj.rotateCyclically(inputArr);
        ArrUtils.print(inputArr);
    }
}
