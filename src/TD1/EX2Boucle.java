package TD1;

import java.util.Scanner;

public class EX2Boucle {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Entrer un nombre N");
        int N=s.nextInt();
        int somme=0;
        for(int i=1;i<=N;i++){
            if(i%2!=0)
                somme+=i;
        }
        System.out.println("somme= "+somme);
    }
}
