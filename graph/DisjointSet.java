package concept.graph;

public class DisjointSet {
    static int n = 7;
    static int[] par = new int[n];
    static int[] rank = new int[n];

    public static void init(){
        for (int i = 0; i<n; i++ )
            par[i] = i;
    }
    public static int find(int x){
        if(x == par[x])
            return x;

       return par[x] = find(par[x]);
    }
    public static void union(int a,int b){
        int parA = find(a);
        int parB = find(b);
        if(parA == parB)
            return;

        if(rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA]>rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        }else{
            par[parA] = parB;
            rank[parB]++;
        }
    }

    public static void main(String[] args) {
        init();
        System.out.println("Parent of 5 initially: "+find(5));
        union(1,5);
        System.out.println("Parent of 5 after union: "+find(5));
        union(4,3);
        union(0,4);
        System.out.println("Parent of 4 : "+find(4));
        union(1,4);
        System.out.println("Parent of 1: "+find(1));

    }
}
