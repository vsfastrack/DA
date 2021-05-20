package tree.binarytree;

import array.dimsension.one.rotations.ArrUtils;
import tree.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private TreeNode root;
    public BinaryTree(){

    }
    BinaryTree(TreeNode root){
        this.root = root;
    }
    public void insert(int data){
        if(this.root == null){
            root = new TreeNode(data);
        }else {
            Queue<TreeNode> level = new LinkedList<>();
            level.add(this.root);
            while(!level.isEmpty()){
                TreeNode temp = level.poll();
                if(temp.getLeft() == null){
                    temp.setLeft(new TreeNode(data));
                    break;
                }else if(temp.getRight() == null){
                    temp.setRight(new TreeNode(data));
                    break;
                }
                level.add(temp.getLeft());
                level.add(temp.getRight());
            }
        }
    }
    public void recursiveInOrderTraversal(TreeNode root){
        if(root == null)
            return;
        recursiveInOrderTraversal(root.getLeft());
        System.out.print(root.getData() + " -> ");
        recursiveInOrderTraversal(root.getRight());
    }
    public void inOrderTraversal(){
        recursiveInOrderTraversal(this.root);
        System.out.println();
    }
    public void recursivePreOrderTraversal(TreeNode root){
        if(root == null)
            return;
        System.out.print(root.getData() + " -> ");
        recursivePreOrderTraversal(root.getLeft());
        recursivePreOrderTraversal(root.getRight());
    }
    public void preOrderTraversal(){
        recursivePreOrderTraversal(this.root);
        System.out.println();
    }
    public void recursivePostOrderTraversal(TreeNode root){
        if(root == null)
            return;
        recursivePreOrderTraversal(root.getLeft());
        recursivePreOrderTraversal(root.getRight());
        System.out.print(root.getData() + " -> ");
    }
    public void postOrderTraversal(){
        recursivePostOrderTraversal(this.root);
        System.out.println();
    }
    public void levelOrderTraversal(){
        if(this.root == null)
            return;
        Queue<TreeNode> levelQueue = new LinkedList<>();
        levelQueue.add(this.root);
        while(!levelQueue.isEmpty()){
            TreeNode tempRoot = levelQueue.poll();
            if(tempRoot != null){
                System.out.print(tempRoot.getData() + " ->" );
                levelQueue.add(tempRoot.getLeft());
                levelQueue.add(tempRoot.getRight());
            }
        }
        System.out.println();
    }
    public int getHeight(TreeNode root){
        if(root == null)
            return 0;
        return 1 + getHeight(root.getLeft()) + getHeight(root.getRight()) ;
    }
    public int getHeight(){
        return getHeight(this.root);
    }
    public void prettyLevelOrderTraversal(){
        int height = getHeight(this.root);
        if(height == 0)
            return;
        for(int i = 1; i <= height ; i++){
            for(int j = height - i ; j >= 0 ; j--)
                System.out.print("  ");
            recursiveLevelOrderTraversal(this.root , 1 , i);
            System.out.println();
        }
    }
    public void recursiveLevelOrderTraversal(TreeNode root ,int currentLevel ,int level){
        if(root == null)
            return;;
        if(currentLevel == level){
            System.out.print(" "+ root.getData() + " ");
            return;
        }
        recursiveLevelOrderTraversal(root.getLeft() , currentLevel + 1 , level);
        recursiveLevelOrderTraversal(root.getRight() , currentLevel + 1 , level);
    }
    public void nonRecursiveInOrderTraversal(){
        if(this.root == null)
            return;
        Stack<TreeNode> treeTravesalStack = new Stack<>();
        Stack<TreeNode> inOrderTraversalStack = new Stack<>();
        TreeNode top = this.root;
        treeTravesalStack.add(top);
        while(!treeTravesalStack.isEmpty()){
            top = treeTravesalStack.pop();
            if((top.getLeft() == null && top.getRight() == null) || (!treeTravesalStack.isEmpty() && top.getLeft().equals(treeTravesalStack.peek()))){
                inOrderTraversalStack.add(top);
            }else{
                if(top.getLeft() != null)
                    treeTravesalStack.add(top.getLeft());
                treeTravesalStack.add(top);
                if(top.getRight() != null)
                    treeTravesalStack.add(top.getRight());
            }
        }
        while(!inOrderTraversalStack.isEmpty()){
            System.out.print(inOrderTraversalStack.pop().getData() + " -> ");
        }
    }
    public void iterativePreOrderTraversal(){
        if(this.root == null)
            return;
        Stack<TreeNode> preOrderTraversalStack = new Stack<>();
        preOrderTraversalStack.add(this.root);
        while(!preOrderTraversalStack.isEmpty()){
            TreeNode currentRoot = preOrderTraversalStack.pop();
            System.out.print(currentRoot.getData() + " ");
            if(currentRoot.getRight() != null)
                preOrderTraversalStack.add(currentRoot.getRight());
            if(currentRoot.getLeft() != null)
                preOrderTraversalStack.add(currentRoot.getLeft());
        }
    }
    public void reverseLevelOrderTraversal(){
        if(this.root == null)
            return;
        Stack<TreeNode> reverseLevelStack = new Stack<>();
        Queue<TreeNode> levelQueue = new LinkedList<>();
        levelQueue.add(this.root);
        while(!levelQueue.isEmpty()){
            TreeNode currentRoot = levelQueue.poll();
            if(currentRoot.getRight() != null)
                levelQueue.add(currentRoot.getRight());
            if(currentRoot.getLeft() != null)
                levelQueue.add(currentRoot.getLeft());
            reverseLevelStack.add(currentRoot);
        }
        while(!reverseLevelStack.isEmpty()){
            System.out.print(reverseLevelStack.pop().getData() + " -> ");
        }
    }
    public void levelOrderTraversalUsingTwoQueues(){
        if(this.root == null)
            return;
        Queue<TreeNode> firstLevel = new LinkedList<>();
        Queue<TreeNode> secondLevel = new LinkedList<>();
        firstLevel.add(this.root);
        while(!firstLevel.isEmpty() || !secondLevel.isEmpty()){
            while(!firstLevel.isEmpty()){
                TreeNode currentRoot = firstLevel.poll();
                System.out.print(currentRoot.getData() + " -> ");
                if(currentRoot.getLeft() != null)
                    secondLevel.add(currentRoot.getLeft());
                if(currentRoot.getRight() != null)
                    secondLevel.add(currentRoot.getRight());
            }
            System.out.println();
            while(!secondLevel.isEmpty()){
                TreeNode currentRoot = secondLevel.poll();
                System.out.print(currentRoot.getData() + " -> ");
                if(currentRoot.getLeft() != null)
                    firstLevel.add(currentRoot.getLeft());
                if(currentRoot.getRight() != null)
                    firstLevel.add(currentRoot.getRight());
            }
            System.out.println();
        }
    }
    public void traverseDiagonally(){
        if(this.root == null)
            return;
        Queue<TreeNode> nextLevel = new LinkedList<>();
        TreeNode currentRoot = this.root;
        while(currentRoot != null){
            nextLevel.add(currentRoot);
            currentRoot = currentRoot.getRight();
        }
        while(!nextLevel.isEmpty()){
            currentRoot = nextLevel.poll();
            System.out.print(currentRoot.getData() + " => ");
            addNextLevel(currentRoot.getLeft() , nextLevel);
        }
    }

    public void addNextLevel(TreeNode root , Queue<TreeNode> nextLevel){
        while(root != null){
            nextLevel.add(root);
            root = root.getRight();
        }
    }

    private void getLeafNodes(TreeNode root , Queue<TreeNode> leaves){
        if(root == null)
            return;
        if(root.getLeft() == null && root.getRight() == null){
            leaves.add(root);
        }
        getLeafNodes(root.getLeft() , leaves);
        getLeafNodes(root.getRight() , leaves);
    }

    public boolean ifLeafTraversalsAreSame(BinaryTree targetBinaryTree){
        Queue<TreeNode> sourceTreeLeaves = new LinkedList<>();
        Queue<TreeNode> targetTreeLeaves = new LinkedList<>();
        getLeafNodes(this.root , sourceTreeLeaves);
        getLeafNodes(targetBinaryTree.root , targetTreeLeaves);
        if(sourceTreeLeaves.size() != targetTreeLeaves.size())
            return false;
        while(!sourceTreeLeaves.isEmpty() && !targetTreeLeaves.isEmpty()){
            if(sourceTreeLeaves.poll().getData() != targetTreeLeaves.poll().getData())
                return false;
        }
        return true;
    }
}
