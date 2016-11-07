package assignment02;

import java.util.*;

public class BST<E extends Comparable<E>> implements Iterable<E> {
	public static void main(String[] args) {
		Integer[] a = { 1, 5, 2, 7, 4 };
		BST<Integer> bst = new BST<Integer>();
		for (Integer n : a)
			bst.insert(n);

		bst.preOrderTraversal();
		System.out.println();

		bst = new BST<Integer>(new MyComp1());
		for (Integer n : a)
			bst.insert(n);

		bst.preOrderTraversal();
		System.out.println();
		bst.inOrderTraversal();
		System.out.println();

		for (Integer n : bst)
			System.out.print(n);
		System.out.println();

		System.out.println(bst);

		bst.restore(new Integer[] { 11, 8, 6, 4, 7, 10, 19, 43, 31, 29, 37, 49 }, new Integer[] { 4, 6, 7, 8, 10, 11,
				19, 29, 31, 37, 43, 49 });
		bst.preOrderTraversal();
		System.out.println();
		bst.inOrderTraversal();
		System.out.println();

		//System.out.println("diameter = " + bst.diameter());

		//System.out.println("width = " + bst.width());
	}

	private Node<E> root;
	private Comparator<E> comparator;

	public BST() {
		root = null;
		comparator = null;
	}

	public BST(Comparator<E> comp) {
		root = null;
		comparator = comp;
	}

	private int compare(E x, E y) {
		if (comparator == null)
			return x.compareTo(y);
		else
			return comparator.compare(x, y);
	}

	public void insert(E data) {
		root = insert(root, data);
	}

	private Node<E> insert(Node<E> p, E toInsert) {
		if (p == null)
			return new Node<E>(toInsert);

		if (compare(toInsert, p.data) == 0)
			return p;

		if (compare(toInsert, p.data) < 0)
			p.left = insert(p.left, toInsert);
		else
			p.right = insert(p.right, toInsert);

		return p;
	}

	public boolean search(E toSearch) {
		return search(root, toSearch);
	}

	private boolean search(Node<E> p, E toSearch) {
		if (p == null)
			return false;
		else if (compare(toSearch, p.data) == 0)
			return true;
		else if (compare(toSearch, p.data) < 0)
			return search(p.left, toSearch);
		else
			return search(p.right, toSearch);
	}

	public void delete(E toDelete) {
		root = delete(root, toDelete);
	}

	private Node<E> delete(Node<E> p, E toDelete) {
		if (p == null)
			throw new RuntimeException("cannot delete.");
		else if (compare(toDelete, p.data) < 0)
			p.left = delete(p.left, toDelete);
		else if (compare(toDelete, p.data) > 0)
			p.right = delete(p.right, toDelete);
		else {
			if (p.left == null)
				return p.right;
			else if (p.right == null)
				return p.left;
			else {

				p.data = retrieveData(p.left);
				p.left = delete(p.left, p.data);
			}
		}
		return p;
	}

	private E retrieveData(Node<E> p) {
		while (p.right != null)
			p = p.right;

		return p.data;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (E data : this)
			sb.append(data.toString());

		return sb.toString();
	}

	public void preOrderTraversal() {
		preOrderHelper(root);
	}

	private void preOrderHelper(Node r) {
		if (r != null) {
			System.out.print(r + " ");
			preOrderHelper(r.left);
			preOrderHelper(r.right);
		}
	}

	public void inOrderTraversal() {
		inOrderHelper(root);
	}

	private void inOrderHelper(Node r) {
		if (r != null) {
			inOrderHelper(r.left);
			System.out.print(r + " ");
			inOrderHelper(r.right);
		}
	}

	public BST<E> clone() {
		BST<E> twin = null;

		if (comparator == null)
			twin = new BST<E>();
		else
			twin = new BST<E>(comparator);

		twin.root = cloneHelper(root);
		return twin;
	}

	private Node<E> cloneHelper(Node<E> p) {
		if (p == null)
			return null;
		else
			return new Node<E>(p.data, cloneHelper(p.left), cloneHelper(p.right));
	}

	public int height() {
		return height(root);
	}

	private int height(Node<E> p) {
		if (p == null)
			return -1;
		else
			return 1 + Math.max(height(p.left), height(p.right));
	}

	public int countLeaves() {
		return countLeaves(root);
	}

	private int countLeaves(Node<E> p) {
		if (p == null)
			return 0;
		else if (p.left == null && p.right == null)
			return 1;
		else
			return countLeaves(p.left) + countLeaves(p.right);
	}

	public void restore(E[] pre, E[] in) {
		root = restore(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node<E> restore(E[] pre, int preL, int preR, E[] in, int inL, int inR) {
		if (preL <= preR) {
			int count = 0;

			while (pre[preL] != in[inL + count])
				count++;

			Node<E> tmp = new Node<E>(pre[preL]);
			tmp.left = restore(pre, preL + 1, preL + count, in, inL, inL + count - 1);
			tmp.right = restore(pre, preL + count + 1, preR, in, inL + count + 1, inR);
			return tmp;
		} else
			return null;
	}

	public int width() {
		int max = 0;
		for (int k = 0; k <= height(); k++) {
			int tmp = width(root, k);
			if (tmp > max)
				max = tmp;
		}
		return max;
	}

	public int width(Node<E> p, int depth) {
		if (p == null)
			return 0;
		else if (depth == 0)
			return 1;
		else
			return width(p.left, depth - 1) + width(p.right, depth - 1);
	}

	public int diameter() {
		return diameter(root);
	}

	private int diameter(Node<E> p) {
		if (p == null)
			return 0;
		int len1 = height(p.left) + height(p.right) + 3;
		int len2 = Math.max(diameter(p.left), diameter(p.right));

		return Math.max(len1, len2);
	}

	public Iterator<E> iterator() {
		return new MyIterator();
	}

	// pre-order
	private class MyIterator implements Iterator<E> {
		Stack<Node<E>> stk = new Stack<Node<E>>();

		public MyIterator() {
			if (root != null)
				stk.push(root);
		}

		public boolean hasNext() {
			return !stk.isEmpty();
		}

		public E next() {
			Node<E> cur = stk.peek();
			if (cur.left != null) {
				stk.push(cur.left);
			} else {
				Node<E> tmp = stk.pop();
				while (tmp.right == null) {
					if (stk.isEmpty())
						return cur.data;
					tmp = stk.pop();
				}
				stk.push(tmp.right);
			}

			return cur.data;
		}

		public void remove() {

		}
	}

	private class Node<T> {
		private T data;
		private Node<T> left, right;

		public Node(T data, Node<T> l, Node<T> r) {
			left = l;
			right = r;
			this.data = data;
		}

		public Node(T data) {
			this(data, null, null);
		}

		public String toString() {
			return data.toString();
		}
	}
}

class MyComp1 implements Comparator<Integer> {
	public int compare(Integer x, Integer y) {
		return y - x;
	}
}