import java.util.*;

class Tutorial797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the geogerian calendre date");
        int year = sc.nextInt();
        if (year % 4 == 0 && year / 400 == 0) {
            System.out.println("this is gerogerian calendra");

        } else {
            System.out.println("not a gerogerian calenra");
        }
    }
}