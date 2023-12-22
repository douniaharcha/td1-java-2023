package TD1;

import java.util.Scanner;

public class EX4Tableaux {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Entrez la taille des matrices carrées : ");
        int taille = scanner.nextInt();


        double[][] matrice1 = saisirMatrice(taille, "Matrice 1");


        double[][] matrice2 = saisirMatrice(taille, "Matrice 2");


        double[][] sommeMatrices = sommerMatrices(matrice1, matrice2);


        System.out.println("Somme des matrices : ");
        afficherMatrice(sommeMatrices);
    }


    private static double[][] saisirMatrice(int taille, String nomMatrice) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrice = new double[taille][taille];

        System.out.println("Saisie de la " + nomMatrice + " : ");
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print("Entrez l'élément à la position [" + i + "][" + j + "] : ");
                matrice[i][j] = scanner.nextDouble();
            }
        }

        return matrice;
    }


    private static double[][] sommerMatrices(double[][] matrice1, double[][] matrice2) {
        int taille = matrice1.length;
        double[][] sommeMatrices = new double[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                sommeMatrices[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        return sommeMatrices;
    }


    private static void afficherMatrice(double[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
