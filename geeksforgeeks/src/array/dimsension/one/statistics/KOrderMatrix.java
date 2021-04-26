package array.dimsension.one.statistics;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class KOrderMatrix {
    public int kthOrderMatrix(int [][] inputMatrix ,int n ,int m , int k){
        Queue<Integer> minHeap = new PriorityQueue<Integer>();
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j< m ; j++){
                minHeap.add(inputMatrix[i][j]);
            }
        }
        while( k > 1 && !minHeap.isEmpty()){
            minHeap.remove();
            k--;
        }
        return minHeap.poll();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int [][] inputMatrix = new int[][]{{10, 20, 30, 40}, {15, 25, 35, 45}, {24, 29, 37, 48}, {32, 33, 39, 50}};
        int z = 0 , y = 0;
        KOrderMatrix obj = new KOrderMatrix();
        System.out.println(obj.kthOrderMatrix(inputMatrix , n , m , k));
        System.out.println();
    }
}

