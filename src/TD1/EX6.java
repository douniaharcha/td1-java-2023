package TD1;

import java.util.Scanner;

public class EX6 {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("entrer deux nombre a et b");
        int a=s.nextInt();
        System.out.println("a= "+a);
        int b=s.nextInt();
        System.out.println("b= "+b);
        if((a>0)&&(b>0)||(a<0)&&(b<0))
            System.out.println("le produit "+(a*b)+" est positif");
        else
            System.out.println("le produit "+(a*b)+" est negatif");
    }
}
