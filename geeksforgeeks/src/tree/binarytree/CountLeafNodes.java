package tree.binarytree;

import tree.common.TreeUtils;

public class CountLeafNodes {
    public static void main(String[] args){
        BinaryTree testTree = TreeUtils.readBinaryTree();
        System.out.println("Count of leaf nodes in binary tree = "+testTree.countLeafNodes());
    }
}
