import java.io.*;
class doraemon{
    public static void main(String[] args){
        String filePath = "DoraemonPouch.txt";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
            FileWriter FW = new FileWriter(filePath, true);
            FileReader FR = new FileReader(filePath);
            int choice;
            do { 
                System.out.println("\nDoraemon's Pouch Mangement");
                System.out.println("1. Add a new Widget\n2. View all Widgets\n3. Exit");
                choice = Integer.parseInt(reader.readLine());
                if(choice==1){
                    System.out.print("New Gadget: ");
                    String n = reader.readLine();
                    FW.write("\n"+n);
                    FW.flush();
                    System.out.println("Successfully added to Pouch");
                    int character;
                    while ((character = FR.read()) != -1) {
                        System.out.print((char) character);
                    }
        
                }else if(choice==2){
                    int character;
                    while ((character = FR.read()) != -1) {
                        System.out.print((char) character);
                    }
        
                }
                else{
                    System.out.println("Don't rely on doraemon for everything pleasee...");
                }
                
            } while (choice!=3);

        } catch (Exception e) {
            System.out.println("Please check your input and try again");
        }


    }
}