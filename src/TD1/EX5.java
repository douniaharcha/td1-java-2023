package TD1;

import java.util.Scanner;

public class EX5 {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("choisir F pour continuer en français et A pour continuer en anlgais ");
        String langue=s.nextLine();
        System.out.println("Saisir une heure ");
        int h=s.nextInt();
        switch(langue){
            case "F":if(h>0 && h<18)
                System.out.println("Bonjour");
            else if(h<22)
                System.out.println("Bonsoir");
            else System.out.println("Bonne Nuit");
                break;
            case "A":if (h>0 && h<18)
                System.out.println("Good Morning");
            else if(h<22)
                System.out.println("Good Evening");
            else System.out.println("Good Night");
                break;
        }

    }
}
