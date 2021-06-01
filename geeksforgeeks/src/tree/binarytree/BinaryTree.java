package tree.binarytree;

import array.dimsension.one.rotations.ArrUtils;
import tree.common.TreeNode;

import java.util.*;

public class BinaryTree {
    private TreeNode root;
    public BinaryTree(){

    }
    public BinaryTree(TreeNode root){
        this.root = root;
    }
    public TreeNode getRoot(){return this.root;}
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
        return 1 + Math.max(getHeight(root.getLeft()) , getHeight(root.getRight())) ;
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
    private void traverseVertically(TreeNode root , int level , Map<Integer , LinkedList<TreeNode>> container){
        if(root == null)
            return;
        LinkedList<TreeNode> nodesAtLevel = container.get(level);
        if(nodesAtLevel != null){
            nodesAtLevel.add(root);
            container.put(level , nodesAtLevel);
        }else{
            LinkedList<TreeNode> newLevel = new LinkedList<>();
            newLevel.add(root);
            container.put(level , newLevel);
        }
        traverseVertically(root.getLeft() , level - 1 , container);
        traverseVertically(root.getRight() , level + 1 , container);
    }
    public void traverseVertically(){
        if(this.root == null)
            return;
        Map<Integer , LinkedList<TreeNode>> verticalLevels = new TreeMap<>();
        traverseVertically(this.root , 0 , verticalLevels);
        verticalLevels.forEach((k ,v) -> {
            v.forEach(currentRoot -> {
                System.out.print(currentRoot.getData() + " => ");
            });
            System.out.println();
        });
    }
    private void printBoundary(TreeNode root , Set<Integer> visitedLevels , int level){
        if(root == null)
            return;
        if(root.getLeft() == null && root.getRight() == null || (!visitedLevels.contains(level))){
            System.out.print(root.getData() +" => ");
        }
        printBoundary(root.getLeft() , visitedLevels , level - 1);
        printBoundary(root.getRight() , visitedLevels , level + 1);
    }
    public void printBoundary(){
        if(this.root == null)
            return;
        Set<Integer> visitedLevels = new HashSet<>();
        printBoundary(this.root , visitedLevels , 0);
    }

    /**
     * Delete all the nodes in Java simply by assigning null to reference to root as null
     */
    public void delete(){
        this.root = null;
    }

    private boolean ifTreesAreIdentical(TreeNode ptr1 , TreeNode ptr2){
        if(ptr1 == null && ptr2 == null)
            return true;
        if((ptr1 == null || ptr2 == null))
            return false;
        return ifTreesAreIdentical(ptr1.getLeft() , ptr2.getLeft()) && ifTreesAreIdentical(ptr1.getRight() , ptr2.getRight()) && (ptr1.getData() == ptr2.getData());
    }

    /**
     * Checks if target tree is being identical to given tree
     * Time Complexity is O(n)
     * @param targetTree
     * @return
     */
    public boolean ifTreesAreIdentical(BinaryTree targetTree){
        return ifTreesAreIdentical(this.root , targetTree.root);
    }

    private boolean ifTreeHasPathForGivenNumber(TreeNode root , int targetNumber){
        if(root == null && targetNumber == 0)
            return true;
        if(root != null && targetNumber != 0)
            return  ifTreeHasPathForGivenNumber(root.getLeft() , targetNumber - root.getData()) ||
                    ifTreeHasPathForGivenNumber(root.getRight() , targetNumber - root.getData());
        return false;
    }

    public boolean ifTreeHasPathForGivenNumber(int targetNumber){
        return ifTreeHasPathForGivenNumber(this.root , targetNumber);
    }

    private int isTreeHeightBalanced(TreeNode root){
        if(root == null)
            return 0;
        int lHeight = isTreeHeightBalanced(root.getLeft());
        int rHeight = isTreeHeightBalanced(root.getRight());
        System.out.println("Root "+root.getData() +"lHeight - rHeight  =" + Math.abs(lHeight - rHeight));
        if(Math.abs(lHeight - rHeight) > 1)
            return Integer.MIN_VALUE;
        else
            return 1 + Math.max(lHeight , rHeight);
    }
    public boolean isTreeHeightBalanced(){
        return isTreeHeightBalanced(this.root) != Integer.MIN_VALUE;
    }
    private int countLeafNodesRecursively(TreeNode root){
        if(root == null)
            return 0;
        if(root.getLeft() == null && root.getRight() == null)
            return 1;
        return countLeafNodesRecursively(root.getLeft()) + countLeafNodesRecursively(root.getRight());
    }
    public int countLeafNodes(){
        return countLeafNodesRecursively(this.root);
    }
    private TreeNode findLeastCommonAncestor(TreeNode root , int keyOne , int keyTwo ){
        if(root == null)
            return root;
        if(root.getData() == keyOne || root.getData() == keyTwo)
            return root;
        TreeNode nodeFromLeftSubTree = findLeastCommonAncestor(root.getLeft() , keyOne , keyTwo);
        TreeNode nodeFromRightSubTree = findLeastCommonAncestor(root.getRight() , keyOne , keyTwo);
        if(nodeFromLeftSubTree != null && nodeFromRightSubTree != null)
            return root;
        return nodeFromLeftSubTree != null ? nodeFromLeftSubTree : nodeFromRightSubTree;
    }
    public TreeNode findLeastCommonAncestor(int valueOne , int valueTwo){
        TreeNode lcaNode = findLeastCommonAncestor(this.root , valueOne , valueTwo);
        return lcaNode;
    }
    private void printRootToLeafPath(TreeNode root , Stack<TreeNode> activePathCandidates){
        if(root == null)
            return;
        activePathCandidates.push(root);
        if(root.getLeft() == null && root.getRight() == null){
            activePathCandidates.forEach(x -> {
                System.out.print(x.getData() + "  ");
            });
            System.out.println();
            return;
        }
        printRootToLeafPath(root.getLeft() , activePathCandidates);
        activePathCandidates.pop();
        printRootToLeafPath(root.getRight() , activePathCandidates);
        activePathCandidates.pop();
    }
    public void printRootToLeavesPath(){
        printRootToLeafPath(this.getRoot() , new Stack<>());
    }
    private boolean ifSubTreeRelationHolds(TreeNode root1 , TreeNode root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        return (root1.getData() ==  root2.getData()) &&
                ifSubTreeRelationHolds(root1.getLeft() , root2.getLeft()) &&
                ifSubTreeRelationHolds(root1.getRight() , root2.getRight());

    }
    private TreeNode findMatchingRoot(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null)
            return null;
        if(root1 == null || root2 == null)
            return null;
        if(root1.getData() == root2.getData())
            return root1;
        TreeNode matchingRootInLeftSubTree = findMatchingRoot(root1.getLeft() , root2.getLeft());
        TreeNode matchingRootInRighSubTree = findMatchingRoot(root1.getRight() , root2.getRight());
        if(matchingRootInLeftSubTree != null)
            return matchingRootInLeftSubTree;
        if(matchingRootInRighSubTree != null)
            return matchingRootInRighSubTree;
        return null;
    }
    public boolean isSubtree(BinaryTree targetTree){
        TreeNode matchingRoot = findMatchingRoot(this.getRoot() , targetTree.getRoot());
        return ifSubTreeRelationHolds(matchingRoot , targetTree.getRoot());
    }
    public boolean checkIfSumTreeHolds(){
        int subTreesValue = checkIfSumTreeExists(this.getRoot());
        return (subTreesValue == this.getRoot().getData() * 2);
    }
    public int checkIfSumTreeExists(TreeNode root){
        if(root == null)
            return 0;
        if(root.getLeft() == null && root.getRight() == null)
            return root.getData();
        int lSum = checkIfSumTreeExists(root.getLeft());
        int rSum = checkIfSumTreeExists(root.getRight());
        if(lSum + rSum != root.getData())
            return Integer.MIN_VALUE;
        return root.getData() + lSum +  rSum;
    }
    private void printAncestors(TreeNode root , int key , int [] tempArr , int index){
        if(root == null)
            return;
        tempArr[index] = root.getData();
        if(root.getData() == key){
            ArrUtils.print(tempArr , 0 , index);
            return;
        }
        printAncestors(root.getLeft() , key , tempArr , index +1);
        printAncestors(root.getRight() , key , tempArr , index +1);
    }
    public void printAncestors(int value){
        int [] tempArr = new int [10001];
        printAncestors(this.getRoot() , value , tempArr , 0);
    }
    private int getLevel(TreeNode root, int key ,int level){
        if(root == null)
            return -1;
        if(root.getData() == key)
            return level;
        int levelOfNodeINLeftSubTree = getLevel(root.getLeft() , key , level + 1);
        if(levelOfNodeINLeftSubTree != -1)
            return levelOfNodeINLeftSubTree;
        return getLevel(root.getRight() , key , level + 1);
    }
    public int getLevel(int value){
        return getLevel(this.root , value , 1);
    }
    private void printKNodesFromRoot(TreeNode root , int k , int currentLevel){
        if(root == null)
            return;
        if(currentLevel == k)
            System.out.print(root.getData() + "  ");
        printKNodesFromRoot(root.getLeft() , k , currentLevel +1);
        printKNodesFromRoot(root.getRight() , k , currentLevel +1);
    }
    public void printKNodesFromRoot(int k){
        printKNodesFromRoot(this.getRoot() , k , 0);
    }
    private boolean isFoldable(TreeNode root1 , TreeNode root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        if(root1.getLeft() != null && root2.getRight() == null)
            return false;
        if(root1.getRight() != null && root2.getLeft() == null)
            return false;
        return isFoldable(root1.getLeft() , root2.getLeft()) && isFoldable(root1.getRight() , root2.getRight());
    }
    public boolean isFoldable(){
        if(this.getRoot() == null)
            return true;
        return isFoldable(this.getRoot().getLeft() , this.getRoot().getRight());
    }
    private int getWidth(TreeNode root , int targetLevel , int currentLevel){
        if(root == null)
            return 0 ;
        if(targetLevel == currentLevel)
            return 1;
        return getWidth(root.getLeft() , targetLevel , currentLevel +1) +
                getWidth(root.getRight() , targetLevel , currentLevel +1);
    }
    public int getWidth(){
        int height = this.getHeight() , maxWidth = Integer.MIN_VALUE;
        for(int level = 1 ; level <= height ;level++ ){
            maxWidth = Math.max(maxWidth , getWidth(this.getRoot() , level , 1));
        }
        return maxWidth;
    }
    private int getMaxRootToLeafPathSum(TreeNode root , int [] pathArr , int index){
        if(root == null)
            return 0;
        pathArr[index] = root.getData();
        if(root.getLeft() == null && root.getRight() == null)
            return ArrUtils.findSum(pathArr , 0 , index);
        int pathSumFromLeftSubTree = getMaxRootToLeafPathSum(root.getLeft() , pathArr , index+1);
        int pathSumFromRightSubtree = getMaxRootToLeafPathSum(root.getRight() , pathArr , index +1);
        return Math.max(pathSumFromLeftSubTree , pathSumFromRightSubtree);
    }
    public int getMaxRootToLeafPathSum(){
        int [] pathArr = new int [1001];
        return getMaxRootToLeafPathSum(this.getRoot() , pathArr , 0);
    }
    private void recordVerticalSum(TreeNode root , int [] verticalSumArr , int verticalLevel){
        if(root == null)
            return;
        verticalSumArr[verticalLevel] = verticalSumArr[verticalLevel] + root.getData();
        recordVerticalSum(root.getLeft() , verticalSumArr , verticalLevel - 1);
        recordVerticalSum(root.getRight() , verticalSumArr , verticalLevel + 1);
    }
    public void getVerticalSum(){
        int height = getHeight();
        int maxCountOfNodes = (int) Math.pow( 2 , (height -1));
        int [] verticalSumArr = new int[maxCountOfNodes +1];
        recordVerticalSum(this.getRoot() , verticalSumArr , maxCountOfNodes /2);
        System.out.println("Vertical sum of nodes is as follows => ");
        for(int  i = 0 ; i <= maxCountOfNodes ; i++){
            if(verticalSumArr[i] != 0 )
                System.out.print(verticalSumArr[i] + " , ");
        }
        System.out.println();
    }
}
