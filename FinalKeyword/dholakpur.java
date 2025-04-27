import java.util.*;
final class RoyalRules{
    public void rules(){
        System.out.println("Rules of Dholakpur");
        System.out.println("Rule No 1: No one deshame the King");
        System.out.println("Rule No 2: No Smoking");
        System.out.println("Rule No 3: Violence against women will not be tolerated");
    }
}
class King{
    private final String kingname;
    King(String name){
        kingname =  name;
    }
    public void display(){
        System.out.println("All hail KING "+kingname+" and long live KING "+kingname);
    }
}
class warrior{
    private String name;
    private int age;
    private String style;
    warrior(String name, int age, String style){
        this.name = name;
        this.age = age;
        this.style = style;
    }
    public void fightingstyle(){
        System.out.println(name+" attacks with fighting style: "+style);
    }
}
class chottaBheem extends warrior{
    public chottaBheem() {
        super("Chotta Bheem", 25, "Eating laddooos");
    }
    @Override
    public void fightingstyle(){
        System.out.println("Chotta bheem the hero of Dholakpur fights with the fighting style: Eating laddooos");
    }
}
class Kalia extends warrior{
    public Kalia() {
        super("Kalia", 25, "Trash talking");
    }
}
class dholakpur{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        RoyalRules rule = new RoyalRules();
        rule.rules();
        King king = new King("Raja Indraverma");
        king.display();
        warrior bheem = new chottaBheem();
        warrior kalia = new Kalia();
        bheem.fightingstyle();
        kalia.fightingstyle();
        System.out.println("To add a warrior enter y or else enter any other character to exit");
        String ch = sc.nextLine();    
        if(ch.equalsIgnoreCase("y")){
            System.out.print("Name of the warrior:");
            String name = sc.nextLine();
            System.out.print("\nAge of the warrior: ");
            int age = sc.nextInt();
            System.out.print("\nFighting style: ");
            String style = sc.nextLine();
            warrior w1 = new warrior(name, age, style);
            w1.fightingstyle();
        }
        else{
            System.exit(0);
        }
    }

}