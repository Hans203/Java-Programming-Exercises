
import java.util.Scanner;

class superheroes{
    String name, charac, team;
    String[] abilities;
    superheroes(String name, String charac, String team, String[] abilities){
        this.name = name;
        this.charac = charac;
        this.team =team;
        this.abilities = abilities;
    }
    public void display(){
        System.out.println(charac+" ("+name+")->  part of "+team+". He has the following abilities: ");
        for(int i=0;i<abilities.length;i++){
            System.out.print(abilities[i]+", ");
        }
        System.out.println();
        System.out.println("****************************************************************************\n");
    }

}
class MissionManagement{
    String participants[] = new String[3];
    String name, diff, status;

    public MissionManagement(String name,  String difficulty, String stat) {
        this.name=name;
        this.diff = difficulty;
        this.status = stat;
    }
    private static int nullval(String a[]){
        int c = 0;
        for(int i = 0;i<5;i++){
            if(a[i]==null){
                c++;
            }
        }
        return c;
    }
    public void insert(String[] a){
        participants = a;
    }
    public void option(String characters[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the option to update.\n1.Participants\n2.Status");
        int choice = sc.nextInt();
        if(choice==1){
            if(participants.length==3){
                System.out.println("The maximum number of participants has reached.");
            }
            else{
                update(participants.length, characters);
            }
        }
        else if(choice==2){
            update();
        }
    }
    private void update(){
        String statusli[]={"pending", "in-progress", "completed"};
        int c=0;
        for(int i=0;i<statusli.length;i++){
            if (status ==statusli[i]) {
                c=i;
            }
        }
        if(c==2){
            System.out.println("The mission is already completed");
        }
        else{
            status = statusli[c+2];
            System.out.println("Successfully updated");
        }
        System.out.println();
    }
    private  void update(int a, String characters[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Current participants: ");
        for(int i =0; i<participants.length;i++){
            System.out.println(participants[i]+", ");
        }
        System.out.println("Enter the new participant");
        String n = sc.nextLine();
        String dup[] = new String[5];
        dup[0] = n;
        for(int i =1;i<a+1;i++){
            dup[i] = participants[i-1];
        }
        participants=dup;
    }
    public void update(String a){
        status = a;
    }
    public void display(){
        System.out.println("Mission "+name+": This is a highly classified "+diff+" difficulty mission which is "+status+". The participants in the mission are: ");
        for(int i =0; i<participants.length;i++){
            if(participants[i]==null)
                continue;
            else
                System.out.print(participants[i]+", ");
        }
        System.out.println("\n");
        // System.out.println("\n\t*********************************************************************************");
    }
}

class Marveldriver{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String abIM[] = {"flying", "shooting" ,"repulsor beams", "super intelligence "};
        superheroes ch1 = new superheroes("Tony Stark", "Iron Man", "Avengers", abIM);

        String abTh[] = {"Thunder and Lightning", "Superhuman Strength" ,"Flight"};
        superheroes ch2 = new superheroes("Thor Odinson", "Thor-God of Thunder", "Avengers", abTh);

        String abHu[] = {"Limitless Superhuman Strength", "Invulnerability" ,"Rapid Healing Factor", "Rage Storm"};
        superheroes ch3 = new superheroes("Bruce Banner", "Hulk", "Avengers", abHu);
        System.out.println("\nSuperHero Details\n");
        ch1.display();
        ch2.display();
        ch3.display();

        String characters[] = {ch1.charac, ch2.charac, ch3.charac};

        MissionManagement M1 = new MissionManagement("Ultron's Revenge", "High","Pending");
        String M1Participants[]  ={ch1.charac, ch2.charac, ch3.charac};
        M1.insert(M1Participants);
        MissionManagement M2 = new MissionManagement("Alien Invasion", "Medium", "In-Progress");
        String M2Participants[]  ={ch1.charac, ch2.charac};
        M2.insert(M2Participants);
        MissionManagement M3 = new MissionManagement("Endgame", "Hell", "In-Progress");
        String M3Participants[]  ={ch2.charac};
        M3.insert(M3Participants);
        System.out.println("Current Missions");
        System.out.println("*****************");
        M1.display();
        M2.display();
        M3.display();
        try {
            System.out.println("Would you like to update any of the missions, Press '1' to update click any other key to exit.");
            int choice = sc.nextInt();
            if(choice==1){
                System.out.println("Choose the mission to update: \n1. Ultron's Revenge\n2. Alien Invasion\n3. Endgame\nChoose either(1/2/3)");
                int choice2 = sc.nextInt();
                switch(choice2){
                    case 1: 
                    M1.option(characters);
                    M1.display();
                    break;
                    case 2:
                    M2.option(characters);
                    M2.display();
                    break;
                    case 3:
                    M3.option(characters);
                    M3.display();
                    break;
                    default: System.out.println("Enter either 1/2/3"); 
                    }
                }
            
        } catch (Exception e) {
            System.exit(0);
        }
        


        }
        
    }
