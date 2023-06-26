package com.notCollection.mapExample;

/**
 * @author BAO 6/26/2023
 */
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * A SortedMap is a Map that maintains its entries in ascending order, sorted according to the keys
 * natural ordering, or according to a Comparator provided at the time of the SortedMap creation.
 *
 * <p>The SortedMap interface provides operations for normal Map operations and for the following:
 * Range view — performs arbitrary range operations on the sorted map Endpoints — returns the first
 * or the last key in the sorted map Comparator access — returns the Comparator, if any, used to
 * sort the map The following interface is the Map analog of SortedSet.
 *
 * <p>firstKey()
 *
 * <p>lastKey()
 *
 * <p>tailMap(String fromKey)
 *
 * <p>.headMap(String toKey)
 */
public class SortedMapExample {
  public static void main(String[] args) {
    SortedMap<String, String> fileExtensions = new TreeMap<>();
    // Adding new key-value pairs to a TreeMap
    fileExtensions.put("python", ".py");
    fileExtensions.put("c++", ".cpp");
    fileExtensions.put("kotlin", ".kt");
    fileExtensions.put("golang", ".go");
    fileExtensions.put("java", ".java");

    // Printing the TreeMap (Output will be sorted based on keys)
    System.out.println(fileExtensions);

    System.out.println("First key: " + fileExtensions.firstKey());
    System.out.println("Last key: " + fileExtensions.lastKey());

    SortedMap<String, String> sortedMap = fileExtensions.tailMap("java");
    System.out.println(sortedMap);

    sortedMap = fileExtensions.headMap("java");
    System.out.println("head map: " + sortedMap);
  }
}
