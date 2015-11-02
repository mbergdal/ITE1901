package com.headcrest.bstEx;

public abstract class AbstractTree<E extends Comparable<E>> implements Tree<E> {


  @Override /** Return true if the tree is empty */
  public boolean isEmpty() {
    return getSize() == 0;
  }
}
