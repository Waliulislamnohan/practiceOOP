public class Minus {
    int a;
    double b;
public void cal(int x,double y){
    this.a=x;
    this.b=y;
    double c=x+y;
    
    System.out.println(c);
}
public static void main(String args[]){
    
    Minus m=new Minus();
 m.cal(12,13.8);
    
}
}
