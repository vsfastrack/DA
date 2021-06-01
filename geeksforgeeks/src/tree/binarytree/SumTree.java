package tree.binarytree;

import tree.common.TreeUtils;

public class SumTree {
    public static void main(String[] args){
        BinaryTree srcTree = TreeUtils.readBinaryTree();
        System.out.println("Tree is sum tree => "+ srcTree.checkIfSumTreeHolds());
    }
}
