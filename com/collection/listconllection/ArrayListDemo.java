package com.collection.listconllection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BAO 6/25/2023
 */
public class ArrayListDemo {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    // List allows you to add duplicate elements
    list.add("element1");
    list.add("element1");
    list.add("element2");
    list.add("element2");
    System.out.println(list);

    // List allows you to have ‘null’ elements.
    list.add(null);
    list.add(null);
    System.out.println(list);

    // insertion order
    list.add("element1"); // 0
    list.add("element2"); // 1
    list.add("element4"); // 2
    list.add("element3"); // 3
    list.add("element5"); // 4

    System.out.println(list);

    // access elements from list

    System.out.println(list.get(0));
    System.out.println(list.get(4));
    System.out.println(list.get(5));
    List<Integer> a = new ArrayList<>(10);
    a.add(1);
    a.add(3);
    System.out.println(a.get(1));
  }
}
