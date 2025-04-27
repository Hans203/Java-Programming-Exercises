import java.util.Scanner;
class elementalwarriors{
    public static String inp(){
        Scanner sc= new Scanner(System.in);
        return sc.nextLine();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        characterelements ch1 = new characterelements();
        characterelements ch2 = new characterelements("Zuko", "Flame Thrower", "Flame Burst", "Flame ring", "Fire Lord", 16,"Fire");
        characterelements ch3 = new characterelements("Katara", "Water Bending", null, null,"Water Maiden", 14, "Water");
        System.out.println("\nWelcome To Mage Land Character Management");
        System.out.println("********************************************");
        
        boolean flag=true;
        try {
            while(flag==true){
                System.out.println("Character Management Tools");
                System.out.println("1. Display available characters");
                System.out.println("2. Insert new Character");
                System.out.println("3. Update character details");
                System.out.println("4. Exit ");
        
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                    System.out.println("\nOur available Characters\n");
                    ch1.display();
                    System.out.println("");
                    ch2.display();
                    System.out.println("");
                    ch3.display();
                    System.out.println("");
                    break;
                    case 2:
                    System.out.println("Enter the following details");
                    System.out.print("Name: ");
                    String name = inp();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    System.out.print("Title: ");
                    String title = inp();
        
                    System.out.print("Element: ");
                    String element = inp();
                    System.out.print("Ability 1: ");
                    String ability1 = inp();
                    System.out.print("Ability 2: ");
                    String ability2 = inp();
                    System.out.print("Ability 3: ");
                    String ability3 = inp();
        
                    characterelements ch4 = new characterelements(name, ability1, ability2, ability3, title, age, element);
                    ch4.display();
                    flag=false;
                    break;
                    case 3:
                    System.out.println("Choose the character to update");
                    System.out.println("1. "+ch1.name+"\n2. "+ch2.name+"\n3. "+ch3.name+"\nChoose (1/2/3)");
                    int n = sc.nextInt();
                    if(n==1)
                        ch1.update();
                    if(n==2)
                        ch2.update();
                    if(n==3)
                        ch3.update();
                    flag=false;
                    break;
                    case 4:
                    flag=false;
                    break;
                    default:
                    System.out.println("Invalid Input");
                    break;
                }
                }
            
        } catch (Exception e) {
            System.out.println("Please enter non-String values");
        }
        
    }
}
