package lab07;

public class TestBinaryTree {
	   public static void main(String[] args) {
	   // Create a BinaryTree
	      BST<String> tree = new BST<String>();
	      tree.insert("Jaimmy");
	      tree.insert("James");
	      tree.insert("Tom");
	      tree.insert("Larry");
	      tree.insert("Jones");
	      tree.insert("Paul");
	      tree.insert("Daniel");
	      tree.insert("Jeniffer");
	   
	   // Traverse tree
	      System.out.print("Inorder (sorted):- ");
	      tree.inorder();
	      
	      System.out.println();
	      System.out.print("\nPostorder:- ");
	      tree.postorder();
	      
	      System.out.println();
	      System.out.print("\nPreorder:- ");
	      tree.preorder();
	      
	      System.out.println();
	      System.out.print("\nThe number of nodes is:- " + tree.getSize());
	   
	   // Search for an element
	      System.out.println();
	      System.out.print("\nIs Peter in the tree? " + tree.search("Peter"));
	   
	   // BREADTH FIRST SEARCH of given Tree
	      System.out.println();
	      System.out.print("\nThe \"BREADTH FIRST TRAVERSAL\" is:- ");
	      tree.breadthFirstTraversal();
	      
	   // Finds the HEIGHT of the given Tree
	      System.out.println();
	      System.out.print("\nThe \"HEIGHT OF THE TREE\" from the given nodes is:- " + tree.height());
	   
	   // Get a path from the root to Peter
	      System.out.println();
	      System.out.print("\nA path from the root to Peter is:- ");
	      java.util.ArrayList<BST.TreeNode<String>>  path 
	         = tree.path("Peter");
	      for (int i = 0; path != null && i < path.size(); i++)
	         System.out.print(path.get(i).element + " ");
	   
	      Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
	      BST<Integer> intTree = new BST<Integer>(numbers);
	      System.out.println();
	      System.out.print("\nInorder (sorted):- ");
	      intTree.inorder();
	   }
	}