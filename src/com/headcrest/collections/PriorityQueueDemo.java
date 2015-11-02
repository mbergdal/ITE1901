package com.headcrest.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        //PriorityQueue<String> queue = new PriorityQueue<>(Comparator.<String>reverseOrder());

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");

        while (queue.size() > 0){
            System.out.println(queue.poll());
        }
    }
}
