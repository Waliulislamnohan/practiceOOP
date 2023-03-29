

public class Sudent5 extends Person5 {
    private int id;
    private double cgpa;
    public void display(){
        System.out.println("Age is \n"+age +"Id is \n"+id+"cg is "+cgpa);
    }
    public static void main (String args[]){
        Sudent5 st=new Sudent5();
        st.id=66;
        st.cgpa=99.89;
        st.age=89;
        st.display();

    }
    
}
