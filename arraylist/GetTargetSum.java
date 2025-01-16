package concept.arraylist;

import java.util.*;
public class GetTargetSum {
    public static boolean sumTarget(ArrayList<Integer> getTarget, int target) {
        int n = getTarget.size();
        int i = 0;
        int j = n - 1;
        while (i != j) {
            if (getTarget.get(i) + getTarget.get(j) == target) {
                System.err.println(getTarget.get(i) + "," + getTarget.get(j));
                return true;
            } else if (getTarget.get(i) + getTarget.get(j) < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] a) {
        ArrayList<Integer> getTarget = new ArrayList<>();
        int target = 6;
        getTarget.add(1);
        getTarget.add(1);
        getTarget.add(2);
        getTarget.add(3);
        getTarget.add(4);
        getTarget.add(5);
        getTarget.add(6);

        System.out.println(sumTarget(getTarget, target));
    }
}



