package tree.binarytree;

import tree.common.TreeUtils;

public class FoldableBinaryTree {
    public static void main(String[] args){
        BinaryTree testTree = TreeUtils.readBinaryTree();
        System.out.println("Given tree is foldable => "+ testTree.isFoldable());
    }
}
