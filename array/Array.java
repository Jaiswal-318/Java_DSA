package concept.array;
import java.util.*;

    public class Array {
    public static void main(String... args){
        int[] arr = {-1,-2,-6,-1,-3};
        Kadanes(arr);
    }
    public static void Kadanes(int arr[]){
       int c_sum= 0;
       int max = Integer.MIN_VALUE;

       for(int i = 0; i<arr.length; i++){
        c_sum += arr[i];
        if(c_sum <0){
            c_sum=0;
        }
            if(c_sum>max){
                max = c_sum;   // unable to find corresponding sub array.
            }
       }
       if(max==0){
        max = Arrays.stream(arr).max().orElseThrow();
       }
       System.out.println("The sub_array max sum is "+max);
    }
}               
