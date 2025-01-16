package concept.heap;

import java.util.ArrayList;

public class HeapBuilding {
    static class Heap{
        ArrayList<Integer> al = new ArrayList<>();

// HEAPIFY
        private void heapify(int idx){
            int minIdx = idx;
            int left = 2*idx + 1;
            int right = 2*idx + 2;


            if(left < al.size() && al.get(minIdx) > al.get(left))
                minIdx = left;
            if(right < al.size() && al.get(minIdx) > al.get(right))
                minIdx = right;

            if (minIdx != idx){
                int temp = al.get(idx);
                al.set(idx,al.get(minIdx));
                al.set(minIdx,temp);
                heapify(minIdx);
            }

        }

// ADD
        public void add(int data){
            al.add(data);
            int ch = al.size()-1;
            int par = (ch-1)/2;

            while (al.get(ch)<al.get(par)){
                int temp = al.get(ch);
                al.set(ch,al.get(par));
                al.set(par,temp);
                ch = par;
                par = (ch-1)/2;
            }
        }
// PEEK
        public int peek(){
            return al.getFirst();
        }
// DELETE
        public int delete(){
           int val = al.getFirst();

           int temp = al.getFirst();
           al.set(0,al.getLast());
           al.set(al.size()-1,temp);

           al.removeLast();

           heapify(0);

           return val;
        }
// EMPTY
        public boolean isEmpty(){
            return al.isEmpty();
        }
    }

    public static void main(String[] args) {
        Heap hp = new Heap();

        hp.add(5);
        hp.add(4);
        hp.add(10);
        hp.add(2);
        hp.add(3);

        while (!hp.isEmpty()){
            System.out.println(hp.peek());
            System.out.println(hp.delete());
        }
    }
}
