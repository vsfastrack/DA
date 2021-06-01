package tree.binarytree;

import tree.common.TreeUtils;

public class HeightBalancedBinaryTree {
    public static void main(String[] args){
        BinaryTree binaryTree = TreeUtils.readBinaryTree();
        System.out.println("the tree is actually height balanced "+binaryTree.isTreeHeightBalanced());
    }
}
