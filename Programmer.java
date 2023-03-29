
public class Programmer extends Employeee {
    float bonus;
    public static void main(String args[]) {
       Programmer p1= new Programmer();
       p1.salary= 10;
       p1.bonus=2;
       System.out.println(p1.salary +""+p1.bonus); 
       float c=p1.total(10,20);
       System.out.println(c);
    }
}
