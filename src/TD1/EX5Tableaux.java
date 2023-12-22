package TD1;

public class EX5Tableaux {

    public static void main(String[] args) {
        // Tableau initial
        char[] tableau = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};

        // Affichage du tableau initial
        System.out.println("Tableau initial:");
        afficherTableau(tableau);

        // Effectuer le décalage
        decalerTableauGauche(tableau);

        // Affichage du tableau modifié
        System.out.println("\nTableau modifié:");
        afficherTableau(tableau);
    }


    private static void decalerTableauGauche(char[] tableau) {
        char premierElement = tableau[0];

        for (int i = 0; i < tableau.length - 1; i++) {
            tableau[i] = tableau[i + 1];
        }

        tableau[tableau.length - 1] = premierElement;
    }


    private static void afficherTableau(char[] tableau) {
        for (char element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
