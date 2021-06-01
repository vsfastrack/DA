package tree.binarytree;

import tree.common.TreeUtils;

import java.util.Scanner;

public class LeastCommonAcestor {
    public static void main(String[] args){
        BinaryTree testTree = TreeUtils.readBinaryTree();
        Scanner scanner = new Scanner(System.in);
        int keyOne = scanner.nextInt();
        int keyTwo = scanner.nextInt();
        System.out.println("Least Common Ancestor for given nodes = "+testTree.findLeastCommonAncestor(keyOne , keyTwo).getData());
    }
}
