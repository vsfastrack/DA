package array.dimsension.one.rotations;

public class ArrUtils{
    public static void print(int [] arr){
        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static int binarySearch(int [] arr , int low , int high , int key){
        if(low > high)
            return -1;
        int mid = (low + high)/2;
        if(arr[mid] == key)
            return mid;
        if(key < arr[mid])
            return binarySearch(arr , low , mid -1 , key);
        else
            return binarySearch(arr , mid+1 , high , key);
    }
    public static void reverse(int [] input , int low , int high){
        int length = input.length;
        if(length < 2)
            return;
        while(low < high){
            int temp = input[low];
            input[low] = input[high];
            input[high] = temp;
            low++;high--;
        }
    }
}
