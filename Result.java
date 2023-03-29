public class Result {
    String name;
    String id;
    double cgpa;
    public void information(String name,String b,double c)
    {
        this.name=name;
        id=b;
        cgpa=c;
    }
    public void display()
    {
        System.out.println("Information : "+ this.name + this.id + this.cgpa);
    }
    public static void main(String args [])
    {
        Result std1= new Result();
        Result std2= new Result();
        std1.information("Nazafi","221-35-885",3.89);
        std1.display();
        std2.information("Zerin","221-35-988",5.90);
        std2.display();
    }
}
