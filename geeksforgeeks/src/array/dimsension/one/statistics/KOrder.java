package array.dimsension.one.statistics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class KOrder {
    public Integer[] kSmallOrderElements(Integer [] input , Integer k){
        int length = input.length;
        if(length == 0 || k > length)
            return new Integer[]{};
        Arrays.sort(input);
        return Arrays.copyOf(input , k);
    }
    public Integer [] kLargeOrderElements(Integer [] input , Integer k){
        int length = input.length;
        if(length == 0 || k > length)
            return new Integer[]{};
        Arrays.sort(input , Comparator.reverseOrder());
        return Arrays.copyOf(input , k);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Integer [] inputArr = new Integer[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }
        KOrder obj = new KOrder();
        Arrays.stream(obj.kSmallOrderElements(inputArr , k)).forEach(x -> System.out.print(x + " "));
        System.out.println();
        Arrays.stream(obj.kLargeOrderElements(inputArr , k)).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}

