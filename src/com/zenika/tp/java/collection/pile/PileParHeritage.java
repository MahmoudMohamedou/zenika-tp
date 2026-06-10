package com.zenika.tp.java.collection.pile;

import java.util.LinkedList;

public class PileParHeritage extends LinkedList implements Pile {
    @Override
    public Object depiler() {
        Object element = super.removeLast();

        System.out.println("[Inheritance] Depile: " + element);

        return element;
    }

    @Override
    public void empiler(Object element) {
        System.out.println("[Inheritance] Empile: " + element);
        super.addLast(element);
    }

    @Override
    public boolean estVide() {
        return super.isEmpty();
    }
}
