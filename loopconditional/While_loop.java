
import java.util.*;
public class While_loop{
public static void main(String args []){
    int a;
    Scanner s = new Scanner(System.in);
    a = s.nextInt();
    int i=2;

    if(a<2){
        System.out.println(a+ " is not prime");}
        else if(a==2){
        System.out.println(a+ " is prime");}
       
        else{
        boolean c = true;

    while(i<=Math.sqrt(a)){
        if(a%i==0){
            c = false;}
            i++;}

        if(c == true){
            System.out.println(a+ " is prime");
        }else{
            System.out.println(a+ " is not prime");}}

        s.close();}}

 
// // Print fibonacci series upto nth term
// import java.util.*;
// public class Recursion {

//     public static void main(String args[]){
//         System.out.print("Enter the nth term: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr [] = new int[n];
//         arr[0] = 0;
//         arr[1] = 1;
//       //  arr[2] = 1;
//        System.out.print(arr[0]+" "+arr[1]+" ");
//         for(int i =2; i < n; i++){
                
//                 arr[i] = arr[i-1] + arr[i-2];
//                 System.out.print(arr[i]+" ");
//         }
      
//         sc.close();
//     }



//static int floorSqrt(int x)
// {
// if (x == 0 || x == 1)
// return x;
// int i = 1, result = 1;
// while (result <= x) {
// i++;
// result = i * i;
// }
// return i - 1;
// }
// public static void main(String[] args)
// {
// int x =25 ;
// System.out.print(floorSqrt(x));
// }
    
//     }