package tree.binarytree;

import tree.common.TreeUtils;

import java.util.Scanner;

public class BinaryTreeContainingPath {
    public static void main(String[] args){
        BinaryTree srcbinaryTree = TreeUtils.readBinaryTree();
        Scanner scanner = new Scanner(System.in);
        int targetNumber = scanner.nextInt();
        System.out.println("The tree contains path having sum as given number "+srcbinaryTree.ifTreeHasPathForGivenNumber(targetNumber));
    }
}
