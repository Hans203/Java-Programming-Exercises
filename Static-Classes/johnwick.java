class JohnWick {
    static String name = "John Wick";
    static String reputation = "Baba Yaga";
    String status;

    public JohnWick(String status) {
        this.status = status;
    }

    public void retrieveWeapons() {
        System.out.println(name + " is retrieving his weapons.");
    }

    public void checkInContinental() {
        System.out.println(name + " is checking in at the Continental.");
    }

    public static void displayReputation() {
        System.out.println(name + " is known as " + reputation);
    }
}

class ContinentalHotel {
    static String name = "The Continental";
    static String location = "New York City";
    Manager manager;

    public ContinentalHotel(String managerName) {
        this.manager = new Manager(managerName);
    }

    public void enforceRules() {
        System.out.println("No business (killing) is allowed on the premises of " + name);
    }

    public void manageGuests() {
        System.out.println("Managing guests at " + name + " in " + location);
    }

    class Manager {
        String managerName;

        public Manager(String managerName) {
            this.managerName = managerName;
        }

        public void handleIssues() {
            System.out.println(managerName + " is handling issues at " + name);
        }
    }
}

class HighTable {
    static String organizationName = "The High Table";
    MemberRole member;

    public HighTable(String roleName, String memberName) {
        this.member = new MemberRole(roleName, memberName);
    }

    public void makeDecisions() {
        System.out.println(organizationName + " is making decisions.");
    }

    public void issueCommands() {
        System.out.println(organizationName + " is issuing commands.");
    }

    class MemberRole {
        String roleName;
        String memberName;

        public MemberRole(String roleName, String memberName) {
            this.roleName = roleName;
            this.memberName = memberName;
        }

        public void giveOrder() {
            System.out.println(memberName + " as " + roleName + " is giving an order.");
        }
    }
}

public class johnwick {
    public static void main(String[] args) {
        JohnWick johnWick = new JohnWick("Active");
        johnWick.retrieveWeapons();
        johnWick.checkInContinental();
        JohnWick.displayReputation();

        ContinentalHotel continental = new ContinentalHotel("Winston");
        continental.enforceRules();
        continental.manageGuests();
        continental.manager.handleIssues();

        HighTable highTable = new HighTable("Chairman", "The Elder");
        highTable.makeDecisions();
        highTable.issueCommands();
        highTable.member.giveOrder();
    }
}
