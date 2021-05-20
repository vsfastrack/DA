package tree.common;


public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    public TreeNode(int item){
        this.data = item;
        this.left = null;
        this.right = null;
    }
    TreeNode(int item , TreeNode left , TreeNode right){
        this.data = item;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
