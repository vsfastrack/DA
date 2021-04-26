package array.dimsension.one.rearrangement;
import java.util.*;
public class RangeArrangement{
    public void rangeArrangement(int [] input , int low , int high){
        int length  = input.length;
        if(length == 0)
            return;
        int lowCount = 0 , rangeCount = 0 , highCount = 0 , i = 0 , j = 0 , k =0 , l =0;
        while( i < length){
            if(input[i] < low)
                lowCount++;
            else if(input[i] >= low && input[i] <= high)
                rangeCount++;
            else
                highCount++;
            i++;
        }
        i = 0; j = lowCount ; k = lowCount + rangeCount;
        while( i < lowCount && j < lowCount + rangeCount && k < lowCount + rangeCount + highCount){
            if(input[i] < low)
                i++;
            if(input[j] >= low && input[j] <= high)
                j++;
            if(input[k] > high)
                k++;
            if(input[i] >= low && input[i] <= high && input[j] < low){
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j++;
            }else if(input[i] >= high && input[k] < low){
                int temp = input[k];
                input[k] = input[i];
                input[i] = temp;
                i++;
                k++;
            }else if(input[j] > high && k < length && input[k] >= low && input[k] <= high){
                int temp = input[k];
                input[k] = input[j];
                input[j] = temp;
                j++;
                k++;
            }else if(input[k] < low && input[i] >= low && input[i] <= high && input[j] > high){
                int temp = input[k];
                input[k] = input[j];
                input[j] = input[i];
                input[i] = temp;
                i++;
                j++;k++;
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int low  = scanner.nextInt();
        int high = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }

        RangeArrangement obj = new RangeArrangement();
        obj.rangeArrangement(inputArr , low , high);
        Arrays.stream(inputArr).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}