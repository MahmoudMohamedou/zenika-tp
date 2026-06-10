package com.zenika.tp.java.collection.list;

import com.zenika.tp.java.collection.common.Person;

import java.util.*;

public class MainList {
    public static void main(String[] args) {
        Person person1 = new Person("Momo", "arfa");
        Person person2 = new Person("teddy", "robert");
        Person person3 = new Person("jim", "romain");

        //new ArrayList<Person>(List.of(person1, person2, person3));
        List<Person> list = new ArrayList(List.of(person1, person2, person3));
        HashSet<Person> personSet = new HashSet();
        System.out.println("list person: " + list.toString());

        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println("Person: " + person);
        }

        // clear previous to see clearly repeated persons
        list.clear();

        list.add(person1);
        list.add(person1);

        // Verify that HashSet handle same repeated instance

        personSet.addAll(List.of(person1, person1));
        // personSet must have unique element
        System.out.println("setperson size: " + personSet.size());

        // personSet still not handle equality in attributes level
        personSet.clear();
        personSet.addAll(List.of(new Person("test", "test"), new Person("test", "test")));
        // personSet will be 2
        System.out.println("setperson with repeated values in attribute level has size: " + personSet.size());

        System.out.println("list person with repeated objects: " + list.toString());
    }
}
