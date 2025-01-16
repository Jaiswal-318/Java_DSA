package concept.arraylist;

import  java.util.*;
public class ArrayList_2D {

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1;i<=5;i++){
            list1.add(i);
            list2.add(2*i);
            list3.add(3*i);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList+"\n");

        for (ArrayList<Integer> newlist : mainList) {
            for (Integer integer : newlist) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
