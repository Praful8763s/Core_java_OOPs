class Wwe {
    String name;
    int age;
    String championship_name;
    String nick_name1;
    String nick_name2;

    public void display() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.championship_name);
        System.out.println(this.nick_name1);
        System.out.println(this.nick_name2);
    }
}

class Tutorial1033 {
    public static void main(String[] args) {
        Wwe w1 = new Wwe();
        w1.name = "Roman Reign";
        w1.age = 36;
        w1.championship_name = "Undisputed wwe universal Championship";
        w1.nick_name1 = "Head of Table";
        w1.nick_name2 = "Tribal chief";
        w1.display();
        Wwe w2 = new Wwe();
        w2.name = "Seth Rollins";
        w2.age = 34;
        w2.championship_name = "No";
        w2.nick_name1 = " The architect";
        w2.nick_name2 = "The visionary";
        w2.display();
        Wwe w3 = new Wwe();
        w3.name = "Dean Ambrose";
        w3.age = 32;
        w3.championship_name = "AEW world heavyweight champion";
        w3.nick_name1 = "Lunent frinch";
        w3.nick_name2 = "John Moxley";
        w3.display();
        var w4 = new Wwe();
        w4.name = "The shield";
        w4.age = 68;
        w4.championship_name = "Tag team Championship";
        w4.nick_name1 = " no";
        w4.nick_name2 = "The bloodline";
        w4.display();
    }
}