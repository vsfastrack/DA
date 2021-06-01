package tree.binarytree;

import tree.common.TreeUtils;

public class IdenticalTrees {
    public static void main(String[] args){
        BinaryTree srcbinaryTree = TreeUtils.readBinaryTree();
        BinaryTree targetBinaryTree = TreeUtils.readBinaryTree();
        System.out.println("The given trees are identical "+ srcbinaryTree.ifTreesAreIdentical(targetBinaryTree));

    }
}
