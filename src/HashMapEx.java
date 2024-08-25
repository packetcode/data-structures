import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> groceries = new HashMap<>();

        groceries.put("eggs", 2);
        groceries.put("milk", 1);

        System.out.println(groceries);
        System.out.println(groceries.get("milk"));
        System.out.println(groceries.containsKey("eggs"));
        System.out.println(groceries.entrySet());
        System.out.println(groceries.keySet());
        System.out.println(groceries.values());
    }
}
