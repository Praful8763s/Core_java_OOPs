import java.util.*;

class Tutorial168 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            int t = n * i;
            System.out.println(t);
        }
    }
}