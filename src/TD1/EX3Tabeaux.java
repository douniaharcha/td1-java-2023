package TD1;

import java.util.Scanner;

public class EX3Tabeaux {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur la taille du tableau
        System.out.print("Entrez le nombre d'étudiants N : ");
        int N = scanner.nextInt();

        // Créer le tableau pour stocker les moyennes
        double[] moyennes = new double[N];

        // Lire les moyennes des étudiants
        for (int i = 0; i < N; i++) {
            System.out.print("Entrez la moyenne de l'étudiant " + (i + 1) + " : ");
            moyennes[i] = scanner.nextDouble();
        }

        // Demander à l'utilisateur le seuil
        System.out.print("Entrez le seuil de moyenne : ");
        double seuil = scanner.nextDouble();

        // Compter le nombre d'étudiants ayant une moyenne supérieure ou égale au seuil
        int nombreEtudiantsAuDessusDuSeuil = 0;
        for (int i = 0; i < N; i++) {
            if (moyennes[i] >= seuil) {
                nombreEtudiantsAuDessusDuSeuil++;
            }
        }

        // Afficher le résultat
        System.out.println("Nombre d'étudiants ayant une moyenne supérieure ou égale au seuil : " + nombreEtudiantsAuDessusDuSeuil);
    }
}
