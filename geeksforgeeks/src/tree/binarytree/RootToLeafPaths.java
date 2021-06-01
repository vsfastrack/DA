package tree.binarytree;

import tree.common.TreeUtils;

public class RootToLeafPaths {
    public static void main(String[] args){
        BinaryTree testTree = TreeUtils.readBinaryTree();
        System.out.println("The root to leaves paths are as follows");
        testTree.printRootToLeavesPath();
    }
}
