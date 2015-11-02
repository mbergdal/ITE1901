package com.headcrest.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTests {

    @Test
    public void insertionSort(){
        int[] unsorted = {2,4,5,6,1,3,7,8};
        InsertionSort.insertionSort(unsorted);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, unsorted);

    }

    @Test
    public void selectionSort(){
        int[] unsorted = {2,4,5,6,1,3,7,8};
        SelectionSort.selectionSort(unsorted);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, unsorted);
    }

    @Test
    public void bubbleSort(){
        int[] unsorted = {2,4,5,6,1,3,7,8};
        BubbleSort.bubbleSort(unsorted);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, unsorted);
    }

    @Test
    public void mergeSort(){
        int[] unsorted = {2,4,5,6,1,3,7,8};
        MergeSort.mergeSort(unsorted);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, unsorted);
    }

    @Test
    public void quickSort(){
        int[] unsorted = {2,4,5,6,1,3,7,8};
        QuickSort.quickSort(unsorted);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, unsorted);
    }

    @Test
    public void heapSort(){
        Integer[] unsorted = {2,4,5,6,1,3,7,8};
        HeapSort.heapSort(unsorted);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8}, unsorted);
    }
}