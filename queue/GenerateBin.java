package concept.queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBin {
    public static void getOneToNBin(Queue<String> q,int n){
        for (int i = 1; i<=n; i++){
            int num = i;
            int rem;
            int pow = 0;
            int bin = 0;
            while (num != 0){
                rem = num%2;
                bin = bin + rem*(int)Math.pow(10, pow);
                pow++;
                num = num/2;
            }
            q.add(String.valueOf(bin));
        }
    }
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        int n = 10;

        getOneToNBin(q,n);

        for (String i: q) {
            System.out.print(i + "  ");
        }

    }
}
