class Student {
    String name;
    int age;
    int marks;
    int roll_no;
}

class Student1 extends Student {
    public void display() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.marks);
        System.out.println(this.roll_no);
    }
}

class Student2 extends Student {
    public void display() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.marks);
        System.out.println(this.roll_no);
    }
}

class Tutorial1003 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "Praful Sonwane";
        s1.age = 24;
        s1.marks = 84;
        s1.roll_no = 10042;
        Student2 s2 = new Student2();
        s2.name = "Aarti Thosare";
        s2.age = 21;
        s2.marks = 74;
        s2.roll_no = 11002;
        s1.display();
        s2.display();
    }
}