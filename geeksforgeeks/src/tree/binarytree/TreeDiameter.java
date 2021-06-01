package tree.binarytree;

import tree.common.TreeNode;
import tree.common.TreeUtils;

public class TreeDiameter {
    static int maxDiameter = Integer.MIN_VALUE;
    public static void main(String[] args){
        BinaryTree testTree = TreeUtils.readBinaryTree();
        getDiameter(testTree.getRoot());
        System.out.println("Diameter of tree = "+ maxDiameter);
    }
    private static int getDiameter(TreeNode root){
        if(root == null)
            return 0;
        int lHeight = getDiameter(root.getLeft());
        int rHeight = getDiameter(root.getRight());
        if(lHeight + rHeight +1 > maxDiameter)
            maxDiameter = lHeight + rHeight +1;
        return  1 + Math.max(lHeight , rHeight);
    }
}
