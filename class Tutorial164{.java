class Tutorial164 {
    public static void main(String[] args) {
        int i, j, k; // for three numbers 1, 2 and 3

        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++) {
                for (k = 1; k <= 3; k++) {

                    // First Method
                    // printf("%d%d%d\n", i, j, k);

                    // Second Method
                    // for removing repeated numbers we have to apply a condition (using if)

                    if (i != j && i != k && j != k) {
                        System.out.print(i);
                        System.out.print(j);
                        System.out.print(k);
                    }
                    System.out.print(" ");

                }
                System.out.println();

            }
        }
    }
}
