package com.zenika.tp.java.collection.tri;

import com.zenika.tp.java.collection.common.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getFirstName().equals(o2.getFirstName()) && o1.getLastName().equals(o2.getLastName()))
            return 0;

        if (o1.getFirstName().equals(o2.getFirstName())) o1.getLastName().compareTo(o2.getLastName());

        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
