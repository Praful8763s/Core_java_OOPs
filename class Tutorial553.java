class Tutorial553 {
    public static void printArray(int a[]) {
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = { 3, 4, 2, 1, 5, 6, 9, 7, 8, 10 };
        for (int i = 0; i < a.length - i - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                a[j + 1] = a[j];
            }
            int temp = a[i + 1];
            a[i + 1] = a[i];
            a[i] = temp;
        }

        printArray(a);
    }
}
