
import java.util.Scanner;

public class edabit2 {
    public static int count(int n){
        if(n<10&&n>-10){
            return 1;
        }
        else{
            return count(n/10)+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        System.out.println(count(n));
    }
}
