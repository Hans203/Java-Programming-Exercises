//2448021_Lab1
import java.util.Scanner;
public class civilwardriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Three Avengers");
        String av1 = sc.nextLine();
        String av2 = sc.nextLine();
        String av3 = sc.nextLine();
        int n1, n2, n3;
        try{
            System.out.println("Enter battle points for the three Avengers");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            n3 = sc.nextInt();
        civilwar war = new civilwar(av1, av2, av3, n1, n2,n3);
        System.out.println("Available duels: ");
        System.out.println("1. "+av1+"/"+av2);
        System.out.println("2. "+av1+"/"+av3);
        System.out.println("3. "+av2+"/"+av3);
        System.out.print("Select your preferred duel: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1 -> System.out.println("The outcome of the great battle between "+av1+" and "+av2+" : "+war.duel(av1, av2, n1, n2));
            case 2 -> System.out.println("The outcome of the great battle between "+av1+" and "+av3+" : "+war.duel(av1, av3, n1, n3));
            case 3 -> System.out.println("The outcome of the great battle between "+av2+" and "+av3+" : "+war.duel(av2, av3, n2, n3));
            default -> System.out.println("Please enter 1/2/3");
        }
        }catch(java.util.InputMismatchException e){
            System.out.println("Only Integers are Accepted");
        }
    }
}

