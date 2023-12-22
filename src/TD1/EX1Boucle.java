package TD1;

import java.util.Scanner;

public class EX1Boucle {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("entrer un nombre N>0");
        int factN=1;
        int N=s.nextInt();
        for(int i=1;i<=N;i++){
            factN*=i;

        }
        System.out.println(N+"!= "+factN);
    }
}
