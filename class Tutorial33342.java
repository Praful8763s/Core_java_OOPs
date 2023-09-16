class Tutorial33342 {
    public static void main(String[] args) {
        try {

            int divideByZero = 5 / 0;
            System.out.println("rest of code in try block");
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("ArithmeticException =>" + e.getMessage());
        } finally {
            System.out.println("this is a finally block");
        }
    }
}