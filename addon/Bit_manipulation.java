
import java.util.Scanner;

public class Bit_manipulation {
    
    // power of no. with TC = O(log(n))
    public static void expo(int a, int n){
        int ans = 1;
        while(n > 0){
            if((n & 1) >0){
                ans = ans * a;
            }
            a = a*a;
          n = n>>1;
        }
        System.out.print(ans);
    }

// To convert uppercase character to lowercase using bitwise operator

    public static void tolower(){
        for(char ch = 'A'; ch <= 'Z'; ch++)
            System.out.print((char)(ch | ' ' ) + " ");   // (char)(ch + ' ' ) + " " can be used.
    }

// TO count no. of set bit

public static void count_set_bit(int n){
  
    int count = 0;
   
    while (n>0) {
        int b = n&1;
        if (b==1) {
            count++;}
          n = n>>1;
    }
        System.out.print(count);
   }




    public static void main(String... args){
        System.out.print("Enter your no. ");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        expo(n, n);
        System.out.println();
        tolower();
        System.out.println();
        count_set_bit(n);

       sc.close(); 
    }
}
