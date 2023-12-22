package TD1;

import java.util.Scanner;

public class EX9Boucle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Entrez un chiffre entier : ");
        int nombre = scanner.nextInt();


        int somme = calculerSommeChiffres(nombre);


        System.out.println("La somme des chiffres de " + nombre + " est : " + somme);
    }

    private static int calculerSommeChiffres(int nombre) {

        nombre = Math.abs(nombre);

        int somme = 0;


        while (nombre > 0) {
            somme += nombre % 10;
            nombre /= 10;
        }

        return somme;
    }
}
