
import java.util.Scanner;

public class edabit3 {
    public static int[] Balances(String a[], String b[]){
        int p1=3, p2=3;
        for(int i=0; i<a.length; i++){
            if(a[i].equals("share") && b[i].equals("share")){
                p1-=1;
                p1+=3;
                p2-=1;
                p2+=3;
            }
            else if (a[i].equals("share") && b[i].equals("steal")) {
                p1-=1;
                p2+=3;
            }
            else if (a[i].equals("steal") && b[i].equals("share")) {
                p2-=1;
                p1+=3;
            }
    }
    int[] k = {p1, p2};
    return k;
}
public static String[] inp(String[] a){
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<a.length;i++){
        a[i] = sc.nextLine().toLowerCase();
    }
    return a;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of turns");
        int k = sc.nextInt();
        String[] a = new String[k];
        String[] b = new String[k];
        System.out.println("Person 1");
        String[] c = inp(a);
        System.out.println("Person 2");
        String[] d = inp(b);
        int ans[] = Balances(c, d);
        for(int j=0; j<2; j++){
            System.out.print(ans[j]+" ");
        }


    }
}
