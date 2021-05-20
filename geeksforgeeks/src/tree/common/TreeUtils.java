package tree.common;

import tree.binarytree.BinaryTree;

import java.util.Scanner;

public class TreeUtils {
    public static BinaryTree readBinaryTree(){
        BinaryTree binaryTree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int z = 0;
        while(z < n){
            binaryTree.insert(scanner.nextInt());
            z++;
        }
        return binaryTree;
    }
}
