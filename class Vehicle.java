class Vehicle {
    String name;
    String metal_name;
    int cost;
    int tyre;
}

class Car extends Vehicle {
    public void display() {
        System.out.println(this.name);
        System.out.println(this.metal_name);
        System.out.println(this.cost);
        System.out.println(this.tyre);
    }
}

class Bike extends Vehicle {
    public void display() {
        System.out.println(this.name);
        System.out.println(this.metal_name);
        System.out.println(this.cost);
        System.out.println(this.tyre);
    }
}

class Tutorial3422 {
    public static void main(String[] args) {
        Car c = new Car();
        c.name = "maruti ";
        c.metal_name = "steal";
        c.cost = 342222;
        c.tyre = 4;
        Bike b = new Bike();
        b.name = "hero glamour";
        b.metal_name = "iron";
        b.cost = 34000;
        b.tyre = 2;
        c.display();
        b.display();
    }
}