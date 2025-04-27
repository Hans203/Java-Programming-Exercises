//2448021_Lab1

public class civilwar{
	String av1,av2,av3;
    int num1,num2,num3;
	civilwar(String x, String y, String z , int a, int b, int c){
		av1 = x;
		av2 = y;
		av3 = z;
        num1 = a;
        num2 = b;
        num3 = c;
    }
    public static boolean prime(int n){
        int c=0;
        for(int i=1; i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean palin(int n){
        int d = n;
        int rev = 0;
        while(d>0){
            int r = d%10;
            rev=rev*10+r;
            d=d/10; 
        }
        if(n==rev)
            return true;
        else
            return false;
    }
	public String duel(String a, String b, int num1, int num2){
        if((prime(num1)||palin(num1))&&(prime(num2)||palin(num2)))
            return "Tie";
        else if(prime(num1)||palin(num1)){
            return a+" wins";
        }
        else if(prime(num2)||palin(num2)){
            return b+" wins";
        }
        else
            return "No winner";
    }
}
