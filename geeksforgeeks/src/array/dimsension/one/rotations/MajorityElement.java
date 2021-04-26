package array.dimsension.one.rotations;
import java.util.*;
public class MajorityElement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int majorityElement = -1 , halfLimit = n/2;
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }
        Arrays.sort(inputArr);
        z= 0 ;
        while(z < (halfLimit - 1)){
            if(inputArr[z + halfLimit] == inputArr[z]){
                majorityElement = inputArr[z];
                break;
            }
            z++;
        }
        System.out.println("Majority element = "+majorityElement);
    }
}
