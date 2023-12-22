package TD1;

import java.util.Scanner;

public class EX2 {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("donner trois nombres a, b et c");
        int a=s.nextInt();
        System.out.println("a= "+a);
        int b=s.nextInt();
        System.out.println("b= "+b);
        int c=s.nextInt();
        System.out.println("c= "+c);
        int d=b*b-(4*a*c);
        if(d<0){System.out.println("elle n'adment aucune solution sur R");
        }
        else if(d==0){System.out.println("la solution est "+(-b/2*a));}
        else {System.out.println("l'equation adment deux solution sont: "+((-b+Math.sqrt(d))/2*a)+" et "
                +((-b-Math.sqrt(d))/2*a));}

    }
}
