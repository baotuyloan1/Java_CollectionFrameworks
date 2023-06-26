package com.collection.listconllection;

import java.util.*;

/**
 * @author BAO 6/25/2023
 */

/**
 * Difference Between ArrayList and
 *
 * <p>ArrayList sử dụng mảng động để lưu trữ các phần tử. LinkedList uses the doubly linked list to
 * store the elements.
 *
 * <p>Manipulation(thao tác) with ArrayList is slow because it uses an array. If any element is
 * removed from the array, all the bits are shifted in the memory. Manipulation with LinkedList is
 * faster than ArrayList because it uses a doubly linked list so no bit shifting is required in
 * memory.
 *
 * <p>ArrayList class can act as a list only becaust it implements List only. LinkedList class can
 * act as a list and queue both because it implements List and Deque interfaces.
 *
 * <p>ArrayList is better for saccessing data. LinkedList is better for manipulating data.
 */

/**
 * Java ArrayList class uses a dynamic array for storing the elements. It inherits AbstractList
 * class and implements List interface.
 *
 * <p>Java ArrayList class can contain duplicate elements.
 *
 * <p>Java ArrayList class maintains insertion order.
 *
 * <p>Java ArrayList class is non-synchronized.
 *
 * <p>Java ArrayList allows random access because array works at the index basis.
 *
 * <p>In Java ArrayList class, manipilation(thao tác) is slow because a lot of shifting needs to
 * have occurred if any element is removed from the array list.
 *
 * <p>List can contain duplicates and null values
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

    nullValueDemo();
    duplicateValueDemo();
    positionalAccess();

    searchListDemo();

    rangeViewDemo();

    iterateDemo();

    listIterateDemo();
  }

  private static void nullValueDemo() {
    List<String> list = new ArrayList<>();
    list.add(null);
    list.add(null);
    System.out.println(list.toString());
  }

  private static void duplicateValueDemo() {

    List<String> list = new ArrayList<>();

    list.add("duplicate");

    list.add("duplicate");

    System.out.println(list.toString());
  }

  private static void positionalAccess() {
    List<String> list = new LinkedList<>();
    list.add("element 1");
    list.add("element 2");
    list.add("element 3");
    list.add("element 4");

    // Replaces the element at the specified position in this list with
    // the specified element (optional operation).
    list.set(3, "element 5");
    list.forEach(item -> System.out.println(item));

    System.out.println("=========");
    // Inserts the specified element at the specified position in this list
    // (optional operation).
    // Shifts the element currently at that position (if any) and any
    // subsequent
    // elements to the right (adds one to their indices).
    list.add(3, "add index");
    list.forEach(item -> System.out.println(item));

    // Returns the element at the specified position in this list.
    System.out.println(list.get(0));

    // Removes the element at the specified position in this list (optional
    // operation).
    // Shifts any subsequent elements to the left (subtracts one from their
    // indices).//
    // Returns the element that was removed from the list.
    System.out.println("=========");
    list.remove("add index");
    list.remove(1);
    list.forEach(item -> System.out.println(item));
  }

  private static void searchListDemo() {
    List<String> searchList = new ArrayList();
    searchList.add("element 1");
    searchList.add("element 2");
    searchList.add("element 3");
    searchList.add("element 4");
    searchList.add("element 3");
    // Returns the index of the first occurrence of the specified element in
    // this list,
    // or -1 if this list does not contain the element.
    int index = searchList.indexOf("element 2");
    System.out.println(" search element at index 0 --->" + index);

    // Returns the index of the last occurrence of the specified element in
    // this list,
    // or -1 if this list does not contain the element
    int lastIndex = searchList.lastIndexOf("element 3");
    System.out.println(" search element at lastIndex 0 --->" + lastIndex);

    bulkOperationDemo();
  }

  private static void rangeViewDemo() {
    System.out.println("==============");
    List<String> list = new LinkedList<>();
    list.add("element 1");
    list.add("element 2");
    list.add("element 3");
    list.add("element 4");

    // If fromIndex and toIndex are equal, the returned list is empty.)
    for (String str : list.subList(0, 0)) {
      System.out.println(" sub list demo --" + str);
    }

    for (String str : list.subList(0, 4)) {
      System.out.println(" sub list demo --" + str);
    }
  }

  private static void bulkOperationDemo() {
    List<String> list = new ArrayList<>();
    list.add("element 1");
    list.add("element 2");
    list.add("element 3");
    list.add("element 4");

    List<String> union = new ArrayList<>();
    union.addAll(list);
    printMessage(union, "AddAll operation example");

    // Retains only the elements in this list that are contained in
    // the specified collection (optional operation).
    List<String> intersection = new ArrayList<>();
    intersection.add("element 1");
    intersection.add("element 2");
    intersection.add("element 3");
    intersection.add("element 4");
    System.out.println("retainAll --> " + intersection.retainAll(list));

    // Removes from this list all of its elements that are
    // contained in the specified collection (optional operation).
    List<String> difference = new ArrayList<>();
    difference.add("element 1");
    difference.add("element 2");
    difference.add("element 3");
    difference.add("element 4");
    System.out.println("removeAll operation example ---> " + difference.removeAll(list));
    printMessage(difference, "removeAll operation example ");

    List<String> checking = new ArrayList<>();
    checking.add("element 1");
    checking.add("element 2");
    checking.add("element 3");
    checking.add("element 4");
    checking.add("element 5");
    System.out.println("constainsAll operation example ---->" + checking.containsAll(list));
  }

  private static void printMessage(List<String> list, String message) {
    list.forEach(item -> System.out.println(message + item));
  }

  private static void iterateDemo() {
    List<String> list = new LinkedList<>();
    list.add("element 1");
    list.add("element 2");
    list.add("element 3");
    list.add("element 4");

    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      String str = iterator.next();
      System.out.println(" only forwad direction ---" + str);
    }

    // Using advanced for loop
    for (String str : list) {
      System.out.println(" only forward direction ---" + str);
    }

    list.forEach(str -> System.out.println(" only forward direction ---" + str));
  }

  private static void listIterateDemo() {

    System.out.println("================");
    List<String> list = new LinkedList<>();
    list.add("element 1");
    list.add("element 2");
    list.add("element 3");
    list.add("element 4");
    ListIterator<String> iterator = list.listIterator();
    while (iterator.hasNext()) {
      String str = iterator.next();
      System.out.println("forward direction ---" + str);
    }

    while (iterator.hasPrevious()) {
      String str = iterator.previous();
      System.out.println("backward direction---" + str);
    }

    for (ListIterator<String> it = list.listIterator(list.size()); it.hasPrevious(); ) {
      String string = it.previous();
      System.out.println(string);
    }
  }
}
