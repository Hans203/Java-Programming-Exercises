import java.io.*;
public class Activity1 {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
            System.out.println("Enter your name");
            String name = reader.readLine();
            System.out.println("Enter your Registration Number");
            int regno = Integer.parseInt(reader.readLine());
            System.out.println("Enter your attendence");
            int attend = Integer.parseInt(reader.readLine());
            writer.write("Name: "+name+" \nRegistration Number: "+regno+" \nMarks: "+attend);
            writer.newLine();
            
            if(attend>85){
                writer.write("Hurray you are eligible to write EndSem Exam");
            }
            writer.newLine();
            writer.flush();
    
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
}

