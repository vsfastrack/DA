package tree.binarytree;

import tree.common.TreeNode;
import tree.common.TreeUtils;

public class InOrderSuccessor {
    static TreeNode sharedRoot;
    public static void main(String[] args){
        BinaryTree testTree = TreeUtils.readBinaryTree();
        System.out.println("InOrder Successors for nodes are as below =>");
        printinOrderSuccessor(testTree.getRoot()) ;
    }
    private static void printinOrderSuccessor(TreeNode root){
        if(root == null)
            return;
        printinOrderSuccessor(root.getLeft());
        if(sharedRoot != null)
            System.out.println(sharedRoot.getData() + " => "+ root.getData());
        sharedRoot = root;
        printinOrderSuccessor(root.getRight());
    }
}
