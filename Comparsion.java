import java.util.*;
class Comparsion
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a<b){
            System.out.println("a is  then largest no of b");
        }
        else if(b<c)
        {
            System.out.println("b is largest then c");
        }
        else {
            System.out.println("c is largest no of a");
        }
    }
}
