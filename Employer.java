public class Employer extends Employeee1{
    String name;
    int age;
    public void display(String a,int b){
        System.out.println("Person information "+a+" "+b);

    }
    public static void main(String args[])
    {
        Employer em=new Employer();
        em.display("Zerin",18);
        em.meth(100.9,30.0);
    }
}
