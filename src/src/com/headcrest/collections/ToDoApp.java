package com.headcrest.collections;

import java.util.*;
import java.util.function.Predicate;

public class ToDoApp {

    private List<ToDoItem> items;

    public ToDoApp() {
        this.items = new LinkedList<>();
    }

    public void addItem(ToDoItem toDoItem) {
        this.items.add(toDoItem);
    }

    public int getNumberOfItems() {
        return items.size();
    }

    public void removeItem(ToDoItem toDoItem) {
        items.remove(toDoItem);
    }

    public void addItems(List<ToDoItem> existing) {
        items.addAll(existing);
    }

    public void removeItemTitled(String title) {
        //This is not possible. changes an collection while iterating...
//        for (ToDoItem item : items) {
//            if (item.getTitle().equals(title))
//                items.remove(item);
//        }

        //items.removeIf(toDoItem -> toDoItem.getTitle().equals(title));

        items.removeIf(new Predicate<ToDoItem>() {
            @Override
            public boolean test(ToDoItem toDoItem) {
                return toDoItem.getTitle().equals(title);
            }
        });
    }

    public List<String> getAllItemTitles() {
        List<String> allItemTitles = new ArrayList<>();
        for (ToDoItem item : items) {
            allItemTitles.add(item.getTitle());
        }

        return allItemTitles;
    }

    public List<ToDoItem> getItemsSortedOnPriority(String order) throws IllegalArgumentException {
        Collections.sort(items, (o1, o2) -> {
            if (o1.getPriority() > o2.getPriority())
                return 1;
            else if (o1.getPriority() == o2.getPriority())
                return 0;
            else
                return -1;
        });

        if(order.equals("desc")) {
            Collections.reverse(items);
            return items;
        }
        else if(order.equals("asc"))
            return items;
        else
            throw new IllegalArgumentException("Method must be called with argument \"asc\" or \"desc\" ");

    }
}
