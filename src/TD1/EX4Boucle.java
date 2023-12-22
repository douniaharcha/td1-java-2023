package TD1;

import java.util.Scanner;

public class EX4Boucle {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Entrer deux nombres entiers positifs non nuls a et b");
        int pgcd=1;
        int a=s.nextInt();
        System.out.println("a= "+a);
        int b=s.nextInt();
        System.out.println("b= "+b);
        for(int i=1;i<Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                pgcd=i;
            }
        }
        System.out.println("pgcd= "+pgcd);
    }
}
