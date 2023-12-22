package TD1;

import java.util.Scanner;

public class EX5Boucle {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Entrer un entier positif n");
        int n,un=1,un1=1,un2=1;
        n=s.nextInt();
        if(n==1){
            System.out.println(1);
            return ;
        }
        System.out.println("1 1");
        for(int i=2;i<=n;i++){
            un=un1+un2;
            un2=un1;
            un1=un;
            System.out.println(un+" ");
        }
    }
}
