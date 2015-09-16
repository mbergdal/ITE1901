package com.headcrest.collections;

import java.util.*;

public class ToDoApp {

    private Map<String, ToDoItem> items;

    public ToDoApp() {
        this.items = new HashMap<>();
    }

    public void addItem(ToDoItem toDoItem) {
        this.items.put(toDoItem.getTitle(), toDoItem);
    }

    public int getNumberOfItems() {
        return items.size();
    }

    public void removeItem(ToDoItem toDoItem) {
        items.remove(toDoItem.getTitle());
    }

    public void addItems(Map<String, ToDoItem> existing) {
        items.putAll(existing);
    }

    public void removeItemTitled(String title) {
        items.remove(title);
    }

    public List<String> getAllItemTitles() {
        return new ArrayList(items.keySet());
    }

    public List<ToDoItem> getItemsSortedOnPriority(String order) throws IllegalArgumentException {
        List<ToDoItem> values = new ArrayList<>(items.values());
        Collections.sort(values, (o1, o2) -> {
            if (o1.getPriority() > o2.getPriority())
                return 1;
            else if (o1.getPriority() == o2.getPriority())
                return 0;
            else
                return -1;
        });

        if(order.equals("desc")) {
            Collections.reverse(values);
            return values;
        }
        else if(order.equals("asc"))
            return values;
        else
            throw new IllegalArgumentException("Method must be called with argument \"asc\" or \"desc\" ");

    }
}
