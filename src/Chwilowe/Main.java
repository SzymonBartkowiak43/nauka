package Chwilowe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String []args) throws MniejNizZero{

        int ile = 10000000;
        List<Integer> lista = new ArrayList<>();

        long start = System.currentTimeMillis();

        Thread one = new Thread(() -> {
        for(int i = 0; i < ile;i++) {
            lista.add(i);
        }
        });

        Thread two = new Thread(() -> {
            for(int i = 0; i < ile;i++) {
                lista.add(i);
            }
        });

        long end = System.currentTimeMillis();
        System.out.println("Zajelo to " + end + " " + start);

    }

    private static void zlywiek(int wiek) throws MniejNizZero {
        if(wiek < 1) {
            throw new MniejNizZero("O nie zjebales za mały wiek", new RuntimeException());
        }
        else if(wiek > 10) {
            throw  new MniejNizZero();
        }
    }
}
