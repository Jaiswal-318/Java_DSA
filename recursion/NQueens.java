public class NQueens {
    
    
  public static boolean isSafe(char arr[][],int row,int colmn){
    for(int i =row-1; i>=0; i--){
      if(arr[i][colmn]=='Q'){
        return false;}}

    for(int i =row-1,j = colmn-1; i>=0 && j>=0; i--,j--){
        if(arr[i][j]=='Q'){
            return false;}}

    for(int i =row-1,j = colmn+1; i>=0 && j<arr[0].length; i--,j++){
        if(arr[i][j]=='Q'){
            return false;}}

          return true;
  }

  public static void nQueens(char arr[][],int row){
    if(row == arr[0].length){
      printNQueens(arr);
      return;
    }

    for(int j = 0; j<arr.length; j++){
      if(isSafe(arr, row, j)){
        arr[row][j] = 'Q';
        nQueens(arr, row+1);
        arr[row][j] = 'x';}
    }
  }

  public static void printNQueens(char arr[][]){
    System.out.println("-------CHESS BOARD-------");
    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[0].length; j++){
        System.out.print(arr[i][j]+" ");}
      System.out.println();}
  }

  public static void main(String args[]){
    int n = 4;
    char arr[][] = new char[n][n];

    for(int i = 0; i<n; i++){
      for(int j = 0; j<n; j++){
        arr[i][j] = 'x'; }}
        nQueens(arr, 0);
        System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        printNQueens(arr);
  }

}
