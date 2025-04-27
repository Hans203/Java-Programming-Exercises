import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> f1Drivers = new HashMap<>();
        System.out.println("Formula 1 Drivers and their numbers");
        // adding elements to the hashmap
        f1Drivers.put("Max Verstappen", 1);
        f1Drivers.put("George Russell", 63);
        f1Drivers.put("Lando Norris", 4);
        f1Drivers.put("Charles Leclerc", 16);
        f1Drivers.put("Lewis Hamilton", 44);


        //Displaying a key and its value
        System.out.println("\nLewis Hamilton's Number: " + f1Drivers.get("Lewis Hamilton")); // 30

        //Checking whether a given key is part of the hashmap
        System.out.println("\nIs Sergio Perez part of the drivers lineup for 2025: " + f1Drivers.containsKey("Sergio Perez"));
        System.out.println("\nIs Charles Leclerc part of the drivers lineup for 2025: " + f1Drivers.containsKey("Charles Leclerc"));

        //Removing an element from the hashmap
        f1Drivers.remove("Lando Norris");
        System.out.println("\nDrivers Lineup after removing Lando Norris: " + f1Drivers);
        for(String str: f1Drivers.keySet()){
            System.out.println(str);
        }
    }
}

