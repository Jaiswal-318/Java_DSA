
public class Spiral_2D {

    public static void spiral(int arr[][]){
        int m = arr.length;
        int n =arr[0].length;

       int sr = 0;
       int sc = 0;
       int ec = n-1;
       int er = m-1;

       while(sc <= ec && sr <= er){
        //top: 
        for(int i = sc; i <= ec; i++){
            System.out.print(arr[sr][i] + " ");}

            // right:
            for(int j = sr+1; j <= er; j++){
                System.out.print(arr[j][ec] + " ");}

                //bottom:
                for(int i = ec-1; i >= sc; i--){
                    if(er == sr){
                        break;}

                    System.out.print(arr[er][i] + " ");}
                    
                    //left
                    for(int j = er -1; j>= sr +1; j--){
                        if(sc == ec){
                            break;}
                        System.out.print(arr[j][sc]+ " ");}

                        sr++;
                        sc++;
                        er--;
                        ec--;   }
    }

    public static void main(String...args){
        int arr[][] = { {1,2,3},
                        {5,6,7},
                        {9,10,11},
                        {13,14,15},
                        {17,18,19}};
                        spiral(arr);
    }
    
}
