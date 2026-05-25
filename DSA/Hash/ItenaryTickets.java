package Hash;
import java.util.*;
public class ItenaryTickets {
    public static void main(String[] args) {
        String[] tickets = {"NYC-LAX", "LAX-SFO", "SFO-SEA"};
        HashMap<String, String> itineraryMap = new HashMap<>();
        for (String ticket : tickets) {
            String[] parts = ticket.split("-");
            itineraryMap.put(parts[0], parts[1]);
        }
        String start = "NYC";
        System.out.print("Itinerary: " + start);
        while (itineraryMap.containsKey(start)) {
            String next = itineraryMap.get(start);
            System.out.print(" -> " + next);
            start = next;
        }
    }
}
