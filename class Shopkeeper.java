class Shopkeeper {
    String name;
    String product_name;
    int quantity;

    public void display() {
        System.out.println(this.name);
        System.out.println(this.product_name);
        System.out.println(this.quantity);

    }
}

class Tutorial2345 {
    public static void main(String[] args) {
        Shopkeeper k1 = new Shopkeeper();
        k1.name = " tapti kirana";
        k1.product_name = "maggi";
        k1.quantity = 24;
        k1.display();

    }
}