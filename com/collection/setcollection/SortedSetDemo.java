package com.collection.setcollection;
/**
 * @author BAO 6/25/2023
 */
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * A SortedSet is a Set that maintains its elements in ascending order, sorted according to the
 * natural ordering or according to a Comparator provided at SortedSet creation time.
 *
 * <p>In addition to the normal Set operations, the SortedSet interface provides operations for the
 * following:
 *
 * <p>Range view — allows arbitrary range operations on the sorted set
 *
 * <p>SortedSet<E> subSet(E fromElement, E toElement); SortedSet<E> headSet(E toElement);
 * SortedSet<E> tailSet(E fromElement);
 *
 * <p>Endpoints — returns the first or last element in the sorted set
 *
 * <p>E first(); E last();
 *
 * <p>Comparator access — returns the Comparator, if any, used to sort the set
 *
 * <p>// Comparator access Comparator<? super E> comparator();
 */
public class SortedSetDemo {
  public static void main(String[] args) {

    SortedSet<String> fruits = new TreeSet<>();
    fruits.add("Banana");
    fruits.add("Apple");
    fruits.add("Pineapple");


//    Endpoints

    // Returns the first (lowest) element currently in this set.
    String first = fruits.first();
    System.out.println(first);

    // Returns the last (highest) element currently in this set.
    String last = fruits.last();
    System.out.println(last);

    // Returns the comparator used to order the elements in this set, or
    // null if this set uses the natural ordering of its elements.

    Comparator<?> comparator = fruits.comparator();

    System.out.println(comparator);


    SortedSet<String> tailSet = fruits.tailSet("Banana");
    System.out.println("tailSet :" + tailSet);
  }
}
