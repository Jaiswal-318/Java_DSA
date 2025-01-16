package concept.arraylist;

import java.util.*;
public class BasicsOperation {

    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>();


// To Add element.
               list.add(1);
               list.add(2);
               list.add(3);
               list.add(0);
               list.add(5);
               System.out.println(list);

// To know size of ArrayList.
              System.out.println(list.size());

// To fetch and print element of particular index
        System.out.println(list.get(3));

// To add element at particular index
        list.set(4,10 );
        System.out.println(list);

// To delete element of specific index
        list.remove(2);
        System.out.println(list);

// To check element present in particular ArrayList
        System.out.println(list.contains(4));

        list.add(2,3);

        for (Integer integer : list)
            System.out.print(integer + " ");
        System.out.println("\tOut of loop");

// Arranging in ascending Order
        Collections.sort(list);
        System.out.println(list);

// Arranging in Descending Order
        list.sort(Collections.reverseOrder());
        System.out.println(list);

    }
}
