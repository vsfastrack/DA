package tree.common;

import single.linked.list.Node;
import single.linked.list.SingleLinkedList;
import tree.binarytree.BinaryTree;

import java.util.Scanner;

public class TreeUtils {
    public static BinaryTree readBinaryTree(){
        BinaryTree binaryTree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int z = 0;
        while(z < n){
            binaryTree.insert(scanner.nextInt());
            z++;
        }
        return binaryTree;
    }
    public static BinaryTree fromList(SingleLinkedList<Node> listRepresentation){
        Node headerNode = listRepresentation.getHeaderNode();;
        Node ptr = headerNode;
        if(ptr == null)
            return null;
        Node ptr1 = ptr.getNext();
        if(ptr1 == null)
            return new BinaryTree(new TreeNode(headerNode.getData()));
        Node ptr2 = ptr.getNext().getNext();
        if(ptr2 == null){
            BinaryTree onlyLeftChidTree = new BinaryTree(new TreeNode(headerNode.getData()));
            onlyLeftChidTree.insert(ptr.getData());
            return onlyLeftChidTree;
        }
        BinaryTree constructedBinaryTree = new BinaryTree();
        constructedBinaryTree.insert(ptr.getData());
        ptr1 = ptr.getNext();
        while(ptr1 != null && ptr2 != null){
            constructedBinaryTree.insert(ptr1.getData());
            constructedBinaryTree.insert(ptr2.getData());
            ptr1 = ptr2.getNext();
            ptr2 = ptr1 != null ? ptr1.getNext() : null;
        }
        if(ptr1 != null)
            constructedBinaryTree.insert(ptr1.getData());

        return constructedBinaryTree;
    }
}
