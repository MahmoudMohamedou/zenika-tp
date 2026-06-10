package com.zenika.tp.java.pattern.template;

public abstract class ClasseAbstraite {
    public final void methodeTemplate() {
        operation1();
        operation2();
        operation3();
    }

    protected abstract void operation1();

    protected void operation2() {
// Code d'implémentation
    }

    private void operation3() {
// Code d'implémentation
    }
}