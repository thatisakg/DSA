package binarysearchtree;


public class Client {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int arr[] = {10, 5, 4, 20, 21, 18, 19};
        binarySearchTree.addViaArray(arr);
        //binarySearchTree.inOrder();
        // System.out.println(binarySearchTree.diameterLength());
        // System.out.println(binarySearchTree.max());
        // System.out.println(binarySearchTree.min());
        //binarySearchTree.pir(binarySearchTree.min(),binarySearchTree.max());
        
        //binarySearchTree.replaceWithSumOfLargerNodes();
        //binarySearchTree.inOrder();
        
        //binarySearchTree.remove(5);
        //binarySearchTree.inOrder();
        
        //System.out.println(binarySearchTree.lca(5, 4));
        
        binarySearchTree.targetSumPair(25);
    }
}
