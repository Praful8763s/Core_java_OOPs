abstract class Animal {
    abstract void walk();

}

class Horse
extend Animal
{

    public void walk() {
        System.out.println("horse walk on four leg");
    }
}

class Chicken
extend Animal{

    public void walk() {
        System.out.println("chicken walk on two leg");
    }
}

class Tutorial444 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        Chicken chicken = new Chicken();
        chicken.walk();

    }
}
