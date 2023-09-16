class Tutorial99 {
    private static int fact;

    public static void printFactorial(int n, int fact) {

        if (fact == 1) {

            fact = fact * n(n - 1);
            return;
        }

        System.out.println(fact);
        printFactorial(n - 1, fact);
    }

    public static void main(String[] args) {
        int n = 5;

        fact = 1;
        printFactorial(5, fact);
    }

}
