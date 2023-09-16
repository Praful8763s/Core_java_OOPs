abstract class Student {

    public void display() {
        System.out.println("my namee is java programming");
    }
}

class Student1 extends Student {
    String name;
    int age;
    int marks;

    public void display() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.marks);
    }
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        Student s3 = new Student();
        //s.display();
        //Student1 s1 = new Student1();
        s1.name = "Pritesh";
        s1.age = 24;
        s1.marks = 87;
        s1.display();
        s2.name ="Praful";
        s2.age = ""
    }
}

