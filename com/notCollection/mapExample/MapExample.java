package com.notCollection.mapExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author BAO 6/25/2023
 */
public class MapExample {
  /**
   * Map interface is a part of Java Collection Framework, but it doesn’t inherit Collection
   * Interface.
   *
   * <p>A Map cannot contain duplicate keys: Each key can map to at most one value. It models the
   * mathematical function abstraction.
   *
   * <p>Each key at most must be associated with one value.
   *
   * <p>Each key-value pairs of the map are stored as Map.Entry objects. Map.Entry is an inner
   * interface of Map interface
   *
   * <p>The Java platform contains three general-purpose Map interface implementations: HashMap,
   * TreeMap, and LinkedHashMap.
   *
   * <p>Order of elements in a map is implementation dependent. HashMap doesn’t maintain any order
   * of elements. LinkedHashMap maintains insertion order of elements. Where as TreeMap places the
   * elements according to the supplied Comparator.
   *
   * <p>The Map interface provides three methods, which allows map’s contents to be viewed as a set
   * of keys (keySet() method), a collection of values (values() method), or set of key-value
   * mappings (entrySet() method).
   */
  public static void main(String[] args) {
    Map<String, Integer> numberMapping = new HashMap<>();

    // Adding key-value pairs to a HashMap
    numberMapping.put("One", 1);
    numberMapping.put("Two", 2);
    numberMapping.put("Three", 3);

    // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to
    // `null`
    numberMapping.putIfAbsent("Four", 4);
    System.out.println(numberMapping);

    createLinkedHashMap();

    createTreeMap();
  }

  public static void createLinkedHashMap() {
    // Creating a LinkedHashMap
    LinkedHashMap<String, Integer> dayNumberMapping = new LinkedHashMap<>();

    // Adding new key-value pairs to the LinkedHashMap
    dayNumberMapping.put("Mon", 1);
    dayNumberMapping.put("Tus", 2);
    dayNumberMapping.put("Wen", 3);
    dayNumberMapping.put("Thu", 4);
    dayNumberMapping.put("Fri", 5);
    dayNumberMapping.put("Sat", 6);

    // Add a new key-value pair only if the key does not exist
    // in the LinkedHashMap, or is mapped to `null`
    dayNumberMapping.putIfAbsent("Sun", 7);

    System.out.println(dayNumberMapping);
  }

  public static void createTreeMap() {
    // Creating a TreeMap
    TreeMap<String, String> fileExtensions = new TreeMap<>();

    // Adding new key-value pairs to a TreeMap
    fileExtensions.put("python", ".py");
    fileExtensions.put("c++", ".cpp");
    fileExtensions.put("kotlin", ".kt");
    fileExtensions.put("golang", ".go");
    fileExtensions.put("java", ".java");

    // Printing the TreeMap (Output will be sorted based on keys)
    System.out.println(fileExtensions);
  }
}
