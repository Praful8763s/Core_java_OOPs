public class Employee {
    String name;
    int age;
    int salary;

    String subject;

}

public class Teacher1 extends Employee {
    public void display() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.salary);
        System.out.println(this.subject);

    }
}

public class Teacher2 extends Employee {
    public void display() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.salary);
        System.out.println(this.subject);
    }
}

public class Tutorial1034 extends Employee {
    public static void main(String[] args) {
        Teacher1 t1 = new Teacher1();
        t1.name = "Umesh Gupta";
        t1.age = 25;
        t1.salary = 25000;
        t1.subject = "Enginnering Drawing";
        Teacher2 t2 = new Teacher2();
        t2.name = "Jaishree Purohit";
        t2.age = 30;
        t2.salary = 30000;
        t2.subject = "Engineering chemistry";
        t1.display();
        t2.display();
    }
}