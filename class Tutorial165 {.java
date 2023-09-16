class Tutorial165 {
    public static void main(String arg[]) {
        int i, j, k, sp;

        // print 7th row
        for (i = 0; i <= 6; i++) {
            for (j = 65; j <= 71 - i; j++) // loop for first half
            {
                System.out.print(j);

            }

            // add space between these string
            for (sp = 1; sp <= i * 2 - 1; sp++)
                System.out.println(" ");

            for (k = 71 - i; k >= 65; k--) // loop for next half (Second half)
            {
                if (k == 71)
                    ;
                else
                    System.out.print(k);
            }

            System.out.println();
        }
    }

}
