package com.collection.listconllection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BAO 6/26/2023
 */
public class CreateArrayListFromCollectionExample {
  public static void main(String[] args) {
    List<Integer> firstFivePrimeNumbers = new ArrayList<>();
    firstFivePrimeNumbers.add(2);
    firstFivePrimeNumbers.add(3);
    firstFivePrimeNumbers.add(5);
    firstFivePrimeNumbers.add(7);
    firstFivePrimeNumbers.add(11);

    List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

    List<Integer> nextFivePrimeNumbers = new ArrayList<>();
    nextFivePrimeNumbers.add(13);
    nextFivePrimeNumbers.add(17);
    nextFivePrimeNumbers.add(19);
    nextFivePrimeNumbers.add(23);
    nextFivePrimeNumbers.add(29);

    // Adding an entire collection to an ArrayList
    firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

    System.out.println(firstTenPrimeNumbers);

    List<String> programmingLanguages = new ArrayList<>();
    programmingLanguages.add("C");
    programmingLanguages.add("C++");
    programmingLanguages.add("Java");
    programmingLanguages.add("Kotlin");
    programmingLanguages.add("Kotlin1");
    programmingLanguages.add("Kotli23");
    // Remove the element at index `5`
    programmingLanguages.remove(5);
    System.out.println("After remove(5): " + programmingLanguages);

    programmingLanguages.add("C");
    programmingLanguages.add("C++");
    programmingLanguages.add("Java");
    programmingLanguages.add("Kotlin");
    boolean isRemoved = programmingLanguages.remove("Kotlin");
    System.out.println(programmingLanguages + "" + isRemoved);

    // Remove all the elements that exist in a given collection
    List<String> scriptingLanguages = new ArrayList<>();
    scriptingLanguages.add("Java");
    scriptingLanguages.add("Kotlin");

    programmingLanguages.removeAll(scriptingLanguages);
    System.out.println(programmingLanguages);

    programmingLanguages.removeIf(s -> s.startsWith("C"));

    programmingLanguages.clear();
    System.out.println(programmingLanguages);
  }
}
