class Employee
{
   String name;
   String post;
   int age;
   int salary;
   String position;
   public void printInfo()
   {
    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(this.post);
    System.out.println(this.salary);
    System.out.println(this.position);


   }
}
class Tutorial334
{
    public static void main(String [] args)
    {
        Employee e1 = new Employee();
        e1.name = "Praful Sonwane";
        e1.age = 23;
        e1.post "Manager";
        e1.salary = 24000;
        e1.position ="director";
        e1.printInfo();
    }
}