package concept.greedyAlgorithm;

import java.util.*;

public class NepaliCoin {
    public static void main(String[] args) {
        Integer[] notes = {1,2,5,10,20,50,100,500,1000};
        ArrayList<Integer> al = new ArrayList<>();

        int val = 121;
        Arrays.sort(notes, Collections.reverseOrder());
        int count = 0;

        for(int i = 0; i < notes.length && val >0 ;i++){
            while (val >= notes[i]){
                count++;
                al.add(notes[i]);
                val -= notes[i];
            }
        }

        System.out.println("Notes used:- ");
        for (int i : al)
            System.out.print("NPR. "+i+" ");
        System.out.println("\nTotal Notes: "+count);
    }
}
