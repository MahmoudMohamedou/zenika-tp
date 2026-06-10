package com.zenika.tp.java.pattern.template;

public class ClasseConcrete extends ClasseAbstraite {
    public static void main(String[] args) {
        ClasseConcrete classeConcrete = new ClasseConcrete();
        classeConcrete.methodeTemplate();
    }

    @Override
    protected void operation1() {
      System.out.println("Operation 1");
    }
    @Override
    protected void operation2() {
        System.out.println("Operation 2");
    }
}
