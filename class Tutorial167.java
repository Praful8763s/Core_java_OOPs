class Tutorial167 {
    public static void main(String[] args) {

        int i, j = 3, k = 4, l;

        for (i = 1; i < 20; i++) {
            for (l = 1; l < 41; l++) {
                if (i % 2 != 0)
                    System.out.println(j);
                else if (i % 2 == 0)
                    System.out.println(k);
            }
        }

    }
}