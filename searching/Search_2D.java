
public class Search_2D {
    public static boolean Search_2d(int arr[][], int key){
        int m = arr.length;
        int n = arr[0].length;
        int row = 0;
        int col = n-1;

        while(row < m && col >= 0){
            if(key == arr[row][col]){
                System.out.println(key+ " found at {"+row+","+col+"}");
            return true;}

                else if(key > arr[row][col]){
                    row++;}
                    else{
                        col--;}
        }
        System.out.println(key+ " not found");
        return false;
    }
    public static void main(String... args){
        int key = 33;
        int arr[][] = {{10,20,30,40},
                       {15,25,35,45},
                       {27,29,37,48},
                       {32,33,39,50}};
                       Search_2d(arr, key);
    }
    
}
