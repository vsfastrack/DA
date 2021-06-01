package tree.binarytree;

import single.linked.list.Node;
import single.linked.list.SingleLinkedList;
import single.linked.list.utils.ListUtils;
import tree.common.TreeUtils;

public class ConstructTreeFromList {
    public static void main(String[] args){
        SingleLinkedList<Node> listrepresentationOfTree = ListUtils.readList();
        BinaryTree treeFromList = TreeUtils.fromList(listrepresentationOfTree);
        if(treeFromList != null)
            treeFromList.prettyLevelOrderTraversal();
    }
}
