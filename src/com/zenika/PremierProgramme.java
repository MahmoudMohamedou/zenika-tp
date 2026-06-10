package com.zenika;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PremierProgramme {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0] + " " + args[1]);
        // print even numbers
        System.out.println("Even Numbers: " + PremierProgramme.pair());

        // print fibonacci of 10
        PremierProgramme.fibo(10);
    }

    public static int pair() {
        int count = 0;
        for (int i = 0;i<=100;i++)
            if (i % 2 == 0) count++;

        return count;
    }

    public static void fibo(int n){
        int u0 = 0, u1 = 1, fibo = 1;
        for (int i = 2; i <= n; i++){
            fibo = u0 + u1;
            u0 = u1;
            u1 = fibo;
        }

        System.out.printf("Fibonacci of %d is: %d", n,  fibo);
    }
}