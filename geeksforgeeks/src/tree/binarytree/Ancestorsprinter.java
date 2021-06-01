package tree.binarytree;

import tree.common.TreeUtils;

import java.util.Scanner;

public class Ancestorsprinter {
    public static void main(String[] args){
        BinaryTree srcTree = TreeUtils.readBinaryTree();
        Scanner scanner= new Scanner(System.in);
        int key = scanner.nextInt();
        srcTree.printAncestors(key);
    }
}
