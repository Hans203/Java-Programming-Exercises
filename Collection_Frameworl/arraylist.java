import java.util.ArrayList;
public class arraylist{
    public static void main(String[] args) {
        ArrayList<String> f1Team = new ArrayList<>();
        // Adding an element
        f1Team.add("Mercedes AMG Petronas");
        f1Team.add("RedBull Racing");
        f1Team.add("Mclaren");
        f1Team.add("Williams Racing");
        f1Team.add("Alpine");
        f1Team.add(0, "Scuderia Ferrari");
        //Displaying all the items in a list
        System.out.println("Following are the Formula 1 teams competing for the 2025 trophy: "+f1Team);
        // Displaying an item in the list
        System.out.println("\nThe team to possibly get the trophy is "+f1Team.get(2));
        //Removing an item from the list
        System.out.println("\nDue to infringement of rules team "+f1Team.get(5)+" has been removed from the Grand Prix");
        f1Team.remove(5);
        System.out.println("\nRemaining teams: "+f1Team);
        //Changing an arraylist elemnt
        System.out.println("\n"+f1Team.get(4)+" is changing its name ");
        f1Team.set(4, "Williams PowerTrains");
        System.out.println("The new name is: "+f1Team.get(4));




    }
}