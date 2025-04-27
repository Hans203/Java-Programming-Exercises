
import java.util.Scanner;

public class characterelements{
    String name,title, ability1, ability2, ability3, element;
    int age;
    characterelements() {
        name = "Aang";
        age = 12;
        element = "Air";
        ability1 = "Airbending";
        ability2 = "Air Slash";
        ability3 = "";
        title = "Air Marshal";
    }
    characterelements(String name,String ability1, String ability2, String ability3, String title, int age, String element){
        this.name = name;
        this.age = age;
        this.element = element;
        this.ability1 = ability1;
        this.ability2 = ability2;
        this.ability3 = ability3;
        this.title = title;
    }
    private static String inp(){
        Scanner sc= new Scanner(System.in);
        return sc.nextLine();
    }
    public void update(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'Y' to update abilities and 'N' to update element");
        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("y")){
            System.out.println("Choose the ability to update(1/2/3): \nAbility 1: "+ability1+" Ability 2: "+ability2+" Ability 3 "+ability3);
            int choice2 = sc.nextInt();
            switch(choice2){
                case 1:
                System.out.print("Ability 1: ");
                ability1  = inp();
                break;
                case 2:
                System.out.print("Ability 2: ");
                ability1  = inp();
                break;
                case 3:
                System.out.print("Ability 3: ");
                ability1  = inp();
                break;
                default:
                System.out.println("Invalid Input");
                break;
            }
        }
        else if(choice.equalsIgnoreCase("N")){
            System.out.print("Current element:"+element+" \nNew Element:");
            element = sc.nextLine();
        }
        display();

    }
    public void display(){
        String abilities="";
        if(ability1!=null){
             abilities+=ability1+", ";
        }
        if(ability2!=null){
            abilities+=ability2+", ";
        }
        if(ability3!=null){
        abilities+=ability3+" ";
        }
        System.out.println(name+" is a "+age+" year old mage having "+element+" core. He has the following abilities "+abilities+"and has the title '"+title+"'");
    }
    
}
