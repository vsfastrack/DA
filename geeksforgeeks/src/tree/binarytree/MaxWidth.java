package tree.binarytree;

import tree.common.TreeUtils;

public class MaxWidth {
    public static void main(String[] args){
        BinaryTree testTree = TreeUtils.readBinaryTree();
        System.out.println("Max width of binary tree => " + testTree.getWidth());
    }
}
