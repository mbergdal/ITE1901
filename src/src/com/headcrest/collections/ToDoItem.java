package com.headcrest.collections;

import java.util.UUID;

public class ToDoItem {

    private String title;
    private int priority;

    public ToDoItem() {
    }

    public ToDoItem(String title) {
        this.title = title;
    }

    public ToDoItem(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }
}
