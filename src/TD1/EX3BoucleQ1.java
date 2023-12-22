package TD1;

import java.util.Scanner;

public class EX3BoucleQ1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE, N;

        for (int i = 1; i <= 20; i++) {
            System.out.println("donner un nombre N");
            N = s.nextInt();
            if (N > max) {
                max = N;
            }
        }
        System.out.println("le max est " + max);
    }
}
