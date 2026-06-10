package com.zenika.tp.java.collection.tri;

import com.zenika.tp.java.collection.common.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainListTri {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList(List.of(new Person("said", "salem"), new Person("lu", "salem"), new Person("saba", "yahya")));

        System.out.printf("[Comparator] Before sorting: %s\n", personList.toString());
        // Sort list of persons using comparator
        Collections.sort(personList, new PersonComparator());
        System.out.printf("[Comparator] After sorting: %s\n", personList.toString());

        // Sort using Comparable

        List<Person> personList2 = new ArrayList(List.of(new Person("said", "salem"), new Person("amin", "yahya")));


        System.out.printf("[Comparable] Before sorting: %s\n", personList2.toString());
        // Sort list of persons using comparator
        Collections.sort(personList2);
        System.out.printf("[Comparable] After sorting: %s\n", personList2.toString());

        TreeSet<Person> treeSetPerson = new TreeSet<>(new PersonComparator());
        treeSetPerson.addAll(List.of(new Person("Momo", "Yahya"), new Person("Momo", "Yahya"), new Person("Amin", "Yahya")));

        System.out.printf("TreeSet after sorting: %s\n", treeSetPerson.toString());

        // sort and filter
        List<Person> filtredPersons = personList.stream().sorted().filter(e -> e.getFirstName().length() >= 3).collect(Collectors.toList());

        System.out.printf("List person after being sorted an filtred: %s\n", filtredPersons.toString());
    }
}
