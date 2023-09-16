
import java.util.*;
class Prime_Number {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int flag =0;
        for(int i=0; i<=n; i++)
        {
            if(n%i==0){
                System.out.println("prime number");
            }
            else {
                System.out.println("not prime no");
            }
        }
    }
}