package tree.binarytree;

import tree.common.TreeUtils;

import java.util.Scanner;

public class NodeLevel {
    public static void main(String[] args){
        BinaryTree testTree = TreeUtils.readBinaryTree();
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        System.out.println("The level of Node is as follows => " + testTree.getLevel(key));
    }
}
