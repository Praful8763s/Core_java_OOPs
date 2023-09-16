class Tutorial35 {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 10, 4, 6, 12, 8, 14, 18, 16, 20 };
        // insertion sort
        // inner loops
        System.out.println("time complexity of insertion sort is O(n^2)");
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = current;

        }
        printArray(arr);
    }
}
