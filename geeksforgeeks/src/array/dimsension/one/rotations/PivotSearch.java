package array.dimsension.one.rotations;

import java.util.*;
public class PivotSearch{
    public static int findPivot(int [] arr , int low , int high){
        if(low > high)
            return -1;
        if(low == high)
            return low;
        int mid = (low + high)/2;
        if(mid > low && arr[mid] < arr[mid-1])
            return mid-1;
        if(mid < high && arr[mid] > arr[mid+1])
            return mid;
        if(arr[mid] > arr[low])
            return findPivot(arr , mid+1 , high);
        else
            return findPivot(arr , low , mid-1);
    }
    public static int pivotSearch(int [] arr , int key){
        int length = arr.length;
        if(length == 0)
            return - 1;
        int pivot = findPivot(arr , 0 , length -1);
        if(pivot == -1)
            return -1;
        int searchIndex = -1;
        searchIndex = ArrUtils.binarySearch(arr ,0 , pivot,key);
        if(searchIndex == -1)
            searchIndex = ArrUtils.binarySearch(arr , pivot +1 , length -1 , key);
        return searchIndex;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int key = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }

        PivotSearch obj = new PivotSearch();
        System.out.println("Element found at = "+obj.pivotSearch(inputArr , key));

    }
}
