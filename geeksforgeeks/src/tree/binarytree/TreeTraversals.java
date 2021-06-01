package tree.binarytree;

import tree.common.TreeUtils;

public class TreeTraversals {
    public static void main(String[] args){
        BinaryTree binaryTree = TreeUtils.readBinaryTree();
//        System.out.println("Binary Tree InOrder Traversal is as follows");
//        binaryTree.inOrderTraversal();
//        System.out.println("Binary Tree PreOrder Traversal is as follows");
//        binaryTree.preOrderTraversal();
//        System.out.println("Binary Tree PostOrder Traversal is as follows");
//        binaryTree.postOrderTraversal();
//        System.out.println("Binary Tree Level Order Traversal is as follows");
//        binaryTree.levelOrderTraversal();
//        System.out.println("Binary Tree Pretty Level Order Traversal is as follows");
//        binaryTree.prettyLevelOrderTraversal();
//        System.out.println("Binary Tree Inorder Traversal without recursion is as follows");
//        binaryTree.nonRecursiveInOrderTraversal();
//        System.out.println("Binary Tree Iterative PreOrder Traversal is as follows");
//        binaryTree.iterativePreOrderTraversal();
//        System.out.println("Binary Tree Reverse Level Order Traversal is as follows");
//        binaryTree.reverseLevelOrderTraversal();
//        System.out.println("Binary Tree Level Order Traversal Using two queues is as follows");
//        binaryTree.levelOrderTraversalUsingTwoQueues();
//        System.out.println("Binary Tree Diagonal Order Traversal is as follows");
//        binaryTree.traverseDiagonally();
//        System.out.println("Binary Tree Level Vertical Traversal is as follows");
//        binaryTree.traverseVertically();
        System.out.println("Binary Tree Boundary Level Traversal is as follows");
        binaryTree.printBoundary();
    }
}
