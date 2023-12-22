package TD1;

import java.util.Scanner;

public class EX3 {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("entrez le nombre a");
        int a=s.nextInt();
        System.out.println("entrez le nombre b");
        int b=s.nextInt();
        System.out.println("tapez 1 pour savoir si la somme a+b est paire \n"+
                "tapez 2 pour savoir si le produit ab est pair \n"+
                "tapez 3 pour connaitre le signe de la somme a+b \n"+
                "tapez 4 pour connaitre le signe du produit ab \n");
        int operation=s.nextInt();
        switch(operation){
            case 1:if((a+b)%2==0)
                System.out.println("la somme "+ (a+b)+" est pair");
            else System.out.println(" la somme "+ (a+b)+" est impair");
                break;
            case 2:if((a*b)%2==0)
                System.out.println("le produit "+(a*b)+" est pair");
            else System.out.println("le produit "+(a*b)+" est impair");
                break;
            case 3:if((a+b)>0)
                System.out.println("le signe de la somme "+(a+b)+" est positive");
            else System.out.println("le signe de la somme "+(a+b)+" est negative");
                break;
            case 4:if((a*b)>0)
                System.out.println("le signe du produit "+(a*b)+" est positif");
            else System.out.println("le signe du produit "+(a*b)+" est negatif");

        }
    }
}
