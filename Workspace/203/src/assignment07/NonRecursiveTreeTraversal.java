package assignment07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NonRecursiveTreeTraversal {

	public static void main(String[] args) {
		
		Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		createBinaryTree(array);
		
		System.out.println("Non Recursive Tree Traversal Using Stack:-");
		System.out.print("Inorder:   ");
		inOrder();
		
		
		System.out.println();
		System.out.print("PreOrder:  ");
		preOrder();
		
		System.out.println();
		System.out.print("PostOrder: ");
		postOrder();
		
		
	}
	
    private static TreeNode root;

    private static class TreeNode {
        TreeNode left;
        TreeNode right;
        int item;

        TreeNode (TreeNode left, TreeNode right, int item) {
            this.left = left;
            this.right = right;
            this.item = item;
        }
    }

    public static void createBinaryTree (Integer[] arr) {
        if (arr == null)  {
            throw new NullPointerException("The input array is null.");
        }

        root = new TreeNode(null, null, arr[0]);

        final Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        final int half = arr.length / 2;

        for (int i = 0; i < half; i++) {
            if (arr[i] != null) {
                final TreeNode current = queue.poll();
                final int left = 2 * i + 1;
                final int right = 2 * i + 2;

                if (arr[left] != null) {
                    current.left = new TreeNode(null, null, arr[left]);
                    queue.add(current.left);
                }
                if (right < arr.length && arr[right] != null) {
                    current.right = new TreeNode(null, null, arr[right]);
                    queue.add(current.right);
                }
            }
        }
    }

    public static void preOrder() {   
        if (root == null) return;

        final Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.add(root);        

        while (!stack.empty()) {
            TreeNode node = stack.pop();           
            System.out.print(node.item + " ");

            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
    }

    public static void inOrder() {
        if (root == null) return;

        final Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;

        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.add(node);
                node = node.left;
            } else {
               node = stack.pop();
               System.out.print(node.item + " "); 
               node = node.right; 
            }
        }
    }

    public static void postOrder  () {
        if (root == null) return;

        final Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;

        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                if (node.right != null) stack.add(node.right);
                stack.add(node);
                node = node.left;
            }

            node = stack.pop();

            if (node.right != null && !stack.isEmpty() && node.right == stack.peek()) {
                TreeNode nodeRight = stack.pop();
                stack.push(node);
                node = nodeRight;
            } else {
                System.out.print(node.item + " ");
                node = null;
            }
        }
    }
    
    public void reverseOrder() {   
        if (root == null) return;

        final Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.add(root);        

        while (!stack.empty()) {
            TreeNode node = stack.pop();           
            System.out.print(node.item + " ");

            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
    }
}