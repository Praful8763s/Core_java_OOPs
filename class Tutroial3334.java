import java.util.*;

class Tutroial3334 {
    public static void main(String[] args) {
        int a = 10;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = s.nextInt();
        System.out.println("enter the number of column");
        int m = s.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (j <= a) {
                    System.out.print(j);
                } else {
                    System.out.print("11");
                }
                System.out.print(" ");

            }
            System.out.println();
        }
    }

}
