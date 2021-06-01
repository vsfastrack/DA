package tree.binarytree;

import tree.common.TreeNode;
import tree.common.TreeUtils;

public class ChildSumProperty {
    static boolean doesRootValueEqualsChildSum = Boolean.TRUE;
    public static void main(String[] args){
        BinaryTree testTree = TreeUtils.readBinaryTree();
        checkIfChildSumPropertyExists(testTree.getRoot());
        System.out.println("Child Sum Property Exists = "+ doesRootValueEqualsChildSum);
    }
    public static int  checkIfChildSumPropertyExists(TreeNode root){
        if(root == null)
            return 0;
        if(root.getLeft() == null && root.getRight() == null)
            return root.getData();
        int lSum = checkIfChildSumPropertyExists(root.getLeft());
        int rSum = checkIfChildSumPropertyExists(root.getRight());
        doesRootValueEqualsChildSum  = doesRootValueEqualsChildSum && root.getData() == (lSum + rSum) ;
        return root.getData();
    }
}
