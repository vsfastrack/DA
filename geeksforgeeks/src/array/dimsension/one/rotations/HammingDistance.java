package array.dimsension.one.rotations;

import java.util.*;
public class HammingDistance{
    public void printMaxHammingDistancePermutation(int [] input){
        int length = input.length;
        if(length == 0)
            return;
        Map<Integer, List<Integer>> recordMap = new HashMap<Integer, List<Integer>>();
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < length; i++){
            int element = input[i];
            if(recordMap.get(element) == null){
                recordMap.put(element, Collections.singletonList(i));
            }else{
                List<Integer> indexRecord = recordMap.get(element);
                indexRecord.add(i);
                recordMap.put(element, indexRecord);
            }
        }
        int maxHammingDistance = Integer.MAX_VALUE , minRotations = -1;
        for(Map.Entry<Integer,List<Integer>> entry : recordMap.entrySet()){
            List<Integer> indexEntry = entry.getValue();
            Integer HammingDistance = (indexEntry.get(1) - indexEntry.get(0));
            if(indexMap.get(HammingDistance) == null){
                indexMap.put(HammingDistance , 1);
            }else{
                int originalCount = indexMap.get(HammingDistance);
                indexMap.put(HammingDistance , originalCount + 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : indexMap.entrySet()){
            if(maxHammingDistance > entry.getValue()){
                minRotations = entry.getKey();
                maxHammingDistance = entry.getValue();
            }
        }
        new LeftRotation().leftRotate(input , minRotations);
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] inputArr = new int[n];
        int z = 0;
        while(z < n){
            inputArr[z++] = scanner.nextInt();
        }

        HammingDistance obj = new HammingDistance();
        obj.printMaxHammingDistancePermutation(inputArr);
        System.out.println("One of the max hamming distance rotations ");
        ArrUtils.print(inputArr);
    }
}