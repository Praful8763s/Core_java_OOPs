class Tutorial423 {
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int a[] = { 3, 4, 2, 6, 1, 5, 7, 9, 8, 10 };
        // inner loops
        // insertion sort
        for (int i = 0; i < a.length - 1; i++) {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && current < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = current;

        }
        printArray(a);
    }
}