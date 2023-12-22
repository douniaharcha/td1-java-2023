package TD1;

import java.util.Scanner;

public class EX3BoucleQ3 {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int N,j=1;
        int position=0;
        do{System.out.println("Entrer un nombre N");
            N=s.nextInt();
            if(N>max){
                max=N;
                position=j;
            }
            j++;
        }
        while(N!=0);
        System.out.println("le max est :"+max+" la position est "+position);
    }
}
