package Chwilowe;

import java.util.Arrays;

public class BinarneSortowanie {
    public static void szukaj(int szukana) {
        int poczatek = 0;
        int [] tab = new int[100];
        int koniec = tab.length-1;

        for(int i = 0; i < tab.length; i++) {
            tab[i] = i*2;
        }

        int znaleziona = tab[0];
        int srodek;

        while(znaleziona != szukana) {
            srodek = (koniec+poczatek)/2;
            znaleziona = tab[srodek];
            if(znaleziona > szukana) {
                koniec = srodek;
            }
            if(znaleziona < szukana) {
                poczatek = srodek;
            }
            else if(poczatek == koniec) {
                System.out.println("Nie znaleziono ;/");
            }
            else
                System.out.println(srodek);

        }


    }
}
