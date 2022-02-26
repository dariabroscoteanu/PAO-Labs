package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;

public class Main {

    public static void main(String[] args) {
	/*
    1.	Scrieti un program care sa afișeze toate numerele pare din intervalul [0,n], unde n este un numar citit de la tastatura.
   */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ex1:");
        int n = scanner.nextInt();
        for(int i = 0; i <= n ; i += 2){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
   /* 2.	Scrieți un program care sa compare doua numere a și b citite de la tastatura si sa afiseze numarul mai mare.
   */
        System.out.println("Ex2:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Maximul este " + max(a, b));
        /*
    3.	Scrieți o metoda care sa calculeze factorialul unui numar n citit de la tastatura.
    */
        System.out.println("Ex3:");
        int c = scanner.nextInt();
        int factorial = 1;
        for(int i = 2; i <= c; ++i)
            factorial *= i;
        System.out.println("Factorialul este:" + factorial);
        /*

    4.	Fiind dat un numar n, scrieti o metoda care insumeaza toti multiplii de 3 si 5 pana la n (inclusiv).
    */
        System.out.println("Ex4:");
        int d = scanner.nextInt();;
        int suma = 0;
        for(int i = 15; i <= d; i += 15)
            suma += i;
        System.out.println("Suma este:" + suma);
        /*
    5.	Cititi de la tastatura n numere. Elementele citite vor fi organizate in doi vectori diferiti, in functie de paritate (de ex: elementele pare in vectorul x, iar cele impare in vectorul y).

    */
        System.out.println("Ex5:");
        int m = scanner.nextInt();
        int[] x = new int[0];
        int[] y = new int[0];
        for(int i = 1; i <= m ; ++i){
            int e = scanner.nextInt();
            if(e % 2 == 0) {
                x = Arrays.copyOf(x, x.length + 1);
                x[x.length - 1] = e;
            }
            else {
                y = Arrays.copyOf(y, y.length + 1);
                y[y.length - 1] = e;
            }
        }
        System.out.println("Pare:");
        for(int i = 0; i < x.length ; ++i)
            System.out.print(x[i] + " ");

        System.out.println("");
        System.out.println("Imare:");
        for(int i = 0; i < y.length ; ++i)
            System.out.print(y[i] + " ");
        System.out.println("");
        /*

        6.	Cititi de la tastatura n note, numere intregi, intr-un vector. Cand cititi valoarea -1 de la tastatura, citirea notelor se opreste si programul afiseaza media acestora.
    */
        System.out.println("Ex6:");
        int nr = scanner.nextInt();
        float sum = 0;
        float med = 0;
        for(int i = 0; i < nr; ++i){
            int k = scanner.nextInt();
            if(k == -1){
                if(i == 0)
                    med = 0;
                else
                    med = sum/i;
                System.out.println("Media este: " + med);
                break;
            }
            else
                sum += k;
        }
    }
}
