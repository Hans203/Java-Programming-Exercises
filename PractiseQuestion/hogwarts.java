import java.util.*;

class wizard {
    String name;
    String house;

    wizard(String name, String house) {
        this.name = name;
        this.house = house;
    }

    public void display() {
        System.out.println(name + " has been sorted into " + house);
    }
}

class house {
    private int pts;
    private String name;

    house(int points, String name) {
        this.pts = points;
        this.name = name;
    }

    public void display() {
        System.out.println(this.name + ": " + this.pts);
    }

    public static String sortinghat(String[] houses) {
        Random random = new Random();
        int randomIndex = random.nextInt(houses.length);
        return houses[randomIndex];
    }

    public void updatepts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the points to be added or deducted: ");
        int point = sc.nextInt();
        pts += point;
        System.out.println(name+" wins "+point+" points Congratulations!!.");
    }
}

public class hogwarts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        house gryf = new house(8, "Gryffindor");
        house slyt = new house(1, "Slytherin");
        house huff = new house(4, "Hufflepuff");
        house raven = new house(3, "Ravenclaw");
        String houses[] = {"Gryffindor", "Slytherin", "Hufflepuff", "Ravenclaw"};

        System.out.println("Hogwarts House Points");
        gryf.display();
        slyt.display();
        huff.display();
        raven.display();

        wizard wiz1 = new wizard("Harry Potter", "Gryffindor");
        wizard wiz2 = new wizard("Ron Weasly", "Hufflepuff");
        System.out.println("***************\n");
        System.out.println("Enrolled Wizards");
        wiz1.display();
        wiz2.display();
        System.out.println("***************\n");
        System.out.println("Wizard Management");

        System.out.print("Name of the new wizard: ");
        String name = sc.nextLine();
        System.out.println();
        String wizhouse = house.sortinghat(houses);
        wizard wiz3 = new wizard(name, wizhouse);
        wiz3.display();

        System.out.println("\nWould you like to assign points to any wizards?\n(Enter 'y' to update or any other key to exit)");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            System.out.println("Select the Wizards: \n1. " + wiz1.name + "\n2. " + wiz2.name + "\n3. " + wiz3.name);
            String ch = sc.nextLine();
            switch (ch) {
                case "1":
                    if (wiz1.house.equalsIgnoreCase("Gryffindor"))
                        gryf.updatepts();
                    if (wiz1.house.equalsIgnoreCase("Slytherin"))
                        slyt.updatepts();
                    if (wiz1.house.equalsIgnoreCase("Hufflepuff"))
                        huff.updatepts();
                    if (wiz1.house.equalsIgnoreCase("Ravenclaw"))
                        raven.updatepts();
                    break;
                case "2":
                    if (wiz2.house.equalsIgnoreCase("Gryffindor"))
                        gryf.updatepts();
                    if (wiz2.house.equalsIgnoreCase("Slytherin"))
                        slyt.updatepts();
                    if (wiz2.house.equalsIgnoreCase("Hufflepuff"))
                        huff.updatepts();
                    if (wiz2.house.equalsIgnoreCase("Ravenclaw"))
                        raven.updatepts();
                    break;
                case "3":
                    if (wiz3.house.equalsIgnoreCase("Gryffindor"))
                        gryf.updatepts();
                    if (wiz3.house.equalsIgnoreCase("Slytherin"))
                        slyt.updatepts();
                    if (wiz3.house.equalsIgnoreCase("Hufflepuff"))
                        huff.updatepts();
                    if (wiz3.house.equalsIgnoreCase("Ravenclaw"))
                        raven.updatepts();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }

        System.out.println("Updated Hogwarts House Points");
        gryf.display();
        slyt.display();
        huff.display();
        raven.display();
    }
}
