package concept.arraylist;

// For sorted and Rotated Array
import java.util.*;
public class GetTargetSum_2 {

        public static boolean sumTarget(ArrayList<Integer> getTarget,int target,int pIdx){
            int n = getTarget.size();
            int i = pIdx;
            int j = pIdx+1;
            while (i !=j) {
                if(i < 0){
                    i = n-1;
                }
                if(getTarget.get(i)+ getTarget.get(j) == target){
                    return true;
                }else if(getTarget.get(i)+ getTarget.get(j) > target){
                    i = (i+n-1)%n;
                }else{
                    j = (j+1)%n;
                }

            }
            return false;
        }

        public static void main(String[] a){
            ArrayList<Integer> getTarget = new ArrayList<>();

            int pIdx = 0;

            int target = 16;
            getTarget.add(11);
            getTarget.add(15);
            getTarget.add(6);
            getTarget.add(8);
            getTarget.add(9);
            getTarget.add(10);

            int n = getTarget.size();
            for(int i = 0; i<n;i++){
                if(getTarget.get(i)>getTarget.get(i+1)){
                    pIdx = i;
                    break;
                }
            }

            System.out.println(sumTarget(getTarget, target,pIdx));


        }
}
