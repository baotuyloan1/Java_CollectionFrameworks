package com.collection.dequeExample;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author BAO 6/25/2023
 */
public class ArrayDequeExample {
  public static void main(String[] args) {
    Deque<String> deque = new ArrayDeque<>();
    deque.add("element1");
    deque.add("element2");
    deque.add("element3");

    deque.offer("element4");
    System.out.println("After offerFirst Traversal...");
    for (String str : deque) {
      System.out.println(str);
    }

    System.out.println("After pool and pollFirst");
    deque.poll();
    deque.pollFirst(); // it is same as poll();
    for (String str : deque) {
      System.out.println(str);
    }

    deque.pollLast();
    System.out.println("After poolLast");
    for (String str : deque) {
      System.out.println(str);
    }
  }
}
