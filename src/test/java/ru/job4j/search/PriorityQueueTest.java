package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

    @Test
    public void whenLastIsHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("A", 2));
        queue.put(new Task("B", 3));
        queue.put(new Task("C", 1));
        Task result = queue.take();
        assertThat(result.getDesc(), is("C"));
    }

    @Test
    public void whenPriorityIsDifferent() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("E", 5));
        queue.put(new Task("C", 3));
        queue.put(new Task("B", 2));
        queue.put(new Task("A", 1));
        queue.put(new Task("F", 6));
        queue.put(new Task("D", 4));
        Task result = queue.take();
        assertThat(result.getDesc(), is("A"));
    }

    @Test
    public void whenPrioritiesEqual() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("A", 2));
        queue.put(new Task("B", 2));
        queue.put(new Task("C", 2));
        Task result = queue.take();
        assertThat(result.getDesc(), is("C"));
    }
}