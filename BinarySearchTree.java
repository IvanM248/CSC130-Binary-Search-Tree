//Ivan Medina
//CSC130
//Assignment 3
public class BinarySearchTree {

   private Node root;
   
   public void clear(){
      
      if(root != null){
         root.clear();
         root = null;
      }
   }
   
   public void remove(int value) {
      if(root != null && root.contains(value)) {
         root = root.remove(value);
      }
   }
      
   public boolean contains(int value) {
      if(root != null) {
         return root.contains(value);
      }
      else {
         return false;
      }
   }
   
   public void add(int value) {
      if(this.root == null) {
         this.root = new Node(value, null, null);
      }
      else {
         root.add(value);
      }
   }
   
   //Infix traversal.
   public void printValues() {
      
      if(root != null)
         root.printValues();
   }
   
   //Prefix traversal.
   public void printTree() {
      
      if(root != null)
         //Indent begins with 0.
         root.printTree(0);
   }
   
   public String about(){
      String aboutMe = "My name is Ivan Medina. I am currently";
      aboutMe += "\nin my second year here at Sacramento State as a";
      aboutMe += "\ntransfer student from Sacramento City College";
      aboutMe += "\nmajoring in computer science.";  
      return aboutMe;
   }
}