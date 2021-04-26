package array.dimsension.one.rotations;

// Time COmplexity of Algorithm is O(n)
import java.util.*;
public class RightRotation{
    public void rightRotate(int [] input , int d){
        int length = input.length;
        if(length < 2 || d < 0)
            return;
        ArrUtils.reverse(input , 0 , length - d -1);
        ArrUtils.reverse(input , length - d , length -1);
        ArrUtils.reverse(input , 0 , length -1);
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }

        RightRotation obj = new RightRotation();
        obj.rightRotate(inputArr , d);
        System.out.println("The result of right rotation ");
        ArrUtils.print(inputArr);
    }
}
