package concept.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class InBuiltLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

    // ADDING
        ll.add(1);
        ll.add(2);
        ll.add(3);

        ll.addFirst(0);
        ll.addLast(10);
        ll.add(4, 4);

        System.out.println(ll);

    // REMOVE;
        ll.remove(5);
        for (int i : ll) {
            System.out.print(i+" ");}
        System.out.println();

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        ll.addLast(100);
        ll.addLast(50);
        ll.addLast(100);
        System.out.println(ll);
        ll.removeFirstOccurrence(100);
        System.out.println(ll);

    // Display;
        System.out.println(ll.get(ll.size()-2));
        System.out.println(ll.getLast());
        System.out.println(ll.getFirst());

    // Sorting
        Collections.sort(ll);
        System.out.println(ll);
        ll.sort(Collections.reverseOrder());
        System.out.println(ll);

    // Replace
        ll.set(1,99);
        System.out.println(ll);
    }
}
