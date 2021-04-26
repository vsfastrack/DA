package array.dimsension.one.rearrangement;

public class RearrangementUtils {
    public static int findFirstOccurence(int [] input , int low ,int high , int key){
        if(low > high)
            return -1;
        if(low == high && input[low] == key)
            return low;
        int mid = (low + high)/2;
        if(mid > low && input[mid] == key && input[mid-1] != key)
            return mid;
        if(mid == low && input[mid] == key)
            return mid;
        if(input[mid] >= key)
            return findFirstOccurence(input , low , mid -1 , key);
        else
            return findFirstOccurence(input , mid+1 , high , key);
    }
    public static int findLastOccurence(int [] input , int low ,int high , int key){
        if(low > high)
            return -1;
        if(low == high && input[high] == key)
            return high;
        int mid = (low + high)/2;
        if(mid < high && input[mid] == key && input[mid+1] != key)
            return mid;
        if(mid == high && input[mid] == key)
            return mid;
        if(input[mid] <= key)
            return findLastOccurence(input , mid +1  , high , key);
        else
            return findLastOccurence(input , low , mid-1 , key);
    }
}
