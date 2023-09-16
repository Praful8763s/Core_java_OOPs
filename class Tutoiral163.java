class Tutoiral163 {
    public static void main(String[] args) {
        int i;
        float fact = 1.0, res;
        float n_res = 0;

        for (i = 1; i < 8; i++) {
            // find factorial for 1 to 7
            fact = fact * i;

            // find the i/factof(i)
            res = i / fact;

            // add all the results
            n_res = n_res + res;
        }

        System.out.println(n_res);
    }
}