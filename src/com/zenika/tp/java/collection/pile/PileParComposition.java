package com.zenika.tp.java.collection.pile;

import java.util.LinkedList;

public class PileParComposition implements Pile {
    private final LinkedList linkedList = new LinkedList();

    @Override
    public Object depiler() {
        Object result = this.linkedList.removeLast();
        System.out.println("[Composition] Depile: " + result);
        return result;
    }

    @Override
    public void empiler(Object element) {
        System.out.println("[Composition] Empile: " + element);
        this.linkedList.addLast(element);
    }

    @Override
    public boolean estVide() {
        return this.linkedList.isEmpty();
    }
}
