package tree.binarytree;

import array.dimsension.one.rotations.ArrUtils;

public class PostOrderFromInOrderAndPreOrder {
    static int preIndex = 0;
    public static void main(String[] args){
        int [] preOrderTraversal = ArrUtils.readArray();
        int [] inOrderTraversal = ArrUtils.readArray();
        System.out.println("Post Order Traversal is as follows");
        printPostOrderFromInOrderAndPreOrder(preOrderTraversal , inOrderTraversal , 0 , preOrderTraversal.length -1);
    }
    public static void printPostOrderFromInOrderAndPreOrder(int [] pre , int  [] in , int low , int high){
        if(low > high)
            return;
        int inIndex = ArrUtils.linearSearch(in , low , high , pre[preIndex++]);
        printPostOrderFromInOrderAndPreOrder(pre , in , low , inIndex - 1);
        printPostOrderFromInOrderAndPreOrder(pre , in , inIndex + 1 , high);
        System.out.print(in[inIndex] +" -> ");
    }
}
