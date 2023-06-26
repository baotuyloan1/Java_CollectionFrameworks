package com.collection.listconllection;

import java.util.*;

/**
 * @author BAO 6/25/2023
 */

/**
 * Java LinkedList class can contain duplicate elements.
 *
 * <p>Java LinkedList class maintains insertion order.
 *
 * <p>In Java LinkedList class, manipulation is fast because no shifting needs to have occurred.
 *
 * <p>The LinkedList class implements Queue and Deque interfaces.
 *
 * <p>Therefore, It can also be used as a Queue, Deque or Stack.
 *
 * <p>Java LinkedList is not thread-safe. You must explicitly synchronize concurrent modifications
 * to the LinkedList in a multi-threaded environment.
 */
public class LinkedListDemo {
  public static void main(String[] args) {
    //    demo();

    iterateOverLinkedListExample();
  }

  private static void demo() {
    // Creating a LinkedList
    LinkedList<String> fruits = new LinkedList<>();

    // Adding new elements to the end of the LinkedList using add() method.
    fruits.add("Banana");
    fruits.add("Apple");
    fruits.add("mango");

    System.out.println("Initial LinkedList : " + fruits);

    // Adding an element at the specified position in the LinkedList
    fruits.add(2, "Watermelon");

    System.out.println("After add(2, \"D\") : " + fruits);

    // Adding an element at the beginning of the LinkedList
    fruits.addFirst("Strawberry");
    System.out.println("After addFirst(\"Strawberry\") : " + fruits);

    // Adding an element at the end of the LinkedList
    // (This method is equivalent to the add() method)
    fruits.addLast("Orange");
    System.out.println("After addLast(\"F\") : " + fruits);

    // Adding all the elements from an existing collection to
    // the end of the LinkedList
    List<String> moreFruits = new ArrayList<>();
    moreFruits.add("Grapes");
    moreFruits.add("Pyrus");

    fruits.addAll(moreFruits);
    System.out.println("After addAll(moreFruits) : " + fruits);

    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("A");
    linkedList.add("B");
    linkedList.add("C");
    linkedList.add(3, "L");
    linkedList.addLast("J");
    System.out.println("After addLast(\"F\") : " + linkedList);

    List<String> secondList = new ArrayList<>();
    secondList.add("Jesse");
    secondList.add("Walt");
    linkedList.addAll(secondList);
    System.out.println("After addAll(secondList) : " + linkedList);

    LinkedList<String> fruitList = new LinkedList<>();

    fruitList.add("Apple");
    fruitList.add("banana");
    fruitList.add("mango");
    fruitList.add("Pinaple");

    System.out.println("Initial LinkedList = " + fruitList);

    String element = fruitList.removeFirst();
    System.out.println("Removed the first element " + element + " => " + fruitList);

    element = fruitList.removeLast();
    System.out.println("Removed the last element " + element + " => " + fruitList);

    boolean isRemoved = fruitList.remove("banana");
    if (isRemoved) {
      System.out.println("Removed banana => " + fruitList);
    }

    fruitList.add("Apple");
    fruitList.add("banana");
    fruitList.add("mango");
    fruitList.add("Pinaple");
    System.out.println(fruitList);
    fruitList.removeIf(programmingLanguage -> programmingLanguage.startsWith("A"));
    System.out.println("Removed elements starting with A => " + fruitList);

    fruitList.clear();
    System.out.println("Cleared the LinkedList => " + fruitList);

    LinkedList<Double> stockPrices = new LinkedList<>();

    stockPrices.add(45.00);
    stockPrices.add(51.00);
    stockPrices.add(62.50);
    stockPrices.add(42.75);
    stockPrices.add(36.80);
    stockPrices.add(68.40);
    Double firstElement = stockPrices.getFirst();
    System.out.println("Initial Stock Price : " + firstElement);

    Double lastElement = stockPrices.getLast();
    System.out.println("Current Stock Price : " + lastElement);

    Double stockPriceOn3rdDay = stockPrices.get(2);
    System.out.println("Stock Price on 3rd Day : " + stockPriceOn3rdDay);

    LinkedList<String> employees = new LinkedList<>();

    employees.add("John");
    employees.add("David");
    employees.add("Lara");
    employees.add("Chris");
    employees.add("Steve");
    employees.add("David");

    System.out.println(
        "Does Employees LinkedList contain \"Lara\"? : " + employees.contains("Lara"));

    System.out.println("indexOf \"Steve\" : " + employees.indexOf("Steve"));
    System.out.println("indexOf \"Mark\" : " + employees.indexOf("Mark"));

    System.out.println("lastIndexOf \"David\" : " + employees.lastIndexOf("David"));
    System.out.println("lastIndexOf \"Bob\" : " + employees.lastIndexOf("Bob"));
  }

  public static void iterateOverLinkedListExample() {
    LinkedList<String> progLangs = new LinkedList<>();

    progLangs.add("C");
    progLangs.add("C++");
    progLangs.add("Core Java");
    progLangs.add("Java EE");
    progLangs.add("Spring Framework");
    progLangs.add("Hibernate Framework");

    System.out.println("=== Iterate over a LinkedList using Java 8 forEach and lambda ===");
    progLangs.forEach(name -> System.out.println(name));

    System.out.println("\n=== Iterate over a LinkedList using iterator() ===");
    Iterator<String> iterator = progLangs.iterator();
    while (iterator.hasNext()) {
      String speciesName = iterator.next();
      System.out.println(speciesName);
    }

    System.out.println(
        "\n=== Iterate over a LinkedList using iterator() and Java 8 forEachRemaining() method ===");
    iterator = progLangs.iterator();
    iterator.forEachRemaining(speciesName -> System.out.println(speciesName));

    System.out.println("\n=== Iterate over a LinkedList using descendingIterator() ===");
    Iterator < String > descendingIterator = progLangs.descendingIterator();
    while (descendingIterator.hasNext()) {
      String speciesName = descendingIterator.next();
      System.out.println(speciesName);
    }



    System.out.println("\n=== Iterate over a LinkedList using listIterator() ===");
    // ListIterator can be used to iterate over the LinkedList in both forward and backward directions
    // In this example, we start from the end of the list and traverse backwards
    ListIterator< String > listIterator = progLangs.listIterator(progLangs.size());
    while (listIterator.hasPrevious()) {
      String speciesName = listIterator.previous();
      System.out.println(speciesName);
    }

    System.out.println("\n=== Iterate over a LinkedList using simple for-each loop ===");
    for (String name: progLangs) {
      System.out.println(name);
    }

  }
}
