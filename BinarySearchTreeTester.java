//Ivan Medina
//Assignment 3
//CSC130
public class BinarySearchTreeTester{
   public static void main(String[] args){
   
      BinarySearchTree tree = new BinarySearchTree();
      int[] arr = {6,3,8,1,5,7,9,0,2,4};
      
      //Add values to BST.
      System.out.println("Adding values to BST: ");
      for(int i = 0; i < arr.length; i++){
         tree.add(arr[i]);
      }
      
      tree.printTree();
      System.out.println();
      
      //Check contains method functionality
      for(int i = 0; i < 15; i++) {
         System.out.println("Tree contains " +i +": " +tree.contains(i));
      }
      
      //Check remove method functionality with different cases
      System.out.println("\nRemove a node with two children (8)");
      System.out.println("Before:");
      tree.printTree();
      tree.remove(8);
      System.out.println("\nAfter: ");
      tree.printTree();
      
      System.out.println("\n\nRemove a node with one child (left child) (9)");
      System.out.println("Before:");
      tree.printTree();
      tree.remove(9);
      System.out.println("\nAfter: ");
      tree.printTree();
      
      System.out.println("\n\nRemove a leaf node (7)");
      System.out.println("Before:");
      tree.printTree();
      tree.remove(7);
      System.out.println("\nAfter: ");
      tree.printTree();
      
      System.out.println("\n\nRemove a leaf node (0)");
      System.out.println("Before:");
      tree.printTree();
      tree.remove(0);
      System.out.println("\nAfter: ");
      tree.printTree();
      
      System.out.println("\n\nRemove a node with one child (right child) (1)");
      System.out.println("Before:");
      tree.printTree();
      tree.remove(1);
      System.out.println("\nAfter: ");
      tree.printTree();
      
      System.out.println("\n\nRemoving the root (6)");
      System.out.println("Before:");
      tree.printTree();
      tree.remove(6);
      System.out.println("\nAfter: ");
      tree.printTree();
      
      System.out.println("\n\nRemoving a node that does not exist (10)");
      System.out.println("Before:");
      tree.printTree();
      tree.remove(10);
      System.out.println("\nAfter: ");
      tree.printTree();
      
      //Check clear method fucntionality
      System.out.println("\n\nClear the remaining tree and print it:");
      tree.clear();
      tree.printTree();
   }
}