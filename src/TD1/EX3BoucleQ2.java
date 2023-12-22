package TD1;

import java.util.Scanner;

public class EX3BoucleQ2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int N, Position = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Entrer un nombre N");
            N = s.nextInt();
            if (N > max) {
                max = N;
                Position = i;
            }
        }
        System.out.println("le maximum est: "+max+" dans la position est: "+Position);
    }
}
