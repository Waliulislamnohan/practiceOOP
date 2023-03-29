public class Petrsonn {
    String name;
    int age;
    public void petrsonn(String name,int age){//did not have to store data
        
        System.out.println(name+age);
    }
    public void display(){
        System.out.println(this.name+this.age);
    }
    public static void main(String args[]){
        Petrsonn p1=new Petrsonn();
        Petrsonn p2=new Petrsonn();
        p1.petrsonn("zerin", 22);
        

    }
}
