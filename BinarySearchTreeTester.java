public class BinarySearchTreeTester{
   public static void main(String[] args){
      BinarySearchTree tree = new BinarySearchTree();
      tree.add(6);
      tree.add(3);
      tree.add(8);
      tree.add(1);
      tree.add(5);
      tree.add(7);
      tree.add(9);
      tree.add(0);
      tree.add(2);
      tree.add(4);
      tree.printTreeSideWays();
      System.out.println("\n\n");
      tree.remove(0);
      tree.remove(1);
      tree.remove(6);
      tree.remove(8);
      tree.remove(5);
      tree.remove(7);
      tree.remove(9);
      tree.remove(3);
      tree.remove(4);
      tree.remove(2);
      tree.printTreeSideWays();
     
   }
}