package Chwilowe;

import java.util.Arrays;

public class BinarneSortowanie {
    public static int szukaj(int szukana) {
        int poczatek = 0;
        int [] tab = new int[100];
        int koniec = tab.length-1;

        for(int i = 0; i < tab.length; i++) {
            tab[i] = i*2;
        }

        int znaleziona = tab[0];
        int srodek;

        while(poczatek <= koniec) {
            srodek = (koniec+poczatek)/2;
            znaleziona = tab[srodek];

            if(znaleziona == szukana) {
                System.out.println(srodek + " " + znaleziona);
                return  0;
            }

            else if(znaleziona >= szukana && koniec != srodek) {
                koniec = srodek - 1;
            }
            else if(znaleziona <= szukana) {
                poczatek = srodek +1;
            }

        }
        System.out.println("Nie ma");
        return 0;


    }
}
