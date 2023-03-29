public class Studentt1 extends Teacher1{
    double cgpa;
    String id;
    public static void main(String args[]) {
        Studentt1 s1= new Studentt1();
        s1.name="Zerin";
        s1.age=21;
        s1.id="221-35-885";
        s1.cgpa=4.00;
        System.out.println("s1 information "+s1.name+" "+s1.cgpa+" "+s1.id+" "+s1.age);
        s1.behave();
    }

}
