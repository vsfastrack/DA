package array.dimsension.one.rearrangement;
import java.util.*;

public class SortNearSortedArray {
    public void sortASortedArray(int [] input , int k){
        Queue<Integer> minHeap = new PriorityQueue<>();
        if(input.length < k)
            return;
        int index = 0;
        while(index <= k){
            minHeap.add(input[index++]);
        }
        int  i = 0;
        while(!minHeap.isEmpty()){
            input[i++] = minHeap.remove();
            if(index< input.length)
                minHeap.add(input[index++]);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }
        SortNearSortedArray obj = new SortNearSortedArray();
        obj.sortASortedArray(inputArr , k);
        Arrays.stream(inputArr).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
