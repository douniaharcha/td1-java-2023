package TD1;

import java.util.Scanner;

public class EX6Boucle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int totalRecherche = 15;

        System.out.println("Combinaisons d'entiers dont la somme est égale à " + totalRecherche + ":");
        trouverCombinaisons(totalRecherche);
    }

    private static void trouverCombinaisons(int totalRecherche) {

        for (int i = 1; i <= 9; i++) {

            for (int j = 1; j <= 9; j++) {

                for (int k = 1; k <= 9; k++) {

                    if (i + j + k == totalRecherche) {

                        System.out.println(i + " + " + j + " + " + k + " = " + totalRecherche);
                    }
                }
            }
        }
    }
}
