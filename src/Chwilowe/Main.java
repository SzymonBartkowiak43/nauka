package Chwilowe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
//        szukanieLiczby l = new szukanieLiczby();
//        int tab[] = new int[10000];
//        for(int i = 0; i < tab.length-1; i++) {
//            tab[i] = i*2;

        BinarneSortowanie.szukaj(20);
//        BinarneSortowanie.szukaj(29);
//        BinarneSortowanie.szukaj(0);
//        BinarneSortowanie.szukaj(198);
//        BinarneSortowanie.szukaj(200);
//        BinarneSortowanie.szukaj(12);
        }

//        System.out.println(l.znajdz(tab,100));
//    }
    public static class szukanieLiczby {

        public int znajdz (int[] tab, int szukana) {
            int start = 0;
            int end = tab.length -1;

            while(start <= end) {
                int srodek = (start + end) /2;
                int liczba = tab[srodek];

                if(liczba == szukana) {
                    return srodek;
                }
                if (liczba < szukana) {
                    start = srodek + 1;
                }else {
                    end = srodek -1;
                }
            }
            return -1;
        }

    }
}
