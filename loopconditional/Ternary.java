package concept.conditional;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args){
        int a,b;
        System.out.println("Enter two no. ");
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
        b = scn.nextInt();
        int c = (a>b)? (a):(b);
        System.out.println(c);
        scn.close();

    }
}


/*
*
 import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter two numbers:");
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
        b = scn.nextInt();
        System.out.println((a > b) ? a : b);
        scn.close();
    }
}

 */

