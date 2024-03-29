//Ivan Medina
//CSC 130
//Assignment 3
public class Node {
   
   public int data;
   public Node left;
   public Node right;
   
   public Node(int data, Node left, Node right) {
   
      this.data = data;
      this.left = left;
      this.right = right;
   }
   
   public Node remove(int value) {
   
      if(value < this.data) {
         this.left = this.left.remove(value);
      }
      else if(value > this.data) {
         this.right = this.right.remove(value);
      }
      else {
         //Case 1: removing a leaf node.
         if(this.left == null && this.right == null) {
            return null;   
         }
         //Case 2: removing a node with one child (right child).
         else if(this.left == null && this.right != null) {
            return this.right;
         }
         //Case 2: removing a node with one child (left child).
         else if(this.right == null && this.left != null) {
            return this.left;
         }
         //Case 3: removing a node with two children.
         else if(this.right != null && this.left != null) {
            //Get data from min node.
            int minData = this.right.getMinData();
            //Remove min node.
            this.right = this.right.removeMin();
            //Swap data from current node to data from min node.
            this.data = minData;
         }
      }
      return this;
   }

   //Removes smallest value node from the BST recursively.
   public Node removeMin() {
      if(this.left == null) {
         //Once min node is reached, return its right node to assign
         //to the parent of the min node being deleted.
         return this.right;
      }
      else {
         this.left = this.left.removeMin();
      }
      return this;
   }
   
   //Recursively return the min value starting at a specified node
   public int getMinData() {
      if(this.left == null) {
         return this.data;
      }
      else {
         return this.left.getMinData();
      }
   }
   
   public void clear() {
   
      //Post-Order traversal.
      if(this.left != null) {
         //visit left subtree.
         this.left.clear();
      }
      
      if(this.right != null) {
         //visit right subtree.
         this.right.clear();
      }
      
      this.left = null;
      this.right = null;
   }
     
   public boolean contains(int value) {
   
      if(value > this.data && this.right != null){
         return this.right.contains(value);
      }
      else if(value < this.data && this.left != null){
         return this.left.contains(value);
      }
      else if(value == this.data) {
         return true;
      }
      else {
         return false;
      }
   }
   
   public void add(int value) {
   
      if(value > this.data && this.right != null) {
         this.right.add(value);
      }
      else if(value < this.data && this.left != null) {
         this.left.add(value);
      }
      else if(value > this.data && this.right == null) {
         this.right = new Node(value, null, null);
      }
      else if(value < this.data && this.left == null) {
         this.left = new Node(value, null, null);
      }
   }
   
   public void printValues() {
      
      if(left != null) {
         //Print left subtree
         left.printValues();      
      }
      
      //print root
      System.out.print("" + data +" ");
      
      if(right != null) {
         //print right subtree
         right.printValues();
      }
   }
   
   public void printTree(int indent) {
      
      for(int i = 0; i < indent; i++) {
         System.out.print(" ");      
      }
      //Visit root
      System.out.println("+-- " +data);
      
      //vist left subtree
      if(left != null) {
         left.printTree(indent+1);
      }
      //visit right subtree
      if(right != null) {
         right.printTree(indent+1);
      }
   }
}