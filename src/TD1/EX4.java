package TD1;

import java.util.Scanner;

public class EX4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("entrez la moyenne d'un etudiant ");
        float m = s.nextFloat();
        if (m >= 16) {
            System.out.println("Très Bien ");
        } else if (m >= 14) {
            System.out.println("Bien ");
        } else if (m >= 12) {
            System.out.println("Assez Bien ");
        } else if (m >= 10) {
            System.out.println("Passable");
        } else {
            System.out.println("Non Validé");
        }
    }
}
