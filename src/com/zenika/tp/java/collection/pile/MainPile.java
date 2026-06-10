package com.zenika.tp.java.collection.pile;

/**
 * The both implementations are correct,
 * however Composition seems to fit more.
 * the POS are that we have the possibility to attach it to an object
 * and change it at runtime which is impossible with the implementation
 * by inheritance. the downside is that we need to initialize it by an object
 * to avoid NullPointerException
 *
 */
public class MainPile {
    public static void main(String[] args) {
        // Pile by composition
        System.out.println("Start pile by composition test");
        PileParComposition pc = new PileParComposition();
        pc.empiler("Test");
        pc.empiler("Zenika");

        while (!pc.estVide()) {
            pc.depiler();
        }

        System.out.println("End pile by composition test\n\n");

        // Pile by inheritance
        System.out.println("Start pile by inheritance test");
        PileParHeritage ph = new PileParHeritage();
        ph.empiler("Test");
        ph.empiler("Zenika");

        while (!ph.estVide()) {
            ph.depiler();
        }

        System.out.println("End pile by inheritance test");

    }
}
