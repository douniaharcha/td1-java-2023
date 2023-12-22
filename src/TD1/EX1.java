package TD1;

import java.util.Scanner;

public class EX1 {
        public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            System.out.println("entrez 3 nombres");
            int a;
            a=s.nextInt();
            System.out.println("a="+a);
            int b;
            b=s.nextInt();
            System.out.println("b="+b);
            int c;
            c=s.nextInt();
            System.out.println("c="+c);
            int max=Math.max(a,b);
            max=Math.max(max,c);
            System.out.println("la maximum est "+max);



        }
}
