package com.zenika.tp.java.visibilite.package2;

import com.zenika.tp.java.visibilite.package1.ClassA;

public class ClassC extends ClassA {
    public void test() {
        new ClassA();
        // protected attributes are visible in subclasses
        new ClassC();
    }
}
