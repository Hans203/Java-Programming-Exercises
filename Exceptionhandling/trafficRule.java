import java.util.*;
import java.util.regex.*;
class speedException extends Exception{
    public speedException(String message){
        super(message);
    }
}
class UnauthorizedError extends Exception{
    public UnauthorizedError(String message){
        super(message);
    }
}
class vehicle{
    private String vehicleNumber;
    private float speed;
    private String redlightJump;
    public vehicle(String name, float speed, String redlightJump){
        vehicleNumber = name;
        this.speed = speed;
        this.redlightJump = redlightJump;
    }
    public void checkTrafficViolation() throws speedException{
        try {
            if(speed<=60 && redlightJump.equalsIgnoreCase("No")){
                throw new speedException(vehicleNumber+" | "+speed+" | "+redlightJump+" | No Violation");
            } 
            if (speed>60){
                throw new speedException(vehicleNumber+" | "+speed+" | "+redlightJump+" | Challan Issued: Overspeeding");
            } 
            if(redlightJump.equalsIgnoreCase("Yes")){
                throw new speedException(vehicleNumber+" | "+speed+" | "+redlightJump+" | Challan Issued: Red Light Jump");
            }
        } catch (speedException e) {
            System.out.println(e.getMessage());
        }


    }
    public void unexpectedError() throws UnauthorizedError{
       Pattern pattern = Pattern.compile("^[A-Z]{2}\\d{2}[A-Z]{2}\\d{4}$");
        Matcher matcher = pattern.matcher(vehicleNumber);
        
        if (!matcher.matches()) {
            throw new UnauthorizedError(vehicleNumber+" | "+speed+" | "+redlightJump+" | UnauthorizedVehicleException: No Number Plate");
    }
}
}
class trafficRule{
    public static String inp(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static float  flo(){
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vehicle details below: ");
        vehicle[] car = new vehicle[3];
        for(int i=0; i<3;i++){
            System.out.println("\nVehicle Entry No: "+(i+1));
            System.out.print("Vehicle Number: ");
            String Vnumb = inp().toUpperCase();
            System.out.print("Speed: ");
            float speed = flo();
            System.out.print("Red Light Jump: ");
            String rlJump = inp();
            car[i] = new vehicle(Vnumb, speed, rlJump);
        }
        

        for (vehicle v : car) {
            try {
                v.unexpectedError(); // Check unauthorized errors
            } catch (UnauthorizedError e) {
                System.out.println(e.getMessage());
            }

            try {
                v.checkTrafficViolation(); // Check traffic violations
            } catch (speedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
