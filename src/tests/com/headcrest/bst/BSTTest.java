package com.headcrest.bst;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BSTTest {

    @Test
    public void inorder_TreeWithNumbers_GetsSortedNumbers(){
        List<Integer> sortedList = new ArrayList<>();

        BST<Integer> tree = new BST<>();
        tree.insert(2);
        tree.insert(4);
        tree.insert(3);
        tree.insert(1);
        tree.insert(8);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);

        tree.inorder(sortedList);

        assertArrayEquals(new Integer[]{1,2,3,4,5,6,7,8}, sortedList.toArray());
    }
}