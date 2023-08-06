package org.arishin;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static int n;

    public static void main(String[] args) {
        System.out.println("-----------------------2 вариант-----------------------");
        System.out.println("Введите число n");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        n = Integer.valueOf(number);
        System.out.println("====");
        for (int x = 1; x <= n; x++) {
            if (x % 3 == 0) {
                System.out.print("Foo");
            }
            if (x % 5 == 0) {
                System.out.println("Bar");
                continue;
            }
            if (x % 3 == 0) {
                System.out.println();
                continue;
            }
            System.out.println(x);
        }
        System.out.println("---------------------3 вариант------------------------");
        IntStream.range(1, n + 1).forEach(x -> {
            if (x % 3 == 0) {
                System.out.print("Foo");
            }
            if (x % 5 == 0) {
                System.out.println("Bar");
                return;
            }
            if (x % 3 == 0) {
                System.out.println();
                return;
            }
            System.out.println(x);
        });
    }
}

