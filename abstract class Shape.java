abstract class Shape {
    public void display() {
        System.out.println("circle");
    }

}

class Union extends Shape {
    public static void main(String[] args) {
        Union n1 = new Union();
        n1.display();

    }
}
