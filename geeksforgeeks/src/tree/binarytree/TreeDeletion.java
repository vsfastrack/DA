package tree.binarytree;

import tree.common.TreeUtils;

public class TreeDeletion {
    public static void main(String[] args){
        BinaryTree binaryTree = TreeUtils.readBinaryTree();
        System.out.println("Tree before deletion is as follows");
        binaryTree.prettyLevelOrderTraversal();
        binaryTree.delete();
        System.out.println("Tree after deletion is as follows");
        binaryTree.prettyLevelOrderTraversal();
    }
}
