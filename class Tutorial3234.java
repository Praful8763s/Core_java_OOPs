import java.util.*;

class Tutorial3234 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int m = ac.nextInt();
        System.out.println("enter the number of column");
        int n = ac.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
