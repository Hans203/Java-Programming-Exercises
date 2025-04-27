
import java.util.Scanner;

class edabit1 {
    public static boolean check(int n){
        for(int i=n; i>0; i=i/10){
            int r=i%10;
            if(r==7){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[6];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<6; i++){
            a[i] = sc.nextInt();
        }
        boolean flag = false;
        for(int i=0;i<6;i++){
            if(check(a[i])){
                System.out.println("Boom!");
                flag=true;
            }
        }
        if(!flag){
            System.out.println("There is no 7 in the array");
        }
    }
}
