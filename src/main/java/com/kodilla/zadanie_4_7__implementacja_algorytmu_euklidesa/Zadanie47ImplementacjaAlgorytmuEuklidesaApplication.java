package com.kodilla.zadanie_4_7__implementacja_algorytmu_euklidesa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Zadanie47ImplementacjaAlgorytmuEuklidesaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Zadanie47ImplementacjaAlgorytmuEuklidesaApplication.class, args);

        int a = 24;
        int b = 18;

        if (a == 0 || b == 0) System.out.println("The greatest common divisor is equal to 1");
            else {
                while (a != b) {
                    System.out.println(a + " " + b);
                    if (a > b) a -= b; else b -= a;
                }
                System.out.println("The greatest common divisor is equal to " + a);
        }
    }

}
