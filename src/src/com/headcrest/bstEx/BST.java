package com.headcrest.bstEx;

import java.util.ArrayList;
import java.util.List;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
  protected TreeNode<E> root;
  protected int size = 0;

  /** Create a default binary tree */
  public BST() {
  }

  /** Create a binary tree from an array of objects */
  public BST(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      insert(objects[i]);
  }

  protected TreeNode<E> createNewNode(E e) {
    return new TreeNode<>(e);
  }

  @Override /** Insert element o into the binary tree
   * Return true if the element is inserted successfully */
  public boolean insert(E e) {
    //ToDo: 1. Implement this
    size++;
    return true;
  }

  /** Returns a path from the root leading to the specified element */
  public List<TreeNode<E>> path(E e) {
    List<TreeNode<E>> list = new ArrayList<>();

    //ToDo: 2. Implement this

    return list;
  }

  /** Inorder traversal from the root*/
  public void inorder(List<E> returnList){
    //ToDo: 3. Implement this
  }

  @Override /** Returns true if the element is in the tree */
  public boolean search(E e) {
    //ToDo: 4. Implement this
    return false;
  }

  @Override /** Delete an element from the binary tree.
   * Return true if the element is deleted successfully
   * Return false if the element is not in the tree */
  public boolean delete(E e) {
    //ToDo: 5. Implement this
    return true; // Element deleted successfully
  }

  @Override /** Get the number of nodes in the tree */
  public int getSize() {
    return size;
  }

  /** Returns the root of the tree */
  public TreeNode<E> getRoot() {
    return root;
  }

  /** Remove all elements from the tree */
  public void clear() {
    root = null;
    size = 0;
  }

  @Override /** Obtain an iterator. Use inorder. */
  public java.util.Iterator<E> iterator() {
    return new InorderIterator();
  }

  private class InorderIterator implements java.util.Iterator<E> {
    // Store the elements in a list
    private List<E> list =  new ArrayList<>();
    private int current = 0; // Point to the current element in list

    public InorderIterator() {
      inorder();
    }

    /** Inorder traversal from the root*/
    private void inorder() {
      inorder(root);
    }

    /** Inorder traversal from a subtree
     * Traverse binary tree and store elements in list */
    private void inorder(TreeNode<E> root) {
      //ToDo: 6 Implement this
    }

    @Override /** More elements for traversing? */
    public boolean hasNext() {
      if (current < list.size())
        return true;

      return false;
    }

    @Override /** Get the current element and move to the next */
    public E next() {
      return list.get(current++);
    }
  }
}
