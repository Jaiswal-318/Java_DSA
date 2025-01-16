package concept.conditional;

import java.util.Scanner;

public class IfElse {

    public static void main(String... args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int a = sc.nextInt();    // int a = new Scanner(System.in).nextInt;  and  can omit line 5.
        if(a%4==0){
            if(a%100!=0){
                System.out.println(a+" is leap Year");
            }else{
                if(a%400==0){
                    System.out.println(a+ " is a Leap Year");
                }else{
                    System.out.println(a+" is not Leap Year");} }
        }else{
            System.out.println(a+" is not Leap Year");}
        System.out.println();
        sc.close();}
}
