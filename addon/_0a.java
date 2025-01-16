// import java.util.*;

public class _0a {    

// binary search:
    // public static void binary_search(int arr[],int k){
    //     int n = arr.length;
    //     int s = 0;
    //     int e = n-1;
    
    //     while (s<=e) {
    //         int mid = (s+e)/2;
    //         if(arr[mid] == k){
    //             System.out.printf("The key %d is at index of array arr: %d\n",arr[mid],mid);}
    //             if(arr[mid]>k){
    //                 e = mid -1;}
    //                 else{
    //                 s = mid +1;}   
    //         }
    // }
    // public static void main(String[] args) {
    //     int  arr[] = {1,2,3,4,5,6,7,8};
    //     int k = 8;
    //     binary_search(arr, k);
    //     }  


// Pairing of elements of array;

// public static void Pairing(int arr[]){
//     for(int i=0; i<arr.length; i++){
//         for(int j = i+1; j<arr.length;j++){
//             System.out.printf("{%d,%d} ",arr[i],arr[j]);}
//             System.out.println();
//     }
// }
// public static void main(String[] args) {
//     int  arr[] = {1,2,3,4,5,6,7,8};
//     Pairing(arr);
//     System.out.println();
//     Pairing(arr);
//     }  

// // To print all sub array 

    // public static void main(String... args){
    //     int arr[] = {1,-5,2,6,-8,6};
    //     sub_array(arr);
    // }
    //     public static void sub_array(int arr[]){
    //         int n = arr.length;
    //         for(int i = 0; i<n;i++){
    //            for(int j = i; j<n;j++) {
    //             System.out.print("{ ");
    //             for(int k = i;k<=j;k++){
    //                 System.out.print(k+" ");
    //             }System.out.print("}");
    //             System.err.println();
    //            }System.err.println();
    //         }
    //     }



// // Sub Array having max sum;

//         public class Array{
//                     public static void Max_sum_Subarray(int arr[]){
//                         int prefix[] = new int[arr.length];
//                         int max = Integer.MIN_VALUE;
//                         int a=0;
//                         int b=0;
//                         prefix[0] = arr[0];
//                         for(int i=1; i< arr.length; i++){
//                             prefix[i] = prefix[i-1] + arr[i];}
                
//                         for(int i = 0; i<arr.length; i++){
//                                 int start = i;
//                             for(int j = i; j<arr.length; j++){
//                                 int end = j;
//                                 int c_sum = i==0? prefix[j]: prefix[end]- prefix[start-1];     // here time complexity is n^2
//                                 if(max <= c_sum){
//                                     a=i;
//                                     b=j;
//                                     max = c_sum;}
//                                 }}
//                                 System.out.print("Sub array index from "+a+" to "+b+" have max sum equal to "+max);
//                     }
//                     public static void main(String [] args){
//                        int arr[] = {1,2,3,-4,-5};
//                         Max_sum_Subarray(arr);
//                     }
//                 }


// // Sub Array having max sum by KADANES ALGORITHM

// import java.util.*;
// public class Array {

// public static void main(String... args){
//    int arr[] = {-1,-2,-6,-1,-3};
//    Kadanes(arr);
// }
// public static void Kadanes(int arr[]){
//   int c_sum= 0;
//   int max = Integer.MIN_VALUE;

//   for(int i = 0; i<arr.length; i++){
//    c_sum += arr[i];
//    if(c_sum <0){
//        c_sum=0;
//    }
//        if(c_sum>max){
//            max = c_sum;   // unable to find corresponding sub array.
//        }
//   }
//   if(max==0){
//    max = Arrays.stream(arr).max().orElseThrow();
//   }
//   System.out.println("The sub_array max sum is "+max);
// }
// }               

// Trapped rainwater calculation

// public class _1 {
//     public static void main(String... args){
//         int arr[] = {4,2,0,6,3,2,5};
//         int width = 1;
//         trw(arr,width);
//     }

//     public static void trw(int arr[],int w){
//         int l = 0;
//         int n = arr.length;
//         int r = n-1;
//         int trw = 0;
//         int lmh = arr[l];
//         int rmh = arr[r];

//         while(l<r){
//             if(lmh<rmh){
//                 l++;
//                 lmh = Math.max(lmh, arr[l]);
//                 trw += (lmh-arr[l]);
//             }else{
//                 r--;
//                 rmh = Math.max(rmh, arr[r]);
//                 trw += (rmh-arr[r])*w;
//             }
//         }
//         System.out.println(trw);
//     }
//         }

// Buy and Sell stocks


// public static void main(String... args){
//     int Day_prices[] ={6,7,4,8,2,1};
//     int n = Day_prices.length;
//     int max_profit = 0;
//     int s =0;      // b=0;
//     int buy_price = Integer.MAX_VALUE;

//     for(int i = 0; i < n; i++ ){
//         if(buy_price < Day_prices[i]){ 
//             int profit = Day_prices[i] - buy_price;
//             if(max_profit < profit){
//                 s=i;
//                 max_profit = Math.max(max_profit, profit);}
//         } else{
//         //    if(b<a){
//         //     b=i;   // unable to calculate buy day   
//         //    }
//             buy_price = Day_prices[i];  }} 
//             System.out.println("The stock should buy on day ..."+" and sell on day "+(s+1)+" to get max profit of "+max_profit);
                
// }

// Sorting by bubble sort

// public static void b_sort(int arr[]){
//     int n = arr.length;
//     for(int i = 0; i < n-1; i++){
//         for(int j = 0; j <n-1-i; j++){
//             if(arr[j]>arr[j+1]){
//                 int temp = arr[j];
//                 arr [j] = arr[j+1];
//                 arr[j+1] = temp;
//             }}}System.out.print("By bubble sorting: ");

//             for(int i= 0; i<n; i++){
//                 System.out.print(arr[i]+" ");
//             }
// }
// // &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

// //  Sorting by selection
// public static void s_sort(int arr[]){
//     int n = arr.length;
//     for(int i = 0; i < n-1; i++){
//         int min_pos = i;
//         for(int j = i+1; j<n; j++){
//             if(arr[min_pos] > arr[j]){
//                 min_pos =j;}
//     }
//     int temp = arr[i];
//     arr[i] = arr[min_pos];
//     arr[min_pos] = temp;
//     }
//     System.out.print("By selection sorting: "); 
//     for(int i =0; i<n; i++){
//         System.out.print(arr[i]+" ");
//     }
// }

// // &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

// // Sorting by Insertion
// public static void i_sort(int arr[]){
//     int n = arr.length;
//     for(int i = 1; i<n; i++){
//         int now = arr[i];
//         int pre = i-1;
//         while(pre >=0){
//             if(arr[pre] > now){
//                 arr[pre+1] = arr[pre];
//                 pre--;}
//                 else{
//                     break;    // this break statement is necessary
//                 }
//         }
//          arr[pre+1] = now;
//     }
//     System.out.print("Sorting by insertion: ");
//     for(int i = 0; i<n;i++){
//         System.out.print(arr[i]+" ");}
// }


// public static void main(String... args){
//     int arr[] = {1,2,2,1,3,3,3,13,53,64};
//     b_sort(arr);
//     System.out.println();
//     s_sort(arr);
//     System.out.println();
//     i_sort(arr);
// }

// Spiral 2D Array

// public static void spiral(int arr[][]){
//     int m = arr.length;
//     int n =arr[0].length;

//    int sr = 0;
//    int sc = 0;
//    int ec = n-1;
//    int er = m-1;

//    while(sc <= ec && sr <= er){
//     //top: 
//     for(int i = sc; i <= ec; i++){
//         System.out.print(arr[sr][i] + " ");}

//         // right:
//         for(int j = sr+1; j <= er; j++){
//             System.out.print(arr[j][ec] + " ");}

//             //bottom:
//             for(int i = ec-1; i >= sc; i--){
//                 if(er == sr){
//                     break;}

//                 System.out.print(arr[er][i] + " ");}
                
//                 //left
//                 for(int j = er -1; j>= sr +1; j--){
//                     if(sc == ec){
//                         break;}
//                     System.out.print(arr[j][sc]+ " ");}

//                     sr++;
//                     sc++;
//                     er--;
//                     ec--;   }
// }

// public static void main(String...args){
//     int arr[][] = { {1,2,3},
//                     {5,6,7},
//                     {9,10,11},
//                     {13,14,15},
//                     {17,18,19}};
//                     spiral(arr);
// }


//Search in 2D Array

// public static boolean Search_2d(int arr[][], int key){
//     int m = arr.length;
//     int n = arr[0].length;
//     int row = 0;
//     int col = n-1;

//     while(row < m && col >= 0){
//         if(key == arr[row][col]){
//             System.out.println(key+ " found at {"+row+","+col+"}");
//         return true;}

//             else if(key > arr[row][col]){
//                 row++;}
//                 else{
//                     col--;}
//     }
//     System.out.println(key+ " not found");
//     return false;
// }
// public static void main(String... args){
//     int key = 33;
//     int arr[][] = {{10,20,30,40},
//                    {15,25,35,45},
//                    {27,29,37,48},
//                    {32,33,39,50}};
//                    Search_2d(arr, key);
// }

// String Compression

// public static void main(String... args){
//     String str = "aaabbcccdde";
//     StringBuilder sb = new StringBuilder("");
//     int count = 1;
//     int n = str.length();
//     for(int i = 0; i<n; i++){
//         char ch = str.charAt(i);
//         sb = sb.append(ch);
        
//         for(int j = i+1; j<n;j++){
//             if(ch == str.charAt(j)){
//                 count++;
//             i++;}
//         }
//         sb = sb.append(count);
//         count =1;
//     }
//     sb.toString();
//     System.out.println(sb);
// }

// Count no. of set bit

//   public static void main(String... args){
//         int n;
//         int count = 0;
//         Scanner scn = new Scanner(System.in);
//         n = scn.nextInt();
//         while (n>0) {
//             int b = n&1;
//             if (b==1) {
//                 count++;}
//               n = n>>1;
//         }
//             System.out.println(count);
//             scn.close();
//        }
}