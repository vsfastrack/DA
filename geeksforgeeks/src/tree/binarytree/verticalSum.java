package tree.binarytree;

import tree.common.TreeUtils;

public class verticalSum {
    public static void main(String[] args){
        BinaryTree testTree = TreeUtils.readBinaryTree();
        testTree.getVerticalSum();
    }
}
