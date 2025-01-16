
import java.util.*;
public class OOPs_1 {
    public static void main(String... args){
        System.out.println("Enter details: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account no. ");
        int acc = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter amount ");
        float amt = sc.nextFloat();

        banking p1 = new banking();
        p1.details(acc,name,amt);
        p1.Disp();

        p1.Diposit();
        p1.Withdraw(10000);
        p1.Disp();

        sc.close();
    }
   
}

class banking{
    int acc;
    String name;
    float amt;
    Scanner scn = new Scanner(System.in);

   void details(int acc,String name, float amt){
        this.acc = acc;
        this.name = name;
        this.amt = amt;}

    public void Disp(){
        System.out.println("The account no. is "+acc);
        System.out.println("The account holder name is "+name);
        System.out.println("The current amount in account is "+amt);}
    
    void Diposit(){
        System.out.print("Enter amount to be deposited ");
        float n;
        n = scn.nextFloat();
        this.amt = amt+n;
        System.out.println("The amount deposited is  "+n);
            }
    
    void Withdraw(float n){
        if(n<amt){
            amt = amt-n;
            System.out.println("The withdraw amount is "+n);
        }else{
            System.out.println("Insufficient amount!");
        }
    }
}
