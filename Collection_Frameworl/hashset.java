
import java.util.HashSet;
public class hashset {
    public static void main(String[] args){
        HashSet<Integer> studRollno  = new HashSet<>();
        // adding values to the HashSet
        studRollno.add(2448022);
        studRollno.add(2448023);
        studRollno.add(2448024);
        studRollno.add(2448025);

        //Trying to add duplicate values to the hash set but it will not get added
        studRollno.add(2448023); 
        System.out.println("Students enrolled for Elective 1: \n"+studRollno);

        //Checking whether certain values are in the Hash Set
        System.out.println("\nHas 2448021 enrolled? " + studRollno.contains(2448021));
        System.out.println("\nHas 2448022 enrolled? " + studRollno.contains(2448022));

        //Removing from the hash set
        System.out.println("\n Removing the student 2448025 because he is ineligible");
        studRollno.remove(2448025);
        System.out.println("\nStudent list after removing"+studRollno);

        //Outputing the total number elements in the Hash Set
        System.out.println("Number of students enrolled: "+studRollno.size());
        for(Integer str:studRollno){
            System.out.println(str);
        }


    }
}
