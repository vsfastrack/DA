package tree.binarytree;

import tree.common.TreeUtils;

public class MaxLeafPathSum {
    public static void main(String[] args){
        BinaryTree testTree = TreeUtils.readBinaryTree();
        System.out.println("Max Root To Leaf Path Sum Of Binary Tree => " + testTree.getMaxRootToLeafPathSum());
    }
}
