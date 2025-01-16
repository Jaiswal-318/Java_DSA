public class Gridways {
    
  public static void main(String args[]){
    int m = 4, n = 4;
    int N = gridsway(0, 0, m, n);
    System.out.println(N);
  }
  public static int gridsway(int x,int y, int m, int n){
    if(x==m-1 && y == n-1){
      return 1;
    }
    if(x==m || y==n){
      return 0;
    }
    return gridsway(x+1, y, m, n)+ gridsway(x, y+1, m, n);
  }
}
