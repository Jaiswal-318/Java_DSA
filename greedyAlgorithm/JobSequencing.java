package concept.greedyAlgorithm;

import java.util.ArrayList;

public class JobSequencing {

    public static void main(String[] args) {
        int[][] arr = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Jobs> al = new ArrayList<>();

        for (int i = 0; i<arr.length; i++)
            al.add(new Jobs(i,arr[i][0],arr[i][1]));

        al.sort((obj1, obj2) -> obj2.profit - obj1.profit);  // sorting all descending Order by profit

        ArrayList<Integer> jobSeq = new ArrayList<>();
        int time = 0;
        int count = 0;
        for (int i = 0; i<arr.length;i++){
            Jobs temp = al.get(i);
            if(temp.deadLine > time){
                jobSeq.add(temp.id);
                time++;
                count++;
            }
        }
        System.out.println("Max jobs"+ count);
        for (int i : jobSeq) System.out.print("Job NO. "+i+" ");
    }
}
class Jobs{
    int id;
    int deadLine;
    int profit;
    Jobs(int i, int dl, int p){
        id = i;
        deadLine = dl;
        profit = p;
    }
}
