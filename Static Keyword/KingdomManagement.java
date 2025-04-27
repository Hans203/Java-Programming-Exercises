class Kingdom {
    private static String ruler;
    private static final String kingdom = "Mahishmati";
    private static int totalWarriors = 0;

    static {
        ruler = "Amarendra Baahubali";
        System.out.println("Kingdom Management System for "+kingdom);
        System.out.println("All hail "+ruler+" Bow down to the King of Mahishmati.");
    }

    public static void displayStatus() {
        System.out.println("Kingdom: " + kingdom);
        System.out.println("Ruler: " + ruler);
        System.out.println("Total Warriors: " + totalWarriors);
    }

    public static void incrementWarriorCount() {
        totalWarriors++;
    }
}

class Warrior {
    private String name;
    private String rank;

    public Warrior(String name, String rank) {
        this.name = name;
        this.rank = rank;
        Kingdom.incrementWarriorCount();
    }

    public void displayWarriorDetails() {
        System.out.println("Warrior Name: " + name);
        System.out.println("Warrior Rank: " + rank);
    }
}

class KingdomManagement {
    public static void main() {
        Kingdom.displayStatus();

        Warrior warrior1 = new Warrior("Kattappa", "General");
        Warrior warrior2 = new Warrior("Bhallaladeva", "Prince");
        Warrior warrior3 = new Warrior("Devasena", "Warrior Queen");
        Warrior warrior4 = new Warrior("Smrity", "Army General");
        warrior1.displayWarriorDetails();
        warrior2.displayWarriorDetails();
        warrior3.displayWarriorDetails();
        Kingdom kingdom = new Kingdom();
        kingdom.displayStatus();
        Kingdom.displayStatus();
    }
}
