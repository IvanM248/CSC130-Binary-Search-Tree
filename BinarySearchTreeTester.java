public class BinarySearchTreeTester{
   public static void main(String[] args){
      BinarySearchTree tree = new BinarySearchTree();
      int[] arr = {6,3,8,1,5,7,9,0,2,4};
      
      //Add values to BST.
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
      System.out.println("\nRemove a node with two children (8):");
      tree.remove(8);
      tree.printTree();
      
      System.out.println("\n\nRemove a node with one child (left child):");
      tree.remove(9);
      tree.printTree();
      
      System.out.println("\n\nRemove a leaf node (7):");
      tree.remove(7);
      tree.printTree();
      
      System.out.println("\n\nRemove a leaf node(0):");
      tree.remove(0);
      tree.printTree();
      
      System.out.println("\n\nRemove a node with one child (right child)");
      tree.remove(1);
      tree.printTree();
      
      System.out.println("\n\nRemove the root:");
      tree.remove(6);
      tree.printTree();
      
      //Check clear method fucntionality
      System.out.println("\n\nClear the remaining tree and print it:");
      tree.clear();
      tree.printTree();
   }
}