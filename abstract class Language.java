abstract class Language {
    // method of absrtract class
    public void display() {
        System.out.println("this is java programming");
    }
}

class Main extends Language {
    public static void main(String[] args) {
        Main j1 = new Main();
        j1.display();
    }
}