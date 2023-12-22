package TD1;

import java.util.Scanner;

public class EX8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Saisir un numéro du mois entre 1 et 12");
        int n = s.nextInt();
        int a;
        if ((n == 1) || (n == 3) || (n == 5) || (n == 7) || (n == 8) || (n == 10) || (n == 12)) {
            System.out.println("L es jours de ce mois sont " + 31);
        } else if ((n == 4) || (n == 6) || (n == 9) || (n == 11)) {
            System.out.println("Les jours de ce mois sont " + 30);
        } else {
            System.out.println("Saisir une année entre 1900 et 2100");
            a = s.nextInt();
            if ((a % 100 == 0) && (a % 400 == 0)) {
                System.out.println("l'année est bissextile et les jours de ce mois sont " + 29);
            } else if (a % 100 == 0) {
                System.out.println("l'année est normale et les jours de ce mois sont " + 28);
            }
        }
    }
}
