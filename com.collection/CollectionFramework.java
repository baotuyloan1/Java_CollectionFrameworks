package com.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author BAO 6/25/2023
 */
public class CollectionFramework {
  public static void main(String[] args) {
    Collection<String> fruitCollection = new ArrayList<>();
    fruitCollection.add("Banana");
    fruitCollection.add("Apple");
    fruitCollection.add("Mango");
    System.out.println(fruitCollection);
    fruitCollection.remove("Banana");
    System.out.println(fruitCollection);
    System.out.println(fruitCollection.contains("apple"));

    fruitCollection.forEach(
        (element) -> {
          System.out.println(element);
        });

    fruitCollection.clear();
    System.out.println(fruitCollection);
  }
}
