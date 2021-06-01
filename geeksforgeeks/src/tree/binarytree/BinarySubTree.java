package tree.binarytree;

import tree.common.TreeUtils;

public class BinarySubTree {
    public static void main(String[] args){
        BinaryTree srcTree = TreeUtils.readBinaryTree();
        BinaryTree targetTree  = TreeUtils.readBinaryTree();
        System.out.println("Target tree is subtree of Source Tree => "+srcTree.isSubtree(targetTree));
    }
}
