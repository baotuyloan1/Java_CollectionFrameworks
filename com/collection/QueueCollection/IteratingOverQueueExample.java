package com.collection.QueueCollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author BAO 6/25/2023
 */
public class IteratingOverQueueExample {
  /**
   * Iterate over a Queue using Java 8 forEach() method.
   *
   * <p>Iterate over a Queue using iterator().
   *
   * <p>Iterate over A Queue using iterator() and Java 8 forEachRemaining() method
   *
   * <p>Iterate over Queue using a simple for-each loop.
   *
   * <p>The iteration order in a Queue is the same as the insertion order
   */
  public static void main(String[] args) {
    Queue<String> elementsQueue = new LinkedList<>();

    elementsQueue.add("element1");
    elementsQueue.add("element2");
    elementsQueue.add("element3");

    System.out.println("=== Iterating over a Queue using Java 8 forEach() ===");
    // java 8 using forEach
    elementsQueue.forEach(
        (element) -> {
          System.out.println(element);
        });

    elementsQueue.forEach(
            (element) -> {
              System.out.println(element);
            });

    System.out.println("\n=== Iterating over a Queue using iterator() ===");
    Iterator<String> elementQueueIterator = elementsQueue.iterator();
    while (elementQueueIterator.hasNext()) {
      String name = elementQueueIterator.next();
      System.out.println(name);
    }
    System.out.println("\n=== Iterating over a Queue using iterator() ===");
    while (elementQueueIterator.hasNext()) {
      String name = elementQueueIterator.next();
      System.out.println(name);
    }

    System.out.println("=====================");
    System.out.println("\n=== Iterating over a Queue using forEachRemaining() ===");
    elementQueueIterator = elementsQueue.iterator();
    elementQueueIterator.forEachRemaining(
        (name) -> {
          System.out.println(name);
        });
    System.out.println("\n=== Iterating over a Queue using forEachRemaining() ===");
    elementQueueIterator.forEachRemaining(name -> System.out.println(name));

    /**
     * iterator chỉ được lặp qua 1 lần , vì forEachRemaining là method của Iterator nên nó chỉ có thể lặp qua 1 lần
     *
     * nhưng forEach nó là method của iterable => nó có thể lặp qua nhiều lần
     */
  }
}
