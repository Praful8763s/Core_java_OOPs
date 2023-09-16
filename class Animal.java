class Animal {
    String name;
    String walk;
    int leg;
}

class Dog extends Animal {
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.walk);
        System.out.println(this.leg);
    }
}

class Chicken extends Animal {
    public void printInfo() {
        System.out.println(this.name);

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", walk='" + getWalk() + "'" +
            ", leg='" + getLeg() + "'" +
            "}";
    }
        System.out.println(this.walk);
        System.out.println(this.leg);

    }
}

class OOPS {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Tomy";
        d1.walk = "fast";
        d1.leg = 4;
        d1.printInfo();
        Chicken c1 = new Chicken();
        c1.name = " puspa";
        c1.walk = "slow";
        c1.leg = 2;
        c1.printInfo();
        System.out.println();

    }
}