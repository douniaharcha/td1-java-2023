package TD1;

import java.util.Scanner;

public class EX8Boucle {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Entrer un entier n");
        int n=s.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for( int i= n; i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
