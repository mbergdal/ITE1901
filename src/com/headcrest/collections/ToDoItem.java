package com.headcrest.collections;

import java.util.UUID;

public class ToDoItem {

    private String title;
    private int priority;
    private UUID id;

    public ToDoItem() {
        this.id = UUID.randomUUID();
    }

    public ToDoItem(String title) {
        this();
        this.title = title;
    }

    public ToDoItem(String title, int priority) {
        this();
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
