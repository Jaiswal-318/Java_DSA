
import java.util.*;
public class function{
        public static void main(String args []){
                int a;
                System.out.print("Enter your decimal number: ");
                Scanner sc = new Scanner(System.in);
                a = sc.nextInt();
                dec_bin(a);
                        sc.close();  }    

             static void dec_bin(int p)  {
                int pow = 0;
                int bin = 0;
                int rem = 0;
                 int d = p;
                 while(p !=0){
                         rem = p%2;
                         bin = bin + (rem * (int)Math.pow(10,pow));
                         pow++;
                         p/=2;
                         }
                         System.out.println("The binary equivalent of given decimal no. " + d + " is " +bin);
             }         
        }

