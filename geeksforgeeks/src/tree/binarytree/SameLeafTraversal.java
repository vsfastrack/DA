package tree.binarytree;

import tree.common.TreeUtils;

public class SameLeafTraversal {
    public static void main(String[] args){
        BinaryTree sourceBinaryTree = TreeUtils.readBinaryTree();
        BinaryTree targetBinaryTree = TreeUtils.readBinaryTree();
        System.out.println("The leaf traversals for binary trees are same => "+sourceBinaryTree.ifLeafTraversalsAreSame(targetBinaryTree));
    }
}
