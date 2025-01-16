
// import java.util.*;

public class strings {
    
    //                        // To count no. of vowel in string given by user  
    // public static void No_vowel(String n_vowel){
        
    //    int n = n_vowel.length();
    //    String l_vowel = n_vowel.toLowerCase();
    //    int N = 0;
    //    for(int i = 0; i<n; i++){
    //     char ch = l_vowel.charAt(i);
    //     if(ch == 'a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
    //         N++;}
    //    }
    //    System.out.println("The no. of vowels is: "+N);
    // }

    //                                 // To check whether two strings are anagrams or not.
    //     public static boolean anagrams(String s1, String s2){
    //         int a = s1.length();
    //         int b = s2.length();
    //         int x=0;
    //         if(a != b)
    //         return false;

    //         for(int i = 0; i<a; i++){
    //             x=0;
    //             for(int j = 0; j<b; j++){
    //                 if(s1.charAt(i)==s2.charAt(j))
    //                 x++;}
    //                 if(x==0)
    //                 return false;
    //         } return true;
    //     }

    //                         // To capitalise the first letter of every word if sentence;
    //     public static void capitalise(String sen){
    //         int p = sen.length();
    //         StringBuilder sb = new StringBuilder("");
    //         char ch = sen.charAt(0);
    //         sb.append(Character.toUpperCase(ch));
    //         for(int i = 1; i<p;i++){
    //             if(sen.charAt(i)== ' ' && i < p-1){
    //                 sb.append(sen.charAt(i));
    //                 i++;
    //                 sb.append(Character.toUpperCase(sen.charAt(i)));
    //             }else{
    //                 sb.append(sen.charAt(i));
    //             }
    //         }
    //         System.out.println(sb.toString());
            
    //     }

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
    





    // public static void main(String args[]){
    //     System.out.println("Enter your string: "); 
    //     Scanner sc = new Scanner(System.in);

    //     String sen = sc.nextLine();
    //     String n_vowel = sc.nextLine();
    //     String s1 = sc.nextLine();
    //    String s2 = sc.nextLine();

    //   No_vowel(n_vowel);
    //   System.out.println();

    //   boolean v = anagrams(s1, s2);
    //   System.out.println(v);
    //   System.out.println();

    //    capitalise(sen);
    //    System.out.println();

    //    sc.close();
    //    }
       
   
        // public static void main(String a[]){
        // String s = "abc";
        // permutationString(s, "", 0);
        // }
     
        // public static void permutationString(String s, String Ns, int n){
        //  if(s.length() == 0){
        //    System.out.println(Ns);
        //    return;
        //  }
        //  for(int i = 0; i<s.length();i++){
        //    char ch = s.charAt(i);
        //    String newS = s.substring(0, i)+s.substring(i+1);
        //    permutationString(newS, Ns+ch, n);
        //  }
        // }



        public static void main(String a[]){
            String s = "abc";
            subString(s, "", 0);
            }
         
            public static void subString(String s, String Ns, int n){
             if(n == s.length()){
               System.out.println(Ns);
               return;
             }
             
             subString(s, Ns+s.charAt(n), n+1);
             subString(s, Ns, n+1);
            }

         }

