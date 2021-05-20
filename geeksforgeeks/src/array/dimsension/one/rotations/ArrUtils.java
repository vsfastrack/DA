package array.dimsension.one.rotations;

import java.util.Scanner;

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
    public static int [] readArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eneter the number of elements in array");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int index = 0;
        while(n-- > 0){
            arr[index++] = scanner.nextInt();;
        }
        return arr;
    }
    public static int linearSearch(int [] arr , int low , int high , int key){
        for(int index = low ; index <= high ; index++){
            if(arr[index] == key)
                return index;
        }
        return -1;
    }
}
