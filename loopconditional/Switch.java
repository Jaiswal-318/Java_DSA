package concept.conditional;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args){
        int a,b;
        System.out.println("Enter two no. ");
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
        b = scn.nextInt();
        char c = scn.next().charAt(0);
        switch (c) {
            case 'a' -> System.out.println(a);
            default -> System.out.println(b);
        }
        scn.close();
    }
}
