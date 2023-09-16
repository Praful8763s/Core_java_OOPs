class Tutorial123456 {
    public static void main(String[] args) {
        try {
            int multiplyByzero = 0 / 5;
            System.out.println("this is a try block");
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("ArithmeticException =>" + e.getMessage());
        } finally {
            System.out.println("finaaly block");
        }
    }
}