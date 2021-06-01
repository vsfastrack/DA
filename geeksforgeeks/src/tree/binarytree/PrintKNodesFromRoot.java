package tree.binarytree;

import tree.common.TreeUtils;

import java.util.Scanner;

public class PrintKNodesFromRoot {
    public static void main(String[] args){
        BinaryTree testTree = TreeUtils.readBinaryTree();
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println("Nodes at k distance from root");
        testTree.printKNodesFromRoot(k);
    }
}
