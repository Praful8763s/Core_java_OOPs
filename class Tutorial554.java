public class Tutorial554 {
    public static void printArray(int arr[]) {
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int arr[] = { 3, 2, 4, 5, 1, 7, 9, 8, 10, 6 };
        // inner loops
        //
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
        }

        printArray(arr);
    }
}