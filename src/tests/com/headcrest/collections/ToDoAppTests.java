package com.headcrest.collections;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ToDoAppTests {

    private ToDoApp app;
    
    @Before
    public void setUp() throws Exception {
        app = new ToDoApp();
    }

    @Test
    public void addItem_addOneItem_AppContainsOneItem(){
        app.addItem(new ToDoItem());
        assertEquals(1, app.getNumberOfItems());
    }

    @Test
    public void removeItem_OneItemInListRemoveOne_AppContainsZeroItems(){
        ToDoItem toDoItem = new ToDoItem();
        app.addItem(toDoItem);
        app.removeItem(toDoItem);
        assertEquals(0, app.getNumberOfItems());
    }

    @Test
    public void addItems_AddmultipleItemsInOneGo_AssertCorrectNumberOfItems(){
        int n = 100000;
        List<ToDoItem> existing = new ArrayList<>();

        for (int i=0; i < n; i++){
            existing.add(new ToDoItem());
        }

        app.addItems(existing);

        assertEquals(n, app.getNumberOfItems());
    }

    @Test
    public void removeItemTitled_RemoveAnItemWithAGivenTitle_RemovesTheCorrectItem(){
        int n = 3;
        List<ToDoItem> existing = new ArrayList<>();

        for (int i=0; i < n; i++){
            existing.add(new ToDoItem(Integer.toString(i+1)));
        }

        app.addItems(existing);

        app.removeItemTitled("1");

        List<String> allItemTitles = app.getAllItemTitles();
        boolean contains = allItemTitles.contains("1");
        assertFalse(contains);
        assertEquals(n-1, app.getNumberOfItems());
    }

    @Test
    public void getItemsSortedOnPriority_getsItemsSortedAscending_CorrectlySorted() throws InvalidArgumentException {
        int n = 3;
        List<ToDoItem> existing = new ArrayList<>();

        for (int i=0; i < n; i++){
            existing.add(new ToDoItem(Integer.toString(i+1), i));
        }

        app.addItems(existing);
        List<ToDoItem> ascendingItems = app.getItemsSortedOnPriority("asc");
        assertEquals(0, ascendingItems.get(0).getPriority());
    }

    @Test
    public void getItemsSortedOnPriority_getsItemsSortedDescending_CorrectlySorted() {
        int n = 3;
        List<ToDoItem> existing = new ArrayList<>();

        for (int i=0; i < n; i++){
            existing.add(new ToDoItem(Integer.toString(i+1), i));
        }

        app.addItems(existing);
        List<ToDoItem> ascendingItems = app.getItemsSortedOnPriority("desc");
        assertEquals(2, ascendingItems.get(0).getPriority());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getItemsSortedOnPriority_CalledWithWrongArgument_throwsException() {
        app.getItemsSortedOnPriority("foo");
    }
}