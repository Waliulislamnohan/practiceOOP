public class Student {
   private String id;
   private String name;
   private double cgpa  ;
   public void insert_record(String id,String name,double cgpa)
   {
    this.id=id;
    this.name=name;
    this.cgpa=cgpa;
   }
   public void display()
   {
    System.out.println("information is "+this.id+" "+this.cgpa+" "+this.name);
   }
   public static void main(String args[])
   {
    Student std1= new Student();
    Student std2= new Student();
    std1.insert_record("221-35-885","Mashruba",4.00);
std1.display();
    
   }

}
