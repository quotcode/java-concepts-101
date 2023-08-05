import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Shivam",1);
        map.put("Akshay",5);
        map.put("Mahua",3);
        map.put("Kiran",4);

        System.out.println(map.get("Shivam"));
        // getOrDefault(): this will return the default value if the value for given key is not found.
        // Note: this we can use to avoid Null Pointer Exception in scenarios where the null is written by get
        // and then we are doing any operations on the null value
        System.out.println(map.getOrDefault("Shivam",-1));


        map.remove("Mahua");

        System.out.println(map.containsKey("Kiran"));
        System.out.println(map.containsValue("5"));

        System.out.println(map);

        //below we are implementing a lambda function whenever a key is absent we will print a message
        System.out.println(map.computeIfAbsent("iAmAnAbsentKey", f -> {System.out.println("Key is absent"); return 0;}));
        System.out.println(map);

        // Method 1: Traverse a Map using map.entrySet()
        Set<Map.Entry<String, Integer>> mappings = map.entrySet();
        for(Map.Entry<String, Integer> entry: mappings){
            System.out.println(entry);
        }

        // Method 2: Traverse a Map using map.keySet()
        Set<String> allKeys = map.keySet();
        for(String key: allKeys){
            System.out.println("Key: " + key + ", value: " + map.get(key));
        }
        // Method 3: Traverse a Map using map.values()
        Collection<Integer> allValues = map.values();
        for(Integer val: allValues){
            System.out.println(val);
        }




    }
}
