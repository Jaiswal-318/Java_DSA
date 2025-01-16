package concept.hashing;

import java.util.HashMap;

public class Travels {

    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revTickets = new HashMap<>();

        for (String i: tickets.keySet())
            revTickets.put(tickets.get(i),i);

        for (String i: tickets.keySet()){
            if(!revTickets.containsKey(i))
                return i;
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();

        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start = getStart(tickets);
        System.out.print(start);

        for (String i : tickets.keySet()){
            System.out.print("->" + tickets.get(start));
            start = tickets.get(start);

        }
    }

}
