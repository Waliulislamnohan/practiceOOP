public class Person {
    String name;
    int age;
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public Person()
    {
      name="Srk";
      age=21;  
    }
    public Person(int y)
    {
    age=y;
    }
    public static void main (String args []) {
        Person p1= new Person("Zerin",12);
        Person p2= new Person("Nazafi",10);
        Person p3= new Person();
        Person p4= new Person(21);
        System.out.println(p4.age);
        System.out.println("person 1 name n age\n"+p1.name+ " "+p1.age);
        System.out.println("person 2 name n age\n"+p2.name+ " "+p2.age);  
        System.out.println("person 3 name n age\n"+p3.name+ " "+p3.age);
    }

}
