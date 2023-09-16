import java.util.*;
//import java.util.Arrays;

class Array {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = count;
            count++;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + " ");
        }
        System.out.println();
    }
}