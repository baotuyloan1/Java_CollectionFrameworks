package com.collection.setcollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author BAO 6/25/2023
 */

/**
 * HashSet, which stores its elements in a hash table, is the best-performing implementation;
 * however, it makes no guarantees concerning the order of iteration.
 *
 * <p>TreeSet, which stores its elements in a red-black tree, orders its elements based on their
 * values; it is substantially slower than HashSet.
 *
 * <p>LinkedHashSet, which is implemented as a hash table with a linked list running through it,
 * orders its elements based on the order in which they were inserted into the set
 * (insertion-order).
 */
public class SetCollection {
  public static void main(String[] args) {

    //    hashSetDemo();

    //    linkedHashSet();

    treeSetDemo();
  }

  private static void treeSetDemo() {
    // Creating a TreeSet
    TreeSet<String> fruits = new TreeSet<>();

    // Adding new elements to a TreeSet
    fruits.add("Banana");
    fruits.add("Apple");
    fruits.add("Pineapple");
    fruits.add("Orange");

    System.out.println("Fruits Set : " + fruits);

    // Duplicate elements are ignored
    fruits.add("Apple");
    System.out.println("After adding duplicate element \"Apple\" : " + fruits);

    // This will be allowed because it's in lowercase.
    fruits.add("banana");
    System.out.println("After adding \"banana\" : " + fruits);
  }

  private static void linkedHashSet() {
    LinkedHashSet<String> daysOfWeek = new LinkedHashSet<>();

    // Adding new elements to the HashSet
    daysOfWeek.add("Monday");
    daysOfWeek.add("Tuesday");
    daysOfWeek.add("Wednesday");
    daysOfWeek.add("Thursday");
    daysOfWeek.add("Friday");
    daysOfWeek.add("Saturday");
    daysOfWeek.add("Sunday");

    // Adding duplicate elements will be ignored
    daysOfWeek.add("Monday");

    System.out.println(daysOfWeek);
  }

  private static void hashSetDemo() {
    Set<String> dayOfWeek = new HashSet<>();
    dayOfWeek.add("Monday");
    dayOfWeek.add("Tuesday");
    dayOfWeek.add("Wednesday");

    // Adding duplicate elements will be ignored
    dayOfWeek.add("Monday");
    System.out.println(dayOfWeek);
  }
}
