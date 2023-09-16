class Student {
    String name;
    /**
     *
     */
    int age;
    int marks;

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public void display(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

}

class Student1 extends Student {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "praful";
        s1.age = 24;
        s1.marks = 79;
        // s1.display();
        System.out.println(s1.display());
    }
}