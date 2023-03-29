public class Student1 extends Person1 {
    private int id;
    private double cgpa;
    public void display(String name,int age,int id,double cgpa)
    {
       this.name=name;
       this.age=age;
       this.id=id;
       this.cgpa=cgpa; 
        System.out.println("S1 info "+name+" "+age+" "+" "+cgpa+" "+id);
    }
    public static void main(String args[]) {
        Student1 s1=new Student1();

        s1.display("nazafi",21,885,4.00);
    }
}
