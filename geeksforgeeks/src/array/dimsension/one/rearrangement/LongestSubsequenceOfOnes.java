package array.dimsension.one.rearrangement;

import java.util.Scanner;

public class LongestSubsequenceOfOnes {
    public int findIndexForZeroReplacement(int [] input){
        int maxLength = Integer.MIN_VALUE , targetIndex = -1 , length = input.length ;
        int prevIndex = 0 ;
        while(prevIndex < length && input[prevIndex] != 0)
            prevIndex++;
        int currentIndex = prevIndex + 1;
        while(currentIndex < length && input[currentIndex] != 0)
            currentIndex++;
        if(currentIndex == length -1 || prevIndex == length -1)
            return length -1;
        int nextIndex = currentIndex + 1;
        while(nextIndex < length){
            if(input[nextIndex] == 0 || nextIndex == length -1){
                int subsequenceOfOnesLength = (nextIndex - currentIndex)+(currentIndex - prevIndex);
                if(subsequenceOfOnesLength > maxLength){
                    maxLength = subsequenceOfOnesLength;
                    targetIndex = currentIndex;
                    currentIndex = nextIndex;
                    prevIndex = targetIndex;
                }
            }
            nextIndex++;
        }
        return targetIndex;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }
        LongestSubsequenceOfOnes obj = new LongestSubsequenceOfOnes();
        System.out.println(obj.findIndexForZeroReplacement(inputArr));
    }
}

