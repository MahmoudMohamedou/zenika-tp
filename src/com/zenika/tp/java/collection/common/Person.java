package com.zenika.tp.java.collection.common;

import java.util.Objects;

public class Person<T extends Person> implements Comparable<T> {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return this.firstName.equals(person.firstName) && this.lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return this.firstName.charAt(0);
    }

    @Override
    public int compareTo(T o) {
        if (this.getFirstName().equals(o.getFirstName()) && this.getLastName().equals(o.getLastName()))
            return 0;

        if (this.getFirstName().equals(o.getFirstName())) this.getLastName().compareTo(o.getLastName());

        return this.getFirstName().compareTo(o.getFirstName());
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
