public class Student5 extends Person5 {
    private int id;
    private double cgpa;
    public void display(){
        System.out.println("Age is "+age +"\nId is "+id+"\ncg is "+cgpa);
    }
    public static void main (String args[]){
        Student5 st=new Student5();
        st.id=66;
        st.cgpa=99.89;
        st.age=89;
        st.display();

    }
    
}
