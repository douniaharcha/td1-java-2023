package TD1;

import java.util.Random;

public class EX1Tableaux {

    public static void main(String[] args) {
        int tab[] = new int[50];
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            tab[i] = r.nextInt(100);}
        for (int i = 0; i < 50; i++) {
            System.out.println("Tab[" + i + "] : " + tab[i]);}
        int max = tab[0];
        int min = tab[0];
        for (int e : tab) {
            if (e > max) max = e;
            if (e < min) min = e;
            System.out.println("la valeur du tableau : " + e);}
        System.out.println("max =" + max + "  min =" + min);}
}
