package TD1;

import java.util.Scanner;

public class EX2Tabeaux {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Entrer un entier n ");

        int i = 49;

        int n=s.nextInt();
        boolean start = false;
        int[] tab = new int[50];

        do {
            tab[i] = n%2;
            n /= 2;
            i--;

        }while (n != 0);

        for (int T :
                tab) {
            if (start)
                System.out.print(T + " ");
            else {
                if (T == 1){
                    start = true;
                    System.out.print(T + " ");
                }
            }

        }


    }
}
