package com.zenika.tp.java.collection.tri;

import com.zenika.tp.java.collection.common.Person;

import java.util.Comparator;

public class PersonComparator<T extends Person> implements Comparator<T> {
    public int compare(T o1, T o2) {
        if (o1.getFirstName().equals(o2.getFirstName()) && o1.getLastName().equals(o2.getLastName()))
            return 0;

        if (o1.getFirstName().equals(o2.getFirstName())) o1.getLastName().compareTo(o2.getLastName());

        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
