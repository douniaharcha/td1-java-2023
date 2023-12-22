package TD1;

import java.util.Scanner;

public class EX9 {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Entrer deux nombre a et b ");
        int a=s.nextInt();
        System.out.println("a= "+a);
        int b=s.nextInt();
        System.out.println("b= "+b);
        if(a<b)
            System.out.println("a= "+a+" b= "+b);
        else
            System.out.println("b= "+b+" a= "+a);
    }
}
